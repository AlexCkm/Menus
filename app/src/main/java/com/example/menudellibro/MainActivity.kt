package com.example.menudellibro

import android.app.ProgressDialog.show
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.menudellibro.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        private val ID_MENU_SETTINDS = Menu.FIRST
        private val ID_GROUP_BR = Menu.FIRST
        private val ID_ELEMENTO_CHECKBOX = Menu.FIRST
        private val ID_BOTONRADIO_1 = Menu.FIRST + 1
        private val ID_BOTONRADIO_2 = Menu.FIRST + 2
        private val ID_BOTONRADIO_3 = Menu.FIRST + 3
        private var cont = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menu?.add(Menu.NONE, ID_ELEMENTO_CHECKBOX, Menu.NONE, "CheckBox")
            ?.setCheckable(true)
        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_1, Menu.NONE, "Opción 1")
        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_2, Menu.NONE, "Opción 2")
        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_3, Menu.NONE, "Opción 3")
            ?.setChecked(true)
        menu?.setGroupCheckable(ID_GROUP_BR, true, true)
        return true
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        super.onPrepareOptionsMenu(menu)
        cont++
        binding.tvContador.text.toString()
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item) //esto tiene que ser igual que en los valores
        when (item.itemId) {
            ID_MENU_SETTINDS -> {
                Snackbar.make(binding.root,"Apertura del menu", Snackbar.LENGTH_SHORT).show()
                return true
            }
            ID_BOTONRADIO_1 -> {
                Snackbar.make(binding.root, "Ha seleccionado elemento 1", Snackbar.LENGTH_SHORT).show()
                return true
            }
            ID_BOTONRADIO_2 ->{
                Snackbar.make(binding.root, "Ha seleccionado elemento 2", Snackbar.LENGTH_SHORT).show()
                return true
            }
            ID_BOTONRADIO_3 ->{
                Snackbar.make(binding.root, "Ha seleccionado elemento 3", Snackbar.LENGTH_SHORT).show()
                return true
            }
        }
        return false
    }

}

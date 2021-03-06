package com.example.applemex.listviewcars

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.molde_coche.view.*
import java.security.AccessControlContext

class MainActivity(var adapter: CochesAdapter? = null) : AppCompatActivity() {

    var listaDeCoches = ArrayList<Coche>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listaDeCoches.add(Coche(R.drawable.amar, "Ferrari Yw", "Coche muy veloz", "Precio $350", true))
        listaDeCoches.add(Coche(R.drawable.autosdeportivos, "Convertible", "Coche para climas calidos", "Precio $450", true))
        listaDeCoches.add(Coche(R.drawable.blue, "Ferrari Azul", "Increible diseño", "Precio $550", false))
        listaDeCoches.add(Coche(R.drawable.gris, "Deportivo Gris", "Aptop para familias", "Precio $250", true))
        listaDeCoches.add(Coche(R.drawable.camaron, "Maserati", "Coche muy veloz", "Precio $350", false))
        listaDeCoches.add(Coche(R.drawable.negro, "Porsche", "Coche muy veloz", "Precio $250", false))
        listaDeCoches.add(Coche(R.drawable.red, "Mustang Rojo", "Coche ultra veloz y comodo", "Precio $650", true))

        adapter = CochesAdapter(this, listaDeCoches)
        gridView.adapter = adapter

    }

}

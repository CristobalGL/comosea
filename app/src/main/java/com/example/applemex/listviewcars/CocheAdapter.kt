package com.example.applemex.listviewcars

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.molde_coche.view.*

class CochesAdapter(contexto: Context, var listaDeCoches: ArrayList<Coche>): BaseAdapter(){

    var contexto: Context? = contexto

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val coche = listaDeCoches[position]
        if(coche.venta == true){
            val inflater = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val miVista = inflater.inflate(R.layout.molde_coche_gris, null)
            miVista.imageView.setImageResource(coche.imagen!!)
            miVista.textViewTitulo.text = coche.titulo!!
            miVista.textViewDescripcion.text = coche.descripcion!!
            miVista.textViewPrecio.text = coche.precio!!.toString()
            miVista.imageView.setOnClickListener{
                val intent = Intent(contexto, CocheActivity::class.java)
                intent.putExtra("titulo", coche.titulo)
                intent.putExtra("descripcion", coche.descripcion)
                intent.putExtra("precio", coche.precio!!)
                intent.putExtra("imagen", coche.imagen!!)
                contexto!!.startActivity(intent)

            }
            return miVista
        }else{
            val inflater = contexto!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val miVista = inflater.inflate(R.layout.molde_venta_grid, null)
            miVista.imageView.setImageResource(coche.imagen!!)
            miVista.textViewTitulo.text = coche.titulo!!
            miVista.textViewDescripcion.text = coche.descripcion!!
            miVista.textViewPrecio.text = coche.precio!!.toString()
            miVista.imageView.setOnClickListener{
                val intent = Intent(contexto, VentaActivity::class.java)
                intent.putExtra("titulo", coche.titulo)
                intent.putExtra("descripcion", coche.descripcion)
                intent.putExtra("precio", coche.precio!!)
                intent.putExtra("imagen", coche.imagen!!)
                contexto!!.startActivity(intent)

            }
            return miVista
        }
    }

    override fun getItem(position: Int): Any {
        return listaDeCoches[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return listaDeCoches.size
    }

}
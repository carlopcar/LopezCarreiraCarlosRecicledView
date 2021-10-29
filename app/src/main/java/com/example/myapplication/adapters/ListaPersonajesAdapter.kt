package com.example.myapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.entities.Personaje

class ListaPersonajesAdapter(val personajes: List<Personaje>) : RecyclerView.Adapter<ListaPersonajesAdapter.PersonajesViewHolder>() {

    //Adapter: tres métodos y clase ViewHolder
    class PersonajesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val tvNombreCompleto = itemView.findViewById<TextView>(R.id.tvNombreCompleto)
        val tvTitulo = itemView.findViewById<TextView>(R.id.tvTitulo)
        val tvFamilia = itemView.findViewById<TextView>(R.id.tvFamilia)
        val ivFoto = itemView.findViewById<ImageView>(R.id.ivFoto)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonajesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(R.layout.item_personaje, parent, false)

        return PersonajesViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: PersonajesViewHolder, position: Int) {
        val personaje = personajes.get(position)

        holder.tvNombreCompleto.setText(personaje.getNombreCompleto())
        holder.tvFamilia.setText(personaje.familia)
        holder.tvTitulo.setText(personaje.titulo)
    }

    override fun getItemCount(): Int {
        return personajes.size
    }


}
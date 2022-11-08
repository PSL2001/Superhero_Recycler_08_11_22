package com.example.superhero_recycler_08_11_22.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superhero_recycler_08_11_22.R
import com.example.superhero_recycler_08_11_22.models.SuperheroModel

class SuperHeroAdapter(private val lista: MutableList<SuperheroModel>): RecyclerView.Adapter<SuperHeroViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperHeroViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.superhero_layout, parent, false)
        return SuperHeroViewHolder(v)
    }

    override fun onBindViewHolder(holder: SuperHeroViewHolder, position: Int) {
        val superHeroe = lista[position]
        holder.render(superHeroe)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

}
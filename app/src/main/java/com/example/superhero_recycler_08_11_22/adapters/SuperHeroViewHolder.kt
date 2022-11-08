package com.example.superhero_recycler_08_11_22.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.superhero_recycler_08_11_22.databinding.SuperheroLayoutBinding
import com.example.superhero_recycler_08_11_22.models.SuperheroModel

class SuperHeroViewHolder(v: View): RecyclerView.ViewHolder(v) {
    //Asi se trabaja con un recycler view
    private val binding = SuperheroLayoutBinding.bind(v)

    fun render(superHeroe: SuperheroModel){
        binding.tvNombre.text = superHeroe.nombre
        binding.tvDescripcion.text = superHeroe.descripcion
        binding.ivSuperhero.setImageResource(superHeroe.imagen)
    }
}

package com.example.superhero_recycler_08_11_22.adapters

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.superhero_recycler_08_11_22.databinding.SuperheroLayoutBinding
import com.example.superhero_recycler_08_11_22.models.SuperheroModel

class SuperHeroViewHolder(v: View): RecyclerView.ViewHolder(v) {
    //Asi se trabaja con un recycler view
    private val binding = SuperheroLayoutBinding.bind(v)

    fun render(superHeroe: SuperheroModel) {
        binding.tvNombre.text = superHeroe.nombre
        binding.tvDescripcion.text = superHeroe.descripcion
        binding.ivSuperhero.setImageResource(superHeroe.imagen)
        //Itemview afecta a todo el contexto
        //Para que afecte a solo la imagen cambiamos el itemview por binding.ivSuperhero
        itemView.setOnClickListener {
            Toast.makeText(binding.tvNombre.context, superHeroe.nombre, Toast.LENGTH_SHORT).show()
        }
    }
}

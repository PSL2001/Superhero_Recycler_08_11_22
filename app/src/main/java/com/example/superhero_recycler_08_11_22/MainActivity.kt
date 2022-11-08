package com.example.superhero_recycler_08_11_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superhero_recycler_08_11_22.adapters.SuperHeroAdapter
import com.example.superhero_recycler_08_11_22.databinding.ActivityMainBinding
import com.example.superhero_recycler_08_11_22.providers.SuperHeroProvider

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setRecycler()
    }

    private fun setRecycler() {
        //Los recyclers necesetian un layout manager y un adapter
        val layoutManager = LinearLayoutManager(this)
        binding.rvView.layoutManager = layoutManager
        val adapter = SuperHeroAdapter(SuperHeroProvider.lista)
        binding.rvView.adapter = adapter
    }
}
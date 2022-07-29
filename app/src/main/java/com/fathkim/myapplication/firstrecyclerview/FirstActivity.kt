package com.fathkim.myapplication.firstrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.fathkim.myapplication.R
import com.fathkim.myapplication.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animalList = AnimalModel(this).getAnimalList()
        binding.recyclerView.adapter = AnimalAdapter(animalList)
    }
}
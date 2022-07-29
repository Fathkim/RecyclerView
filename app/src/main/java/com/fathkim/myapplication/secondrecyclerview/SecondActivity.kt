package com.fathkim.myapplication.secondrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fathkim.myapplication.R
import com.fathkim.myapplication.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showRecyclerList()
    }

    private fun showRecyclerList() {
        binding.recyclerView2.apply {
            layoutManager = LinearLayoutManager(this@SecondActivity)
            adapter = ProfilAdapter(ProfilData.listProfil)
        }
    }

}
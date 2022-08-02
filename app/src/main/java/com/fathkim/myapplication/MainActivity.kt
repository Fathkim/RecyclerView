package com.fathkim.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fathkim.myapplication.databinding.ActivityFirstBinding
import com.fathkim.myapplication.databinding.ActivityMainBinding
import com.fathkim.myapplication.firstrecyclerview.FirstActivity
import com.fathkim.myapplication.forthrecyclerview.FourtActivity
import com.fathkim.myapplication.secondrecyclerview.SecondActivity
import com.fathkim.myapplication.thirdrecyclerview.ThirdActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firtsRecyclerView.setOnClickListener{
            val intent = Intent(this,FirstActivity::class.java)
            startActivity(intent)
        }
        binding.secondRecyclerView.setOnClickListener{
            startActivity(Intent(this, SecondActivity::class.java))
        }

        binding.thirdRecyclerView.setOnClickListener{
            startActivity(Intent(this, ThirdActivity::class.java))
        }

        binding.fourtRecyclerView.setOnClickListener {
            startActivity(Intent(this, FourtActivity::class.java))
        }
    }

}
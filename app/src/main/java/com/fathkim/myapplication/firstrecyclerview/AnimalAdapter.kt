package com.fathkim.myapplication.firstrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fathkim.myapplication.databinding.ItemAnimalBinding
import com.fathkim.myapplication.databinding.ItemProfilBinding

class AnimalAdapter(private val animalList: Array<String>) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {

    inner class AnimalViewHolder(private val itemBinding: ItemAnimalBinding): RecyclerView.ViewHolder(itemBinding.root){
        fun bind(word: String){
            itemBinding.animalText.text = word
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val itemBinding = ItemAnimalBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AnimalViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val word = animalList[position]
        holder.bind(word)
    }

    override fun getItemCount(): Int {
        return animalList.size
    }
}

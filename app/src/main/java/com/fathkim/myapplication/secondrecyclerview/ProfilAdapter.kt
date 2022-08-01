package com.fathkim.myapplication.secondrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fathkim.myapplication.databinding.ItemProfilBinding

class ProfilAdapter(private val profilList: List<Profil> ) : RecyclerView.Adapter<ProfilAdapter.ProfilViewHolder>() {
     inner class ProfilViewHolder(val binding: ItemProfilBinding) : RecyclerView.ViewHolder(binding.root){

     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ProfilViewHolder (
          ItemProfilBinding.inflate(LayoutInflater.from(parent.context), parent, false)
     )

     override fun onBindViewHolder(holder: ProfilViewHolder, position: Int) {
          val profil = profilList[position]

          Glide.with(holder.itemView)
               .load(profil.image)
               .into(holder.binding.image)
          holder.binding.textItem.text = profil.desc

     }

     override fun getItemCount(): Int {
          return profilList.size
     }
}
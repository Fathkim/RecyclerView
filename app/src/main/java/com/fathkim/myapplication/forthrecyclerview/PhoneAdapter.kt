package com.fathkim.myapplication.forthrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fathkim.myapplication.databinding.ActivityThirdBinding
import com.fathkim.myapplication.databinding.ItemPhoneBinding
import com.fathkim.myapplication.forthrecyclerview.retrofit.DataItem
import com.fathkim.myapplication.forthrecyclerview.retrofit.SpecPhoneResponse
import java.lang.StringBuilder

class PhoneAdapter() : RecyclerView.Adapter<PhoneAdapter.MyViewHolder>() {
    private var listNewPhone = ArrayList<DataItem>()

    fun setData(data: List<DataItem>?) {
        if (data == null) return
        listNewPhone.clear()
        listNewPhone.addAll(data)
    }

    class MyViewHolder(val binding: ItemPhoneBinding) :
            RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =  MyViewHolder (
        ItemPhoneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = listNewPhone[position]
        holder.binding.apply {
            val spilittedData = data.brandSlug?.substring(5, data.brandSlug.length)?.split("_")?.toTypedArray()
            val capitalizedData = spilittedData?.map {
                it.capitalize()
            }
            val joinedData = capitalizedData?.joinTo(StringBuilder(), separator = " ")

            tvTitle.text = listNewPhone[position].brandName


        }
    }

    override fun getItemCount(): Int = listNewPhone.size
}
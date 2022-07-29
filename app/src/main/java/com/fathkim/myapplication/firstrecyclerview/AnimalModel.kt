package com.fathkim.myapplication.firstrecyclerview

import android.content.Context
import com.fathkim.myapplication.R

class AnimalModel(val context: Context) {
    fun getAnimalList(): Array<String>{
        return context.resources.getStringArray(R.array.animalList)
    }
}
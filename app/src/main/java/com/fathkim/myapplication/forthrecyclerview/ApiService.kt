package com.fathkim.myapplication.forthrecyclerview

import com.fathkim.myapplication.forthrecyclerview.retrofit.SpecPhoneResponse
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface ApiService {

    @GET("brands")
    fun getSpecPhone(): Flowable<SpecPhoneResponse>
}
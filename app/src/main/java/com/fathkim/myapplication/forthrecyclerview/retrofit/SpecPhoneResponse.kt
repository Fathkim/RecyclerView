package com.fathkim.myapplication.forthrecyclerview.retrofit

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SpecPhoneResponse(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
) : Parcelable

@Parcelize
data class DataItem(

	@field:SerializedName("brand_slug")
	val brandSlug: String? = null,

	@field:SerializedName("brand_name")
	val brandName: String? = null,

	@field:SerializedName("detail")
	val detail: String? = null,

	@field:SerializedName("device_count")
	val deviceCount: Int? = null,

	@field:SerializedName("brand_id")
	val brandId: Int? = null
) : Parcelable

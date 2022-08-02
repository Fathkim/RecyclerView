package com.fathkim.myapplication.forthrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.LinearLayoutManager
import com.fathkim.myapplication.databinding.ActivityFourtBinding
import com.fathkim.myapplication.forthrecyclerview.retrofit.DataItem
import com.fathkim.myapplication.forthrecyclerview.retrofit.SpecPhoneResponse
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class FourtActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFourtBinding
    private val apiService  = ApiClient.getApiService()
    var newData = MutableLiveData<SpecPhoneResponse>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourtBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getdetail()
        newData.observe(this){
            setUpRecyclerView(it.data as List<DataItem>)
        }
    }

    private fun setUpRecyclerView(data: List<DataItem>){
        binding.fourtRecyclerView.apply {
            val mAdapter = PhoneAdapter()
            layoutManager = LinearLayoutManager(context)
            mAdapter.setData(data as List<DataItem>)
            adapter = mAdapter
        }

    }

    private fun getDataPhone(responseHandler: (SpecPhoneResponse) -> Unit, errorHandler: (Throwable) -> Unit)
    {
        apiService.getSpecPhone()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                responseHandler(it)
            },{
                errorHandler(it)
            })

    }

    fun getdetail(){
        getDataPhone({
            newData.value = it
        },{

        })
    }

}
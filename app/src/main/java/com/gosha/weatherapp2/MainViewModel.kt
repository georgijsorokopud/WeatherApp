package com.gosha.weatherapp2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gosha.weatherapp2.adapters.WeatherModel

class MainViewModel: ViewModel() {
    val lifeDataCurrent = MutableLiveData<WeatherModel>()
    val lifeDataList = MutableLiveData<List<WeatherModel>>()
}
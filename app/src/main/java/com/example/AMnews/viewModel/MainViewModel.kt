package com.example.AMnews.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.AMnews.Models.Post
import com.example.AMnews.repo.Repo
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val repository: Repo) : ViewModel() {

    val myresponse: MutableLiveData<Response<Post>> = MutableLiveData()

    fun getPost(country: String, apiKey: String) {
        viewModelScope.launch {
            val resp = repository.getPost(country, apiKey)
            myresponse.value = resp
        }
    }
}

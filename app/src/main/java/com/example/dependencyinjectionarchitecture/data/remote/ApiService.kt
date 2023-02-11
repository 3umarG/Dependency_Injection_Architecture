package com.example.dependencyinjectionarchitecture.data.remote

import retrofit2.http.GET

interface ApiService {

    @GET("todos")
    suspend fun getNetworkCall()
}
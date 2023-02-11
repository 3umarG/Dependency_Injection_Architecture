package com.example.dependencyinjectionarchitecture.data.remote

import retrofit2.http.GET

interface ApiService {

    @GET("test")
    suspend fun getNetworkCall()
}
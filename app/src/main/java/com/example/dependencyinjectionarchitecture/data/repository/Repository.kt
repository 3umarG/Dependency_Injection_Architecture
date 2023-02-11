package com.example.dependencyinjectionarchitecture.data.repository

interface Repository {
    suspend fun doNetworkCall()
}
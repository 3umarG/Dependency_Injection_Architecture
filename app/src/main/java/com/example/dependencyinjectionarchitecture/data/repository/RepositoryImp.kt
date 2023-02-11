package com.example.dependencyinjectionarchitecture.data.repository

import com.example.dependencyinjectionarchitecture.data.remote.ApiService

class RepositoryImp(
    private val api : ApiService
) : Repository  {
    override suspend fun doNetworkCall() {
        // TODO: Do your network call here ...
    }
}
package com.example.dependencyinjectionarchitecture.data.repository

import android.app.Application
import android.util.Log
import com.example.dependencyinjectionarchitecture.R
import com.example.dependencyinjectionarchitecture.data.remote.ApiService

class RepositoryImp(
    private val api : ApiService,
    private val applicationContext : Application
) : Repository  {
    init {
        val name = applicationContext.getString(R.string.app_name)
        println("HELLO ::: App Name is : $name")
        Log.d("AAAA",name)
    }
    override suspend fun doNetworkCall() {
        // TODO: Do your network call here ...
    }
}
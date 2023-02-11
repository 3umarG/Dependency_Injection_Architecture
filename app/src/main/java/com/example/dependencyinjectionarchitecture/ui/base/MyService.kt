package com.example.dependencyinjectionarchitecture.ui.base

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.example.dependencyinjectionarchitecture.data.repository.Repository
import javax.inject.Inject

/***
 * We want to inject Repository inside this Service
 * but we can't do  that by using @Inject constructor() because of we don't use Constructor
 * when we initialize the Service
 *
 * So ===> we use @Inject for Field like variable
 */
class MyService : Service() {

    @Inject
    private lateinit var repo: Repository

    override fun onCreate() {
        super.onCreate()

//        repo.doNetworkCall()

    }

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }
}
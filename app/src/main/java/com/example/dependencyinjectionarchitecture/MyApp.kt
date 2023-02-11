package com.example.dependencyinjectionarchitecture

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * To make dagger able to use Application Component and Resources like ApplicationContext to inject
 * it when we need .
 *
 * Make sure you add this to Manifest File.
 * */
@HiltAndroidApp
class MyApp : Application()
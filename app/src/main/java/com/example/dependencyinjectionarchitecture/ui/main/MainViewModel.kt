package com.example.dependencyinjectionarchitecture.ui.main

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionarchitecture.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * To Inject a Repository inside ViewModel we need to ...
 * Tell the Dagger that it is the ViewModel by add [ @HiltViewModel ]
 * Then we need to inject the dependencies inside the constructor by adding :[ @Inject constructor ]
 *
 *
 *  After this Staff the Hilt go to the App Module and search for any provider ...
 *  that provide the Repository Dependency ...
 *
 *
 *  So Lets go to Module to implement the provider ...
 * */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: Repository
) : ViewModel() {
}
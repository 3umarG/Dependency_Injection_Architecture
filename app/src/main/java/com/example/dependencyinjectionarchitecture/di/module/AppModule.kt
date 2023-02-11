package com.example.dependencyinjectionarchitecture.di.module

import android.app.Application
import com.example.dependencyinjectionarchitecture.data.remote.ApiService
import com.example.dependencyinjectionarchitecture.data.repository.Repository
import com.example.dependencyinjectionarchitecture.data.repository.RepositoryImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton


/**
 * Module : Provide all dependencies or components that my app or classes need to work
 * ex: Repository depends on ApiService & DAO , so I should provide ApiService and DAO from this module
 *
 * Module should Annotate two things :
 *  1- @Module ===> to tell dagger that is Module and all background stuff for us.
 *  2- @InstallIn(...) ===> to determine the module life time for providing its dependencies.
 *    - SingletonComponent ===> this module will live as the whole app live.
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /**
     * I will put inside the module all providers that provide my dependencies .
     * such as : ApiService - DAO
     *
     *
     * every Provider should annotate with two things :
     *   1- [ @Provides ] ===> to tell the module that is provider.
     *   2- [ @Singleton ] ===> that make the provider : ApiService call one time despite of number
     *   of times it injected.
     *   ** if three repositories have three ApiServices and use this Module it will create only one ApiService Provider.
     *
     */

    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .build()
            .create(ApiService::class.java)
    }

    /**
     * There I Create Repository Provider to provide the repository dependency.
     * That provider CONSUME the api service provider from this Module.
     * */
    @Provides
    @Singleton
    fun provideRepository(apiService: ApiService , app : Application): Repository {
        return RepositoryImp(apiService , app)
    }
}
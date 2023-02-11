package com.example.dependencyinjectionarchitecture.di.module

import com.example.dependencyinjectionarchitecture.data.repository.Repository
import com.example.dependencyinjectionarchitecture.data.repository.RepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    /***
     * That way is used for inject abstract or interface
     * using [ @Binds ] instead of [ @Provides ]
     */
    @Binds
    @Singleton
    abstract fun bindRepository(
        repositoryImp: RepositoryImp
    ): Repository
}
package com.hilt.demo.scope

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@InstallIn(ActivityComponent::class)
@Module
object AppModule3 {

    @ActivityScoped
    @Provides
    fun providerTarget():Target5{
        return Target5()
    }
}
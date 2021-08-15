package com.hilt.demo.abs

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object AppModule2 {

    @Provides
    fun providerISimpleImpl(): ISimpleImpl {
        return ISimpleImpl()
    }

    @Provides
    fun providerAbsSimpleImpl(): AbsSimpleImpl {
        return AbsSimpleImpl()
    }
}
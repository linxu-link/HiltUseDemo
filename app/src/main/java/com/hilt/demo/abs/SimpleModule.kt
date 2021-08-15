package com.hilt.demo.abs

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
abstract class SimpleModule {

    @Binds
    abstract fun providerISimple(impl: ISimpleImpl): ISimple

    @Binds
    abstract fun providerAbsSimple(impl: AbsSimpleImpl): AbsSimple

}
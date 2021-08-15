package com.hilt.demo.multi

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
object AppModule2 {

    @TargetType1
    @Provides
    fun providerTarget4Type1(): Target4 {
        return Target4();
    }

    @TargetType2
    @Provides
    fun providerTarget4Type2(): Target4 {
        return Target4();
    }
}
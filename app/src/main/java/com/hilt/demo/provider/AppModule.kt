package com.hilt.demo.provider

import android.app.Activity
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@InstallIn(ActivityComponent::class)
@Module
object AppModule {

    @Provides
    fun providerTarget3(): Target3 {
        val target = Target3.Builder()
            .setStr("str")
            .build()
        return target
    }

    @Provides
    fun providerTarget2(
        @ApplicationContext context: Context,
        activity: Activity,
        target3: Target3
    ): Target2 {
        return Target2(context, activity, target3)
    }

}
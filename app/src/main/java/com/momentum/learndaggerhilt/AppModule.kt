package com.momentum.learndaggerhilt

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    @Named("FN")
    fun getFirstName(): String{
        return "Ahmed"
    }


    @Singleton
    @Provides
    @Named("SN")
    fun getSecondName(@ApplicationContext context: Context): String{
        return context.getString(R.string.last_name)
    }

}
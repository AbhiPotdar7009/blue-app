package com.example.blue_app.di.module

import android.content.Context
import com.example.blue_app.domain.usecase.GetListItemsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideUseCase(
        @ApplicationContext context: Context
    ): GetListItemsUseCase = GetListItemsUseCase(context)

}
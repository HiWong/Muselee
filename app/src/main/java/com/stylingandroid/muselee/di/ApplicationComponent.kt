package com.stylingandroid.muselee.di

import com.stylingandroid.muselee.MuseleeApplication
import com.stylingandroid.muselee.topartists.di.TopArtistsModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ApplicationModule::class,
        ActivityModule::class,
        TopArtistsModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<MuseleeApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<MuseleeApplication>()
}

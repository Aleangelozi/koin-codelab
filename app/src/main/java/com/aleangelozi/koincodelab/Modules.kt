package com.aleangelozi.koincodelab

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // Defines a singleton of SchoolCourse
    single { SchoolCourse() }

    // Defines s factory(creates a new instance every time)
    factory { Friend() }

    // Defines s factory(creates a new instance every time)
    factory { Student(get(), get()) }
}

val viewModelModule = module {
    viewModel { MainViewModel(get(), get()) }
}
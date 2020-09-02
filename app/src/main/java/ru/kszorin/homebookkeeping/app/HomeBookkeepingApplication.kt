package ru.kszorin.homebookkeeping.app

import android.app.Application
import ru.kszorin.homebookkeeping.app.di.DaggerApplicationComponent

class HomeBookkeepingApplication: Application() {

    val appComponent = DaggerApplicationComponent.create()
}
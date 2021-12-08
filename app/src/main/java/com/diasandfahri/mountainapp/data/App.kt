package com.diasandfahri.mountainapp.data

import android.app.Application
import android.content.res.Resources

class App : Application() {
    companion object {
        lateinit var instance: Application
        lateinit var res: Resources
    }
    override fun onCreate() {
        super.onCreate()
        instance = this
        res = resources
    }
}
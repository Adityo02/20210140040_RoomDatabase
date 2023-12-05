package com.example.roomsiswa

import android.app.Application
import com.example.roomsiswa.repositori.ContainerDataAPP

class AplikasiSiswa: Application() {
    lateinit var container: ContainerDataAPP

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataAPP(this)
    }
}
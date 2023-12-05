package com.example.roomsiswa.repositori

import android.content.Context
import com.example.roomsiswa.data.DatabaseSiswa

interface ContaierAPP {
    val repositoriSiswa : RepositoriSiswa
}

class ContainerDataAPP(private val context: Context): ContaierAPP{
    override val repositoriSiswa: RepositoriSiswa by lazy {
        OfflineRepositoriSiswa(DatabaseSiswa.getDatabase(context).siswaDao())
    }
}
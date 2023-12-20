package com.mahipal.ipc.server

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.mahipal.ipc.aidl.IMyAidlInterface

class ServerService : Service() {

    private val service = object : IMyAidlInterface.Stub() {
        override fun getResponse(): String {
            return "{ \"Key\" : \"Hi, AIDL!\"}"
        }
    }

    override fun onBind(p0: Intent?): IBinder {
        return service
    }
}
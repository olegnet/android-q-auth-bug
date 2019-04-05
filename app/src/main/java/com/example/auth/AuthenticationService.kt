package com.example.auth

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AuthenticationService : Service() {

    override fun onBind(intent: Intent): IBinder? {
        return Authenticator(applicationContext).iBinder
    }
}

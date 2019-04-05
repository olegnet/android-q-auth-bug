package com.example.auth

import android.accounts.Account
import android.accounts.AccountManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.application_name).text = application.packageName
    }

    override fun onResume() {
        super.onResume()

        AccountManager.get(this)
            .addAccountExplicitly(Account("test-user", getString(R.string.account_type)), "test-token", Bundle.EMPTY)
    }
}

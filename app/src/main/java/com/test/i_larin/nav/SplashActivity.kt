package com.test.i_larin.nav

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.test.i_larin.router.Feature2Modules
import com.test.i_larin.router.Module
import com.test.i_larin.router.Module.Companion.init


class SplashActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init(Router())
        Module.Companion
                .getRouter()
                .handle(this, Feature2Modules(1))


    }
}

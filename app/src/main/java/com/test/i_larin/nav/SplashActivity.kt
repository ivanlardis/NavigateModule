package com.test.i_larin.nav

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.i_larin.router.Feature1Modules
import com.test.i_larin.router.IRouter
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var iRouter: IRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        iRouter.handle(Feature1Modules(5))
    }
}

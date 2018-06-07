package com.test.i_larin.feature2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.i_larin.feature2.R.id.button1
import com.test.i_larin.router.Feature1Modules
import com.test.i_larin.router.Feature2Modules
import com.test.i_larin.router.IRouter
import com.test.i_larin.router.Module
import kotlinx.android.synthetic.main.activity_feature2.*
import org.jetbrains.anko.sdk25.coroutines.onClick

import javax.inject.Inject

class Feature2Activity : AppCompatActivity() {
    @Inject
    lateinit var iRouter: IRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature2)
        iRouter= Module.Companion.getRouter()
        button1.onClick {
            iRouter.handle(this@Feature2Activity, Feature1Modules(1))
        }
    }
}

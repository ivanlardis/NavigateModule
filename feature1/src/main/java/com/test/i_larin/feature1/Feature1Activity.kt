package com.test.i_larin.feature1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.test.i_larin.router.Feature2Modules
import com.test.i_larin.router.IRouter
import com.test.i_larin.router.Module
import kotlinx.android.synthetic.main.activity_feature1.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import javax.inject.Inject

class Feature1Activity : AppCompatActivity() {

    lateinit var iRouter: IRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature1)
        iRouter= Module.Companion.getRouter()
        button21.onClick {

            iRouter.handle(this@Feature1Activity, Feature2Modules(1))

        }
    }
}

package com.test.i_larin.feature1

import android.support.v7.app.AppCompatActivity
import com.test.i_larin.router.Feature1Modules
import com.test.i_larin.router.IRouter
import com.test.i_larin.router.Modules
import com.test.i_larin.router.ModulesInfo
import org.jetbrains.anko.startActivity

class Feature1Info : ModulesInfo {
    override fun getRouter() = object : IRouter {
        override fun handle(appCompatActivity: AppCompatActivity, modules: Modules): Boolean {
            if (modules is Feature1Modules) {
                appCompatActivity.startActivity<Feature1Activity>()
                return true
            }
            return false
        }

    }


}

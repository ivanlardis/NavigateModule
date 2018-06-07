package com.test.i_larin.feature2

import android.support.v7.app.AppCompatActivity
import com.test.i_larin.router.Feature2Modules
import com.test.i_larin.router.IRouter
import com.test.i_larin.router.Modules
import com.test.i_larin.router.ModulesInfo
import org.jetbrains.anko.startActivity

class Feature2Info : ModulesInfo {
    override fun getRouter() = object : IRouter {
        override fun handle(appCompatActivity: AppCompatActivity, modules: Modules): Boolean {
            if (modules is Feature2Modules) {
                appCompatActivity.startActivity<Feature2Activity>()
                return true
            }
            return false
        }

    }
}
package com.test.i_larin.nav

import android.support.v4.app.ActivityCompat
import android.support.v7.app.AppCompatActivity
import com.test.i_larin.feature1.Feature1Info
import com.test.i_larin.feature2.Feature2Info
import com.test.i_larin.router.IRouter
import com.test.i_larin.router.Modules
import com.test.i_larin.router.ModulesInfo

class Router : IRouter {
    override fun handle(appCompatActivity: AppCompatActivity, modules: Modules): Boolean {

        for (modulesInfo in getListModulesInfo()) {
            if (modulesInfo.getRouter().handle(appCompatActivity, modules)) {
                return true
            }
        }
        return false
    }


    fun getListModulesInfo() = listOf<ModulesInfo>(
            Feature1Info(),
            Feature2Info())

}
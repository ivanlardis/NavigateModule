package com.test.i_larin.router

import android.support.v7.app.AppCompatActivity

class Module() {
    companion object {
        lateinit var iRouter: IRouter

        fun init(router: IRouter) {
            iRouter = router
        }

        fun getRouter() = iRouter
    }

}


interface IRouter {
    fun handle(appCompatActivity: AppCompatActivity, modules: Modules): Boolean
}

sealed class Modules
class Feature1Modules(var count: Int) : Modules()
class Feature2Modules(var count: Int) : Modules()


interface ModulesInfo {
    fun getRouter(): IRouter
}
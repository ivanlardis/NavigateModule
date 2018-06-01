package com.test.i_larin.router

import android.support.v7.app.AppCompatActivity


interface IRouter {
    fun AppCompatActivity.handle(modules: Modules): Boolean
}

sealed class Modules
class Feature1Modules(var count: Int) : Modules()
class Feature2Modules(var count: Int) : Modules()
class Feature3Modules(var count: Int) : Modules()

interface ModulesInfo{

    fun getRouter():IRouter
}
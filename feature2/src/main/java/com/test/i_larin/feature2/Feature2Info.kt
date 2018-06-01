package com.test.i_larin.feature2

import com.test.i_larin.router.IRouter
import com.test.i_larin.router.ModulesInfo

class Feature2Info : ModulesInfo {
    override fun getRouter() =Feature2Router()
}
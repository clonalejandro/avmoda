package io.clonalejandro.avmoda.animations

import android.graphics.drawable.AnimationDrawable
import android.view.View

import io.clonalejandro.avmoda.R.id.splash_layout
import io.clonalejandro.avmoda.SplashScreen

import kotlin.properties.Delegates

/**
 * Created by alejandrorioscalera
 * On 18/8/18
 *
 * -- SOCIAL NETWORKS --
 *
 * GitHub: https://github.com/clonalejandro or @clonalejandro
 * Website: https://clonalejandro.me/
 * Twitter: https://twitter.com/clonalejandro11/ or @clonalejandro11
 * Keybase: https://keybase.io/clonalejandro/
 *
 * -- LICENSE --
 *
 * All rights reserved for clonalejandro ©AVModa 2017 / 2018
 */

class SplashAnimation(splashScreen: SplashScreen) {


    /** SMALL CONSTRUCTORS **/

    private var splashScreen: SplashScreen by Delegates.notNull()

    init {
        this.splashScreen = splashScreen
        backgroundAnimation()
    }


    /** OTHERS **/

    /**
     * This function start the linear gradient animation in the background
     */
    private fun backgroundAnimation(){
        val view: View = splashScreen.findViewById(splash_layout)
        val animationDrawable: AnimationDrawable = view.background as AnimationDrawable

        animationDrawable.setEnterFadeDuration(2000)
        animationDrawable.setExitFadeDuration(4000)
        animationDrawable.start()
    }


}
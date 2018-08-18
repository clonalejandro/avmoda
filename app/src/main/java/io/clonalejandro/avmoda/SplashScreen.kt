package io.clonalejandro.avmoda

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import io.clonalejandro.avmoda.animations.SplashAnimation
import io.clonalejandro.avmoda.tasks.SplashTask

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

class SplashScreen : AppCompatActivity() {


    /** REST **/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        SplashAnimation(this)
        SplashTask(this, Intent(applicationContext, MainActivity::class.java))
    }


}

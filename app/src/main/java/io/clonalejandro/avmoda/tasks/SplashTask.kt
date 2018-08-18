package io.clonalejandro.avmoda.tasks

import android.content.Intent
import io.clonalejandro.avmoda.SplashScreen
import java.util.*
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

class SplashTask(splashScreen: SplashScreen, intent: Intent) : TimerTask() {


    /** SMALL CONSTRUCTORS **/

    private val time: Long = 1200L
    private var splashScreen: SplashScreen by Delegates.notNull()
    private var intent: Intent by Delegates.notNull()

    init {
        this.splashScreen = splashScreen
        this.intent = intent
        Timer().schedule(this, time)
    }


    /** REST **/

    /**
     * This function be executed while task finish the countdown
     */
    override fun run() {
        splashScreen.startActivity(intent)
        splashScreen.finish()
    }


}
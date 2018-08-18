package io.clonalejandro.avmoda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import io.clonalejandro.avmoda.utils.WebVieu

import kotlinx.android.synthetic.main.activity_main.*

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

class MainActivity : AppCompatActivity() {


    /** REST **/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WebVieu("https://shop.spreadshirt.es/avmoda", webview)
    }


}

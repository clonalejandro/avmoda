package io.clonalejandro.avmoda.utils

import android.annotation.SuppressLint
import android.net.Uri
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

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

class WebVieu(url: String, webView: WebView) {


    /** SMALL CONSTRUCTORS **/

    private var url: String by Delegates.notNull()
    private var webView: WebView by Delegates.notNull()

    init {
        this.url = url
        this.webView = webView

        loadWeb()
    }


    /** REST **/

    /**
     * This function returns the webview component
     * @return WebView
     */
    fun WebView() : WebView {
        return webView
    }


    /** OTHERS **/

    /**
     * This function build the WebView class with the configurations
     */
    @SuppressLint("SetJavaScriptEnabled")
    private fun buildWebView(){
        val settings: WebSettings = webView.settings

        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?) : Boolean {
                view?.loadUrl(request?.url.toString())
                return true
            }
        }

        settings.domStorageEnabled = true
        settings.javaScriptEnabled = true
        settings.allowFileAccess = true
        settings.allowFileAccess = true
    }


    /**
     * This function load the web with other functions
     */
    private fun loadWeb(){
        try {
            buildWebView()
            webView.loadUrl( this.url )
        }
        catch (e : UnsupportedOperationException){ e.printStackTrace() }
    }


}
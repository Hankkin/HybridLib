package com.hankkin.hybridlib

import android.webkit.WebView

abstract class BaseWidget {
    var bean: Any? = null
    abstract fun parseParams(params: String)
    abstract fun dealActionInUi(webView: WebView)
}
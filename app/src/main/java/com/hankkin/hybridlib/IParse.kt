package com.hankkin.hybridlib

import android.webkit.WebView

/**
 * @author Hankkin
 * @date 2019-05-16
 */
interface IParse {
     fun parseUri(uri: String?)

     fun dealActionInUi(webView: WebView)
}
package com.hankkin.hybridlib

import android.util.Log
import android.webkit.WebView

/**
 * @author Hankkin
 * @date 2019-05-16
 */
class GjUriParse : BaseUriParse() {

    override fun dealActionInUi(webView: WebView) {
        super.dealActionInUi(webView)
    }

    override fun parseUri(uri: String?) {
        super.parseUri(uri)
        Log.e("Hankkin",uri)
    }

}
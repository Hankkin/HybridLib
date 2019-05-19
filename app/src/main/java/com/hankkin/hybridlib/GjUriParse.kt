package com.hankkin.hybridlib

import android.webkit.WebView

/**
 * @author Hankkin
 * @date 2019-05-16
 */
class GjUriParse : BaseUriParse() {


    override fun parseUri(uri: String?, webView: WebView) {
        super.parseUri(uri,webView)
        var path = uri?.substringAfter(Hybrid.jsKey+"/")
        val action = path?.substringBefore("?")
        val params = path?.substringAfter("?params=")
        val widget = action?.let { matchWidget(it) }
        params?.let { widget?.parseParams(it) }
        widget?.dealActionInUi(webView)
    }

}
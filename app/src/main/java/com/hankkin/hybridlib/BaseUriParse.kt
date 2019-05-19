package com.hankkin.hybridlib

import android.webkit.WebView

/**
 * @author Hankkin
 * @date 2019-05-16
 */
open class BaseUriParse : IParse{

    var action: String? = ""

    override fun parseUri(uri: String?,webView: WebView) {

    }

    override fun matchWidget(key: String): BaseWidget? {
        if (Hybrid.map.containsKey(key)) {
            val classZ = Hybrid.map[key]
            val constructor = classZ?.getConstructor()
            val baseWidget = constructor?.newInstance()
            return baseWidget!!
        }
        return null
    }


}
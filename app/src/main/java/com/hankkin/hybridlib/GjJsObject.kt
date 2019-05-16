package com.hankkin.hybridlib

import android.util.Log
import android.webkit.JavascriptInterface
import android.widget.Toast
import java.util.logging.Logger

/**
 * @author Hankkin
 * @date 2019-05-16
 */
class GjJsObject : BaseJSObject() {

    @JavascriptInterface
    public fun jsCallAndroid(str: String) {
        Log.e("Hankkin",str)
    }
}
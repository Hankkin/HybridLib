package com.hankkin.hybridlib

import android.webkit.WebView
import android.widget.Toast

class ToastWidget : BaseWidget() {

    override fun dealActionInUi(webView: WebView) {
        bean?.let {
            Toast.makeText(webView.context,bean.toString(),Toast.LENGTH_LONG).show()
        }
    }

    override fun parseParams(params: String) {
        bean = params
    }


}
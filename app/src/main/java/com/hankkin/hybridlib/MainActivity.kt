package com.hankkin.hybridlib

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Hybrid.init(Hybrid.LOAD_TYPE.JS_PROMTP)
            .setParase(GjUriParse())
        tv_androidcalljs.setOnClickListener {
            web.loadUrl("javascript:javacalljs()")
        }
        web.settings.javaScriptEnabled = true
        web.loadUrl("file:///android_asset/htmlalert.html")
        web.webChromeClient = object : WebChromeClient(){
            override fun onJsPrompt(
                view: WebView?,
                url: String?,
                message: String?,
                defaultValue: String?,
                result: JsPromptResult?
            ): Boolean {
                if (Hybrid.mLoadType == Hybrid.LOAD_TYPE.JS_PROMTP) {
                    val parse = Hybrid.jsParse
                    parse?.apply {
                        parseUri(url)
                        view?.let {dealActionInUi(it) }
                    }
                }

                result?.confirm()
                return super.onJsPrompt(view, url, message, defaultValue, result)
            }

        }

        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return super.shouldOverrideUrlLoading(view, request)
            }
        }

        if (Hybrid.mLoadType == Hybrid.LOAD_TYPE.JS_INTERFACE && Hybrid.jsObject != null) {
            web.addJavascriptInterface(Hybrid.jsObject,Hybrid.jsKey)
        }

    }

}

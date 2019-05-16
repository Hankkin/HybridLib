package com.hankkin.hybridlib

/**
 * @author Hankkin
 * @date 2019-05-16
 */
object Hybrid {
    const val DEFAULT_JS_KEY = "js"
    public var mLoadType: LOAD_TYPE = Hybrid.LOAD_TYPE.JS_PROMTP
    var jsObject: BaseJSObject? = null
    var jsParse: BaseUriParse? = null
    var jsKey: String = DEFAULT_JS_KEY

    enum class LOAD_TYPE {
        URL,
        JS_PROMTP,
        JS_INTERFACE
    }

    fun init(type: LOAD_TYPE): Hybrid {
        this.mLoadType = type
        return this
    }

    fun setJsObject(jsObject: BaseJSObject,key: String): Hybrid {
        this.jsObject = jsObject
        this.jsKey = key
        return this
    }

    fun setParase(parse: BaseUriParse): Hybrid {
        this.jsParse = parse
        return this
    }
}
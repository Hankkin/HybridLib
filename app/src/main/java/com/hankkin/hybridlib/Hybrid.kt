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
    val map = HashMap<String, Class<out BaseWidget>>()

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

    fun setInterceptor(parse: BaseUriParse): Hybrid {
        this.jsParse = parse
        return this
    }

    fun registWidget(key: String, clazz: Class<out BaseWidget>) {
        if (map.containsKey(key)) return
        map[key] = clazz
    }
}
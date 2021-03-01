package com.stario10module

import com.facebook.react.bridge.*
import com.starmicronics.stario10.StarPrinterStatus


class StarPrinterStatusWrapper internal constructor(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {
    override fun getName(): String {
        return "StarPrinterStatusWrapper"
    }

    @ReactMethod
    fun getHasError(identifier: String, promise: Promise) {
        val status = InstanceManager.get(identifier)

        if (status is StarPrinterStatus) {
            promise.resolve(status.hasError)
        }
        else {
            promise.reject(Exception("Not found $identifier identifier"))
        }
    }

    @ReactMethod
    fun getPaperEmpty(identifier: String, promise: Promise) {
        val status = InstanceManager.get(identifier)

        if (status is StarPrinterStatus) {
            promise.resolve(status.paperEmpty)
        }
        else {
            promise.reject(Exception("Not found $identifier identifier"))
        }
    }

    @ReactMethod
    fun getPaperNearEmpty(identifier: String, promise: Promise) {
        val status = InstanceManager.get(identifier)

        if (status is StarPrinterStatus) {
            promise.resolve(status.paperNearEmpty)
        }
        else {
            promise.reject(Exception("Not found $identifier identifier"))
        }
    }

    @ReactMethod
    fun getCoverOpen(identifier: String, promise: Promise) {
        val status = InstanceManager.get(identifier)

        if (status is StarPrinterStatus) {
            promise.resolve(status.coverOpen)
        }
        else {
            promise.reject(Exception("Not found $identifier identifier"))
        }
    }

    @ReactMethod
    fun getDrawerOpenCloseSignal(identifier: String, promise: Promise) {
        val status = InstanceManager.get(identifier)

        if (status is StarPrinterStatus) {
            promise.resolve(status.drawerOpenCloseSignal)
        }
        else {
            promise.reject(Exception("Not found $identifier identifier"))
        }
    }

    @ReactMethod
    fun dispose(identifier: String, promise: Promise) {
        InstanceManager.remove(identifier)
        promise.resolve(0)
    }
}


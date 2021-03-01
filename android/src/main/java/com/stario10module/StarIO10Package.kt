package com.stario10module

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.JavaScriptModule
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ViewManager
import java.util.*

class StarIO10Package : ReactPackage {
    var reactContext: ReactApplicationContext? = null
     override fun createNativeModules(reactContext: ReactApplicationContext): List<NativeModule> {
         this.reactContext = reactContext
        val modules: MutableList<NativeModule> = ArrayList()

        modules.add(BezelSettingBuilderWrapper(reactContext))
        modules.add(BuzzerBuilderWrapper(reactContext))
        modules.add(DocumentBuilderWrapper(reactContext))
        modules.add(DrawerBuilderWrapper(reactContext))
        modules.add(LedSettingBuilderWrapper(reactContext))
        modules.add(MelodySpeakerBuilderWrapper(reactContext))
        modules.add(PageModeBuilderWrapper(reactContext))
        modules.add(PreSettingBuilderWrapper(reactContext))
        modules.add(PrinterBuilderWrapper(reactContext))
        modules.add(StarDeviceDiscoveryManagerWrapper(reactContext))
        modules.add(StarIO10ErrorWrapper(reactContext))
        modules.add(StarXpandCommandBuilderWrapper(reactContext))
        modules.add(StarPrinterStatusWrapper(reactContext))
        modules.add(StarPrinterWrapper(reactContext))

        return modules
    }

    override fun createViewManagers(reactContext: ReactApplicationContext): List<ViewManager<*, *>> {
        return emptyList<ViewManager<*, *>>()
    }
}

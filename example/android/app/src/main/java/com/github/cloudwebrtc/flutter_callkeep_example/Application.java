package vn.aina.cameraai;

import android.os.Bundle;

import androidx.annotation.CallSuper;

import io.flutter.app.FlutterApplication;
import io.flutter.app.FlutterActivity;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback;
import io.flutter.plugins.GeneratedPluginRegistrant;


import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;

import com.github.cloudwebrtc.flutter_callkeep.FlutterCallkeepPlugin;

public class Application extends FlutterApplication implements PluginRegistrantCallback {
    @Override
    public void onCreate() {
        super.onCreate();
        FlutterFirebaseMessagingBackgroundService.setPluginRegistrant(this);
    }

    @Override
    public void registerWith(PluginRegistry pluginRegistry) {
        FlutterFirebaseMessagingPlugin.registerWith(pluginRegistry.registrarFor("io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin"));
        FlutterCallkeepPlugin.registerWith(pluginRegistry.registrarFor("com.github.cloudwebrtc.flutter_callkeep.FlutterCallkeepPlugin"));
    }
}

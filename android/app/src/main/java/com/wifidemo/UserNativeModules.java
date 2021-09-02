package com.wifidemo;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

/**
 * Created by scottwang on 2018/1/5.
 */

public class UserNativeModules extends ReactContextBaseJavaModule {
    public UserNativeModules(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    /**
     * ReactContextBaseJavaModule要求派生类实现getName方法。
     * 这个函数用于返回一个字符串名字，这个名字在JavaScript端标记这个模块。
     * 这里我们把这个模块叫做UserNativeModules，
     * 这样就可以在JavaScript中通过React.NativeModules.UserNativeModules访问到这个模块。
     * @return
     */
    @Override
    public String getName() {
        return "UserNativeModules";
    }

    /**
     * 要导出一个方法给JavaScript使用，Java方法需要使用注解@ReactMethod。
     * 方法的返回类型必须为void。React Native的跨语言访问是异步进行的。
     * @param name
     * @param password
     */
    @ReactMethod
    public void userLogin(String name, String password) {
        Toast.makeText(getReactApplicationContext(), name+" : "+password,Toast.LENGTH_LONG).show();
    }
}
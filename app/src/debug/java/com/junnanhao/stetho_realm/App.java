package com.junnanhao.stetho_realm;

import android.app.Application;

import com.facebook.stetho.Stetho;

import io.realm.Realm;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);


        Stetho.initialize(
                Stetho.newInitializerBuilder(this).
                        enableDumpapp(Stetho.defaultDumperPluginsProvider(this)).
                        enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this)).
                        build());
    }
}

package jp.jagibaraki.diagramapp;

import android.app.Application;

import com.kii.cloud.storage.Kii;

public class DiagramApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Kii.initialize("8a8e602c", "6f38bdd7f204bc7a7f272993ec3f7e3a", Kii.Site.JP);
    }
}

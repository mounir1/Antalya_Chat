package com.apps.Mounir;

import android.app.Application;
import android.widget.TextView;

import com.firebase.client.Firebase;

/**
 * Created by Marcel on 11/6/2015.
 */
public class KhalaifAntalyaChat extends Application {
    TextView daily;

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }


}

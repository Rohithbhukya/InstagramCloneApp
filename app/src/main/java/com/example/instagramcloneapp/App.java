package com.example.instagramcloneapp;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("6yXC3XFds2lQ607GNwIHS8iexocWsocPhZmkwQXn")
                // if defined
                .clientKey("3E1o3BiW0rIanAXOQbQ8qFcal45LcwEfd2hPlzwG")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }

}

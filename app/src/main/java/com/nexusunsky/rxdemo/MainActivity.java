package com.nexusunsky.rxdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.nexusunsky.rxdemo.demo.ChapterOne;
import com.nexusunsky.rxdemo.demo.ChapterThree;
import com.nexusunsky.rxdemo.demo.ChapterTwo;

import java.io.InterruptedIOException;

import io.reactivex.functions.Consumer;
import io.reactivex.plugins.RxJavaPlugins;

public class MainActivity extends Activity {
    public static final String TAG = "TAG";

    static {
        RxJavaPlugins.setErrorHandler(new Consumer<Throwable>() {
            @Override
            public void accept(Throwable throwable) throws Exception {
                if (throwable instanceof InterruptedIOException) {
                    Log.d(TAG, "Io interrupted");
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chapter1(View view) {
        ChapterOne.demo1();
    }

    public void chapter2(View view) {
        ChapterTwo.demo1();
    }

    public void chapter3(View view) {
        ChapterThree.demo1();
    }
}

package com.nexusunsky.rxdemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.nexusunsky.rxdemo.demo.ChapterEight;
import com.nexusunsky.rxdemo.demo.ChapterFive;
import com.nexusunsky.rxdemo.demo.ChapterFour;
import com.nexusunsky.rxdemo.demo.ChapterNine;
import com.nexusunsky.rxdemo.demo.ChapterOne;
import com.nexusunsky.rxdemo.demo.ChapterSeven;
import com.nexusunsky.rxdemo.demo.ChapterSix;
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
        ChapterOne.demo4();
    }

    public void chapter2(View view) {
        ChapterTwo.demo1();
    }

    public void chapter3(View view) {
        ChapterThree.demo1();
    }

    public void chapter4(View view) {
        ChapterFour.demo1();
    }

    public void chapter5(View view) {
        ChapterFive.demo1();
    }

    public void chapter6(View view) {
        ChapterSix.demo1();
    }

    public void chapter7(View view) {
        ChapterSeven.demo1();
    }

    public void chapter8(View view) {
        ChapterEight.demo1();
    }

    public void chapter9(View view) {
        ChapterNine.demo1();
    }
}

package com.nexusunsky.rxdemo.demo;

import android.content.Context;
import android.util.Log;

import com.nexusunsky.rxdemo.Api;
import com.nexusunsky.rxdemo.RetrofitProvider;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Response;

import static com.nexusunsky.rxdemo.MainActivity.TAG;

public class RetrofitDemo {
    public static void demo1(final Context context) {
        final Api api = RetrofitProvider.get().create(Api.class);
        api.getTop250(0, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Response<ResponseBody>>() {
                    @Override
                    public void accept(Response<ResponseBody> response) throws Exception {
                        Log.d(TAG, response.body().string());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.w("Error", throwable);
                    }
                });
    }
}

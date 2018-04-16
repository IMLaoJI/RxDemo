package com.nexusunsky.rxdemo;

import com.nexusunsky.rxdemo.entity.LoginRequest;
import com.nexusunsky.rxdemo.entity.LoginResponse;
import com.nexusunsky.rxdemo.entity.RegisterRequest;
import com.nexusunsky.rxdemo.entity.RegisterResponse;
import com.nexusunsky.rxdemo.entity.UserBaseInfoRequest;
import com.nexusunsky.rxdemo.entity.UserBaseInfoResponse;
import com.nexusunsky.rxdemo.entity.UserExtraInfoRequest;
import com.nexusunsky.rxdemo.entity.UserExtraInfoResponse;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Author: Season(ssseasonnn@gmail.com)
 * Date: 2016/12/6
 * Time: 11:30
 * FIXME
 */
public interface Api {
    @GET
    Observable<LoginResponse> login(@Body LoginRequest request);

    @GET
    Observable<RegisterResponse> register(@Body RegisterRequest request);

    @GET
    Observable<UserBaseInfoResponse> getUserBaseInfo(@Body UserBaseInfoRequest request);

    @GET
    Observable<UserExtraInfoResponse> getUserExtraInfo(@Body UserExtraInfoRequest request);

    @GET("v2/movie/top250")
    Observable<Response<ResponseBody>> getTop250(@Query("start") int start, @Query("count") int count);
}

package com.example.jin.myretrofitdemo.First;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface DataService {
    @GET
    Call<String>baidu(@Url String url);

    @GET
    Call<String>sougou(@Url String url);

    @GET("/qqevaluate/qq")
    Call<QQData> getQQData(@Query("key") String appkey, @Query("qq") String qq);

}


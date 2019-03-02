package com.example.jin.myretrofitdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface DataService {
    @GET
    Call<String>baidu(@Url String url);

    @GET
    Call<String>sougou(@Url String url);
}


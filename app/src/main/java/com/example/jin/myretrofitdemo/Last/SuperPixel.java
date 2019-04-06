package com.example.jin.myretrofitdemo.Last;



import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface SuperPixel {

    @POST("api")
    @Multipart
    Call<ResponseBody> processPng(@Part("style") RequestBody type,
                                  @Part("noise") RequestBody noise,
                                  @Part("scale") RequestBody scale,
                                  @Part("file\"; filename=\"test.png")RequestBody img);

}

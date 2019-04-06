package com.example.jin.myretrofitdemo.Last;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jin.myretrofitdemo.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;

public class SuperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super);

        // Retrofit 配置关键代码：

        // 为什么需要配置超时？
        // waifu2x 接口在处理稍大的图片时十分耗时，默认的 10s 不够用
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();

//        Retrofit 接口调用关键代码：

//        RequestBody typeBody = RequestBody.create(MediaType.parse("text/plain"), getType());
//        RequestBody noiseBody = RequestBody.create(MediaType.parse("text/plain"), getNoise());
//        RequestBody scaleBody = RequestBody.create(MediaType.parse("text/plain"), getScale());
//        RequestBody RequestBody.create(MediaType.parse("image/png"), getImgBytes(srcImgUri));
//
//        // 发起请求
//        Call<ResponseBody> call = service.processPng(typeBody, noiseBody, scaleBody, imgBody);
//        ResponseBody responseBody = call.execute().body();
//
//        // 下载处理后的图片
//        RetrofitHelper.downloadFile(responseBody, tmpFile);
    }


    public static boolean downloadFile(ResponseBody body, File targetFile) {

        InputStream inputStream = body.byteStream();
        try {
            OutputStream outputStream = new FileOutputStream(targetFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
     //等待处理
          return false;

    }
}

package com.example.jin.myretrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        //创建Retrofit对象
//        Retrofit retrofit = new Retrofit.Builder()
//                //指定baseurl，这里有坑，最后后缀出带着“/”
//                .baseUrl("http://www.baidu.com/")
//                //设置内容格式,这种对应的数据返回值是String类型
//                .addConverterFactory(ScalarsConverterFactory.create())
//                //定义client类型
//                .client(new OkHttpClient())
//                //创建
//                .build();
//
//        //通过retrofit和定义的有网络访问方法的接口关联
//        DataService dataService = retrofit.create(DataService.class);
//        //在这里又重新设定了一下baidu的地址，是因为Retrofit要求传入具体，如果是决定路径的话，路径会将baseUrl覆盖掉
//        Call<String> baidu = dataService.baidu("http://www.baidu.com");
//        //执行异步请求
//        baidu.enqueue(new Callback<String>() {
//            @Override
//            public void onResponse(Call<String> call, Response<String> response) {
//                Toast.makeText(MainActivity.this,  response.body(), Toast.LENGTH_SHORT).show();
//            }
//            @Override
//            public void onFailure(Call<String> call, Throwable t) {
//
//            }
//
//        });
        // 第2部分：在创建Retrofit实例时通过.baseUrl()设置
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fanyi.youdao.com/") //设置网络请求的Url地址
                .addConverterFactory(GsonConverterFactory.create()) //设置数据解析器
                .build();

        // 从上面看出：一个请求的URL可以通过 替换块 和 请求方法的参数 来进行动态的URL更新。
        // 替换块是由 被{}包裹起来的字符串构成
        // 即：Retrofit支持动态改变网络请求根目录


    }

}

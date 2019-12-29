package com.zykxym.laiyun.network;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import rx.Observer;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void request(View view) {
        //调用封装好的retrofit请求方法
        HttpEngine.getDuoBanTop(new Observer<movieTopReq>() {
            @Override
            public void onCompleted() {
                //完成
                Log.i("retrofit==111=","完成");
            }

            @Override
            public void onError(Throwable e) {
                //失败
                Log.i("retrofit==111=", "请求错误："+e.getMessage());
            }

            @Override
            public void onNext(movieTopReq movieTopReq) {
                //成功
                Log.i("retrofit==111=","成功");
                Log.i("retrofit==111=",movieTopReq.getEpisodes().get(0).getTitle());

            }
        });
    }

}
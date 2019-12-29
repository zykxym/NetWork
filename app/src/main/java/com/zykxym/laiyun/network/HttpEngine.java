package com.zykxym.laiyun.network;

import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by ChenZhen on 2019/12/29
 */
public class HttpEngine {
    private static MovieService movieService = RetrofitServiceManager.getInstance().create(MovieService.class);

    /*
     * 获取豆瓣电影榜单
     * **/
    public static void getDuoBanTop( Observer<movieTopReq> observer) {
        setSubscribe(movieService.getMovicTop(), observer);
    }

    private static <T> void setSubscribe(Observable<T> observable, Observer<T> observer) {
        observable.subscribeOn(Schedulers.io())
                .subscribeOn(Schedulers.newThread())//子线程访问网络
                .observeOn(AndroidSchedulers.mainThread())//回调到主线程
                .subscribe(observer);
    }
}
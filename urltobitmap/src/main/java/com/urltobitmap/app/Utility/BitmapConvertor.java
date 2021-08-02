package com.urltobitmap.app.Utility;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.urltobitmap.app.retrofit.ApiInterface;
import com.urltobitmap.app.retrofit.RetrofitBuild;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class BitmapConvertor {


    public static void UrltoBitmap(CompositeDisposable disposable,BitmapCallBack bitmapCallBack,String url){

        ApiInterface service = new RetrofitBuild.getRxJavaimage(url).create(ApiInterface.class);
        disposable.add(service.getImagetoBitmap(url)
                .subscribeOn(Schedulers.io())
                .doOnSubscribe(it-> bitmapCallBack.onProgress("start"))
                .doFinally(()-> bitmapCallBack.onProgress("end"))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(ResponseBody->{
                    if (ResponseBody != null) {
                        byte[] bytes = ResponseBody.bytes();
                        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                        Bitmap resized = Bitmap.createScaledBitmap(bitmap, 100, 100, true);
                        bitmapCallBack.onSuccess(resized);
                    } else {
                        // TODO
                        System.out.println("enter the null image return");
                    }
                }, bitmapCallBack::onFailure));

    }
    public interface BitmapCallBack{
        void onSuccess(Bitmap bitmap);
        void onProgress(String Status);
        void onFailure(Throwable throwable);
    }

}


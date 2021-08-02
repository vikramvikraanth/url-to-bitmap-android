package com.urltobitmap.app.retrofit;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiInterface {

    @GET
    Observable<ResponseBody> getImagetoBitmap(@Url String url);
}

package com.binasphere.hitokoto.data;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by Kerstin on 2015/12/15.
 */
public interface HitoService {
    @GET("/rand")
    Call<Hitokoto> getRandomHito();
    @GET("/rand")
    Observable<Hitokoto> getRandomHito(@Query("cat") String cat);
}

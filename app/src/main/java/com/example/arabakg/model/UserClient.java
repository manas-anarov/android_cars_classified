package com.example.samuray.myapplication.api;

import com.example.arabakg.model.Login;
import com.example.arabakg.model.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by samuray on 9/27/18.
 */

public interface UserClient {
    @POST("api-token-auth/")
    Call<User> login(@Body Login login);

    @GET("poisk_voditeley/")
    Call<ResponseBody> getSecret(@Header("Authorization") String authToken);

}

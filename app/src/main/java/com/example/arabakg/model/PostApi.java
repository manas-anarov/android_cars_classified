package com.example.arabakg.model;


import java.util.List;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;


public interface PostApi {



    String root = "http://192.168.56.1:8000/";


    String API_URL = root + "api/v1/";







    @POST("add/")
    Call<CarModel> addPost(@Header("Authorization")  String authToken, @Body CarModel gruzModel);


    @GET("brand/list/")
    Call<List<BrandModel>> getBrandList();


    @Multipart
    @POST("accounts/edit/doctor/")
    Call<ResponseBody>  createPost1 (
            @Header("Authorization")  String authToken,
            @Part("user.username") RequestBody username,
            @Part("user.first_name") RequestBody first_name,
            @Part("user.last_name") RequestBody last_name,
            @Part("user.email") RequestBody email,

            @Part("tel") RequestBody tel,
            @Part("description") RequestBody desc,
            @Part("category") RequestBody cat,
            @Part("whatsapp") RequestBody whatsapp,
            @Part("gender") RequestBody gender
    );


    @Multipart
    @POST("reklama/add/car/")
    Call<ResponseBody>  createPost (
            @Header("Authorization")  String authToken,
            @Part("item.area") RequestBody area,
            @Part("item.group") RequestBody group,
            @Part("item.title") RequestBody title,
            @Part("item.description") RequestBody description,
            @Part("item.price") RequestBody price,
            @Part("item.is_active") Boolean is_active,


            @Part("item_type") RequestBody item_type,
            @Part("year") RequestBody year,
            @Part("car_type") RequestBody car_type

    );





//    @POST("api-token-auth/")
//    Call<User> login(@Body Login login);
//
//    @GET("profile/")
//    Call<User> getProfile(@Header("Authorization")  String authToken);
//
//    @GET("profile/")
//    Call<NameModelPic> getPhotoProfile(@Header("Authorization")  String authToken);
//
//    @POST("register/")
//    Call<User> registrationUser(@Body User userModel);
//
//
//    @Multipart
//    @PUT("editprofile/")
//    Call<NameModelUpdate>  uploadFile(@Header("Authorization")  String authToken, @Part MultipartBody.Part file, @Part("name")RequestBody name, @Part("phone")RequestBody phone);
//
//    @Multipart
//    @PUT("editprofile/")
//    Call<NameModelUpdate>  uploadFile2(@Header("Authorization")  String authToken , @Part("name")RequestBody name, @Part("phone")RequestBody phone);
//
//
//
//    @GET("gorod/")
//    Call<List<CityModel>> getAllPostsGorod();
//
//    @GET("kvpostov/")
//    Call<KvpostovModel> getKvpostov();
//
//
//
//
//
//
////    Вывод водителя
//
//
//    @GET("list/{date}/{kuda}/{otkuda}")
//    Call<List<PoputkaModel>> getAllPostsVoditelSort(@Path(value = "date", encoded = true) String date, @Path(value = "otkuda", encoded = true) Integer otkuda , @Path(value = "kuda", encoded = true) Integer kuda);
//
//    @GET()
//    Call<List<PoputkaModel>> getPostVoditel(@Url String url);
//
//    @POST("add/")
//    Call<PoputkaModelUpdate> addPostVoditel(@Header("Authorization")  String authToken, @Body PoputkaModelUpdate voditelModel);
//
//    @DELETE("delete/{id}/")
//    Call<List<PoputkaModel>> deleteVoditelPost(@Header("Authorization")  String authToken, @Path(value = "id", encoded = true) String id);
//
//
//    @GET("userpost/")
//    Call<List<PoputkaModel>> getUserVoditelPost(@Header("Authorization")  String authToken);
//
//    @GET()
//    Call<List<PoputkaModel>> getVoditelPost(@Header("Authorization")  String authToken, @Url String url);
//
//    @PUT("edit/{id}/")
//    Call<PoputkaModelUpdate> updateVoditelPost(@Header("Authorization")  String authToken, @Body PoputkaModelUpdate poputkaModelUpdate, @Path(value = "id", encoded = true) String id);
//
//
//
//    //    Вывод попутки
//
//
//    @GET("list/{date}/{kuda}/{otkuda}")
//    Call<List<PoputkaModel>> getAllPostsPoputkaSort(@Path(value = "date", encoded = true) String date, @Path(value = "otkuda", encoded = true) Integer otkuda , @Path(value = "kuda", encoded = true) Integer kuda);
//
//
//    @GET()
//    Call<List<PoputkaModel>> getPostPoputka(@Url String url);
//
//
//    @POST("add/")
//    Call<PoputkaModelUpdate> addPostPoputka(@Header("Authorization")  String authToken, @Body PoputkaModelUpdate poputkaModel);
//
//
//    @GET("userpost/")
//    Call<List<PoputkaModel>> getUserPoputkaPost(@Header("Authorization")  String authToken);
//
//
//    @GET()
//    Call<List<PoputkaModel>> getPoputkaPost(@Header("Authorization")  String authToken, @Url String url);
//
//
//    @DELETE("delete/{id}/")
//    Call<List<PoputkaModel>> deletePoputkaPost(@Header("Authorization")  String authToken, @Path(value = "id", encoded = true) String id);
//
//
//    @PUT("edit/{id}/")
//    Call<PoputkaModelUpdate> updatePoputkaPost(@Header("Authorization")  String authToken, @Body PoputkaModelUpdate poputkaModel, @Path(value = "id", encoded = true) String id);
//
//
//
//    //    Вывод Грузовика
//
//
//    @GET("list/{date}/{kuda}/{otkuda}")
//    Call<List<GruzModel>> getAllPostsGruzovikSort(@Path(value = "date", encoded = true) String date, @Path(value = "otkuda", encoded = true) Integer otkuda , @Path(value = "kuda", encoded = true) Integer kuda);
//
//    @GET()
//    Call<List<GruzModel>> getPostGruzovik(@Url String url);
//
//    @POST("add/")
//    Call<CarModel> addPostGruzovik(@Header("Authorization")  String authToken, @Body CarModel gruzModel);
//
//
//    @GET("userpost/")
//    Call<List<GruzModel>> getUserGruzovikPost(@Header("Authorization")  String authToken);
//
//    @PUT("edit/{id}/")
//    Call<CarModel> updateGruzovikPost(@Header("Authorization")  String authToken, @Body CarModel gruzModel, @Path(value = "id", encoded = true) String id);
//
//    @GET()
//    Call<List<GruzModel>> getGruzovikPost(@Header("Authorization")  String authToken, @Url String url);
//
//    @DELETE("delete/{id}/")
//    Call<List<CarModel>> deleteGruzovikPost(@Header("Authorization")  String authToken, @Path(value = "id", encoded = true) String id);
//
//
//    //    Вывод Груза
//
//
//    @GET("list/{date}/{kuda}/{otkuda}")
//    Call<List<GruzModel>> getAllPostsGruzSort(@Path(value = "date", encoded = true) String date, @Path(value = "otkuda", encoded = true) Integer otkuda , @Path(value = "kuda", encoded = true) Integer kuda);
//
//    @GET()
//    Call<List<GruzModel>> getPostGruz(@Url String url);
//
//
//
//    @GET("userpost/")
//    Call<List<GruzModel>> getUserGruzPost(@Header("Authorization")  String authToken);
//
//    @GET()
//    Call<List<GruzModel>> getGruzPost(@Header("Authorization")  String authToken, @Url String url);
//
//    @PUT("edit/{id}/")
//    Call<CarModel> updateGruzPost(@Header("Authorization")  String authToken, @Body CarModel gruzModel, @Path(value = "id", encoded = true) String id);
//
//    @DELETE("delete/{id}/")
//    Call<List<CarModel>> deleteGruzPost(@Header("Authorization")  String authToken, @Path(value = "id", encoded = true) String id);
//
//






}

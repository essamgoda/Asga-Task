package com.essam.asga_task.service;

import com.essam.asga_task.model.Product;
import com.essam.asga_task.model.ProductDetails;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Essam on 9/26/2017.
 */

public class ProductService {
    private static String BASE_URL = "http://kasb.azurewebsites.net";

    public interface ProductAPI {
        @POST("/Api/GetProductByCatId")
        Call<Product> getProductByCatId(@Query("categoryId") String categoryId);

        @POST("/Api/GetProductsDetails")
        Call<ProductDetails> getProductsDetails(@Body JsonObject productID);
    }

    public ProductAPI getAPI() {
        Retrofit retrofit = new Retrofit
                .Builder()
                .baseUrl(BASE_URL)
                .client(getClient())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ProductAPI.class);
    }

    private OkHttpClient getClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor)
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        okhttp3.Request request = chain.request().newBuilder()
                        .addHeader("content-type", "application/json")
                        .build();
                        return chain.proceed(request);
                    }
                })
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(2, TimeUnit.MINUTES)
                .build();

        return client;
    }
}

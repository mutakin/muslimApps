package com.example.wehaye.muslimapps.api;

import com.example.wehaye.muslimapps.model.ModelJadwal;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("bandung.json")
    Call<ModelJadwal> getJadwal();

}

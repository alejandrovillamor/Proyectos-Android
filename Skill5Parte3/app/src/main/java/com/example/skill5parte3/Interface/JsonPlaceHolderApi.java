package com.example.skill5parte3.Interface;


import com.example.skill5parte3.model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

   @GET("posts")
  Call<List<Posts>> getPosts();



}

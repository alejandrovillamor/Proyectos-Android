package com.example.skill61.networking;

import com.google.gson.annotations.SerializedName;

public class ProductResult {
     @SerializedName("id")
     private int id;

     @SerializedName("title")
     private String title;

     @SerializedName("image")
     private String productImage;

     public int getId() {
          return id;
     }

     public String getTitle() {
          return title;
     }

     public String getProductImage() {
          return productImage;
     }
}

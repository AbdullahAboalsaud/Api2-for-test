package com.example.api2;

import com.example.api2.Models.ModelComments;
import com.example.api2.Models.ModelPosts;
import java.util.List;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiCalls {

    @GET("posts")
    Single<List<ModelPosts>> getPosts();

    @GET("comments")
    Call<List<ModelComments>> getComments(@Query("postId") int postId);


}

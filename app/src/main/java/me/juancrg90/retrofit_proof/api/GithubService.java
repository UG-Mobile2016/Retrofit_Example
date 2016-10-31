package me.juancrg90.retrofit_proof.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by JuanCrg90 on 10/31/16.
 */

public interface GithubService {
    @GET("users/{user}/repos")
    Call<List<Repository>> listRepo(@Path("user") String user);
}

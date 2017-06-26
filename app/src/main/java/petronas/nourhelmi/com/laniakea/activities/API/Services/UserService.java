package petronas.nourhelmi.com.laniakea.activities.API.Services;

import java.util.List;
import java.util.Map;

import petronas.nourhelmi.com.laniakea.activities.API.Params.LoginParams;
import petronas.nourhelmi.com.laniakea.activities.API.Params.SignupParams;
import petronas.nourhelmi.com.laniakea.activities.API.Params.UpdateUserParams;
import petronas.nourhelmi.com.laniakea.activities.Models.AccessToken;
import petronas.nourhelmi.com.laniakea.activities.Models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by lightdream on 12/06/2017.
 */

public interface UserService {

    @POST("users/sign_in.json")
    Call<AccessToken> login(@Body LoginParams params);

    @POST("users.json")
    Call<AccessToken> signup(@Body SignupParams params);

    @GET("users.json")
    Call<List<User>> list();

    @GET("users/{id}.json")
    Call<User> get(@Path("id") int id);

    @GET("users/me.json")
    Call<User> me();

    @PUT("users.json")
    Call<User> update(@Body UpdateUserParams params);

}
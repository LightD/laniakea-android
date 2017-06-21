package petronas.nourhelmi.com.laniakea.activities.API.Services;

import petronas.nourhelmi.com.laniakea.activities.API.Params.LoginParams;
import petronas.nourhelmi.com.laniakea.activities.API.Params.SignupParams;
import petronas.nourhelmi.com.laniakea.activities.Models.AccessToken;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by lightdream on 12/06/2017.
 */

public interface UserService {

    @POST("users/sign_in.json")
    Call<AccessToken> login(@Body LoginParams params);

    @POST("users.json")
    Call<AccessToken> signup(@Body SignupParams params);
}

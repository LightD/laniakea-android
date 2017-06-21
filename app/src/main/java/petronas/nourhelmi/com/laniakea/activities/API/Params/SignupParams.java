package petronas.nourhelmi.com.laniakea.activities.API.Params;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nourhelmi on 19/06/2017.
 */

public class SignupParams {
    @SerializedName("username")
    private String email;
    @SerializedName("password")
    private String pass;
    @SerializedName("password_confirmation")
    private String confirmPass;

    public SignupParams(String username, String pass) {
        this.email = username;
        this.pass = pass;
        this.confirmPass = pass;
    }
}

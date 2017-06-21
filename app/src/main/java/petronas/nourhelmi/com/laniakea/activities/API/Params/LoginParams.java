package petronas.nourhelmi.com.laniakea.activities.API.Params;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nourhelmi on 19/06/2017.
 */

public class LoginParams {
    @SerializedName("username")
    String username;

    public LoginParams(String username) {
        this.username = username;
    }
}

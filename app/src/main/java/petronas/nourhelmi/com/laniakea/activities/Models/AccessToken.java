package petronas.nourhelmi.com.laniakea.activities.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nourhelmi on 19/06/2017.
 */

public class AccessToken {
    @SerializedName("authentication_token")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

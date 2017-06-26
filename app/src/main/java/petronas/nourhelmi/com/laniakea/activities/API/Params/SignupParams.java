package petronas.nourhelmi.com.laniakea.activities.API.Params;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nourhelmi on 19/06/2017.
 */

public class SignupParams {

    @SerializedName("user")
    Map<String, String> params;

    public SignupParams(String username, String pass) {
        Map<String, String> temp = new HashMap<>();
        temp.put("email", username + "@petronas.com.my");
        temp.put("username", username);
        temp.put("password", pass);
        temp.put("password_confirmation", pass);

        this.params = temp;
    }
}

package petronas.nourhelmi.com.laniakea.activities.API.Params;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nourhelmi on 19/06/2017.
 */

public class LoginParams {

    @SerializedName("user")
    Map<String, String> params;


    public LoginParams(String username) {
        Map<String, String> map = new HashMap<>();
        map.put("username", username);
        this.params = map;
    }
}

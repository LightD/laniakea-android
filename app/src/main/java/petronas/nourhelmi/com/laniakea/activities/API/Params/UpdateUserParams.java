package petronas.nourhelmi.com.laniakea.activities.API.Params;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nourhelmi on 25/06/2017.
 */

public class UpdateUserParams {

    @SerializedName("user")
    Map<String, String> map;

    public UpdateUserParams(Map<String, String> userFieldParams) {
        this.map = userFieldParams;
    }
}

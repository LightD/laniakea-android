package petronas.nourhelmi.com.laniakea.activities.API.Params;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nourhelmi on 25/06/2017.
 */

public class UpdateUserParams {

    @SerializedName("user")
    private Map<String, String> map;

    public UpdateUserParams(String fullname, String phoneNum, String department, String jobTitle) {
        Map<String, String> userFieldParams = new HashMap();
        if (fullname != null) { userFieldParams.put("full_name", fullname); }
        if (phoneNum != null) { userFieldParams.put("phone_number", phoneNum); }
        if (department != null) { userFieldParams.put("department", department); }
        if (jobTitle != null) { userFieldParams.put("job_title", jobTitle); }
        this.map = userFieldParams;
    }
}

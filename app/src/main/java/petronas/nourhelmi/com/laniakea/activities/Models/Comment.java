package petronas.nourhelmi.com.laniakea.activities.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

/**
 * Created by nourhelmi on 25/06/2017.
 */

public class Comment {
    @SerializedName("body")
    private String body;
    @SerializedName("user")
    private User user;
    @SerializedName("created_at")
    private Date createdAt;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}

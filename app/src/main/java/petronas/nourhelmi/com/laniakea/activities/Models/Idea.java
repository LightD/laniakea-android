package petronas.nourhelmi.com.laniakea.activities.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * Created by nourhelmi on 25/06/2017.
 */

public class Idea {
    @SerializedName("id")
    private int id;
    @SerializedName("project_id")
    private int projectId;
    @SerializedName("description")
    private String description;
    @SerializedName("created_at")
    private Date createdAt;
    @SerializedName("tags")
    private List<Tag> tags;
    @SerializedName("likes_count")
    private int likesCount;
    @SerializedName("assets")
    private List<Asset> assets;
    @SerializedName("user")
    private User user;
    @SerializedName("liked")
    private boolean isLiked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }
}

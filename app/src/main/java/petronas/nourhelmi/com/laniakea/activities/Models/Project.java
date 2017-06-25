package petronas.nourhelmi.com.laniakea.activities.Models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * Created by nourhelmi on 25/06/2017.
 */

public class Project {
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("overview")
    private String overview;
    @SerializedName("story")
    private String story;
    @SerializedName("status")
    private String status;
    @SerializedName("user")
    private User user;
    @SerializedName("members")
    private List<User> members;
    @SerializedName("pending_members")
    private List<User> pendingMembers;
    @SerializedName("likes_count")
    private int likesCount;
    @SerializedName("assets")
    private List<Asset> assets;
    @SerializedName("created_at")
    private Date createdAt;
    @SerializedName("tags")
    private List<Tag> tags;
    @SerializedName("perks")
    private int perks;
    @SerializedName("progress")
    private int progress;
    @SerializedName("end_At")
    private Date endsAt;
    @SerializedName("joined")
    private String joinStatus;
    @SerializedName("comments")
    private List<Comment> comments;
    @SerializedName("posts")
    private List<Idea> ideas;
    @SerializedName("created_since")
    private String createdSinceString;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    public List<User> getPendingMembers() {
        return pendingMembers;
    }

    public void setPendingMembers(List<User> pendingMembers) {
        this.pendingMembers = pendingMembers;
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

    public int getPerks() {
        return perks;
    }

    public void setPerks(int perks) {
        this.perks = perks;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Date getEndsAt() {
        return endsAt;
    }

    public void setEndsAt(Date endsAt) {
        this.endsAt = endsAt;
    }

    public String getJoinStatus() {
        return joinStatus;
    }

    public void setJoinStatus(String joinStatus) {
        this.joinStatus = joinStatus;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }

    public String getCreatedSinceString() {
        return createdSinceString;
    }

    public void setCreatedSinceString(String createdSinceString) {
        this.createdSinceString = createdSinceString;
    }
}

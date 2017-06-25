package petronas.nourhelmi.com.laniakea.activities.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by nourhelmi on 25/06/2017.
 */

public class Asset {
    @SerializedName("id")
    private String id;
    @SerializedName("url")
    private String url;
    @SerializedName("file_content_type")
    private String contentType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}

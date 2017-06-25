package petronas.nourhelmi.com.laniakea.activities.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by nourhelmi on 25/06/2017.
 */

public class SearchResults {
    @SerializedName("posts")
    private List<Idea> ideas;
    @SerializedName("projects")
    private List<Project> projects;

    public List<Idea> getIdeas() {
        return ideas;
    }

    public void setIdeas(List<Idea> ideas) {
        this.ideas = ideas;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: buddha
 * Date: 2/6/14
 * Time: 7:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class Downstairz3 {
    private About about;

    @Expose
    private String[] languages;

    @SerializedName("og")
    private String ogTripleOG = "Buddha AKA Downstairz";

    @Expose
    @SerializedName("booty")
    private String nickName = "My other nickname";

    @Expose
    @SerializedName("car")
    private String myCar = "prelude";

    public About getAbout() {
        return about;
    }

    public void setAbout(About about) {
        this.about = about;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Downstairz{" +
                "about=" + about +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}

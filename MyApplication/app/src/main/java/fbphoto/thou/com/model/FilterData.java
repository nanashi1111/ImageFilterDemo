package fbphoto.thou.com.model;

import java.io.Serializable;

/**
 * Created by Computer on 2/8/2018.
 */

public class FilterData implements Serializable {

    String name;
    String rule;
    int imageId;

    public FilterData(String name, String rule, int imageId) {
        this.name = name;
        this.rule = rule;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}

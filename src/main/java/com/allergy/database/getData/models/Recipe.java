package com.allergy.database.getData.models;

import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Recipes")
public class Recipe {

    String _id;
    String title;
    String url;
    String desc;
    String img;

    public String get_id() {
        return _id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getDesc() {
        return desc;
    }

    public String getImg() {
        return img;
    }

    public Recipe(String _id, String title, String url, String desc, String img) {
        this._id = _id;
        this.title = title;
        this.url = url;
        this.desc = desc;
        this.img = img;
    }

}

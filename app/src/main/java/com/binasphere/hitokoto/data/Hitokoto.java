package com.binasphere.hitokoto.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Kerstin on 2015/12/15.
 */
public class Hitokoto {


    @SerializedName("hitokoto")
    @Expose
    private String hitokoto;
    @SerializedName("cat")
    @Expose
    private String cat;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("like")
    @Expose
    private int like;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("catname")
    @Expose
    private String catname;
    @SerializedName("id")
    @Expose
    private long id;

    /**
     * @return The hitokoto
     */
    public String getHitokoto() {
        return hitokoto;
    }

    /**
     * @param hitokoto The hitokoto
     */
    public void setHitokoto(String hitokoto) {
        this.hitokoto = hitokoto;
    }

    /**
     * @return The cat
     */
    public String getCat() {
        return cat;
    }

    /**
     * @param cat The cat
     */
    public void setCat(String cat) {
        this.cat = cat;
    }

    /**
     * @return The author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author The author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return The source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return The like
     */
    public int getLike() {
        return like;
    }

    /**
     * @param like The like
     */
    public void setLike(int like) {
        this.like = like;
    }

    /**
     * @return The date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date The date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return The catname
     */
    public String getCatname() {
        return catname;
    }

    /**
     * @param catname The catname
     */
    public void setCatname(String catname) {
        this.catname = catname;
    }

    /**
     * @return The id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(long id) {
        this.id = id;
    }
}

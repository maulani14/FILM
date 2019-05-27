 package com.maulani14.reviwfilm.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("Judul")
    @Expose
    private String judul;
    @SerializedName("Studio")
    @Expose
    private String studio;
    @SerializedName("Pendapatan")
    @Expose
    private Integer pendapatan;
    @SerializedName("Sutradara")
    @Expose
    private String sutradara;
    @SerializedName("Tahun")
    @Expose
    private Integer tahun;
    @SerializedName("Poster")
    @Expose
    private String poster;
    @SerializedName("Actors")
    @Expose
    private String actors;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public Integer getPendapatan() {
        return pendapatan;
    }

    public void setPendapatan(Integer pendapatan) {
        this.pendapatan = pendapatan;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public Integer getTahun() {
        return tahun;
    }

    public void setTahun(Integer tahun) {
        this.tahun = tahun;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

}

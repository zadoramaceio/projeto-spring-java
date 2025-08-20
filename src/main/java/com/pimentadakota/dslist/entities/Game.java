package com.pimentadakota.dslist.entities;

import jakarta.persistence.*;
<<<<<<< HEAD

import java.util.Objects;
@Entity
@Table(name ="TB_GAME")
=======
import jakarta.persistence.Entity;

import java.util.Objects;
@Entity
@Table(name ="tb_game")
>>>>>>> 799040e0729b99ffd199a29d48b9b6324b8f6c96
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
<<<<<<< HEAD
    private String plataforms;
    private Double score;
    private String imgUrl;
    private String shortDiscription;
    private String longDiscripton;
=======
    private String platforms;
    private Double score;
    @Column(name = "img_url")
    private String imgUrl;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;
>>>>>>> 799040e0729b99ffd199a29d48b9b6324b8f6c96

    public Game(){

    }

<<<<<<< HEAD
    public Game(Long id, String title, Integer year, String genre, String plataforms, Double score, String imgUrl, String shortDiscription, String longDiscripton) {
=======
    public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl, String shortDescription, String longDescripton) {
>>>>>>> 799040e0729b99ffd199a29d48b9b6324b8f6c96
        super();
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
<<<<<<< HEAD
        this.plataforms = plataforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDiscription = shortDiscription;
        this.longDiscripton = longDiscripton;
=======
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = this.shortDescription;
        this.longDescription = longDescription;
>>>>>>> 799040e0729b99ffd199a29d48b9b6324b8f6c96
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

<<<<<<< HEAD
    public String getPlataforms() {
        return plataforms;
    }

    public void setPlataforms(String plataforms) {
        this.plataforms = plataforms;
=======
    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
>>>>>>> 799040e0729b99ffd199a29d48b9b6324b8f6c96
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

<<<<<<< HEAD
    public String getShortDiscription() {
        return shortDiscription;
    }

    public void setShortDiscription(String shortDiscription) {
        this.shortDiscription = shortDiscription;
    }

    public String getLongDiscripton() {
        return longDiscripton;
    }

    public void setLongDiscripton(String longDiscripton) {
        this.longDiscripton = longDiscripton;
=======
    public String getShortDescription() {
        return shortDescription ;
    }

    public void set(String shortDescription ) {
        this.shortDescription= shortDescription ;
    }

    public String getLongDescripton() {
        return longDescription;
    }

    public void setLongDiscripton(String longDescripton) {
        this.longDescription = longDescripton;
>>>>>>> 799040e0729b99ffd199a29d48b9b6324b8f6c96
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game game)) return false;
        return getId().equals(game.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}

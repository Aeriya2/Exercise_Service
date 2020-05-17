package com.example.exercise_service;

public class music {
    private long id;
    private String title;
    private String artist;

    public music(long songID, String songTitle, String songArtist) {
        id=songID;
        title=songTitle;
        artist=songArtist;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
}

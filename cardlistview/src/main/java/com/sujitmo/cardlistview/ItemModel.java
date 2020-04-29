package com.sujitmo.cardlistview;

public class ItemModel {

    int background;
    String profileName;
    int profilePhoto;
    int nbFollowers;

    public ItemModel() {
    }

    public ItemModel(int background, String profileName, int profilePhoto, int nbFollowers) {
        this.background = background;
        this.profileName = profileName;
        this.profilePhoto = profilePhoto;
        this.nbFollowers = nbFollowers;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public int getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(int profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public int getNbFollowers() {
        return nbFollowers;
    }

    public void setNbFollowers(int nbFollowers) {
        this.nbFollowers = nbFollowers;
    }
}

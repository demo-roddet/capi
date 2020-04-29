package dev.collegues.dto;

public class PhotoCollegueDto {
    private String matricule;
    private String photoUrl;

    public PhotoCollegueDto(String matricule, String photoUrl) {
        this.matricule = matricule;
        this.photoUrl = photoUrl;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}

package dev.collegues.dto;

import dev.collegues.entites.Collegue;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;

public class CreerCollegueReqDto {

	@NotBlank
	@Size(min = 2)
	private String nom;
	@Size(min = 2)
	private String prenoms;
	@NotNull
	@Email
	private String email;

	@NotNull
	@Past
	private LocalDate dateDeNaissance;
	@Size(min = 5)
	private String photoUrl;

	public CreerCollegueReqDto() {
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenoms() {
		return prenoms;
	}

	public void setPrenoms(String prenoms) {
		this.prenoms = prenoms;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public Collegue toCollegue() {
		return new Collegue(nom, prenoms, email, dateDeNaissance, photoUrl);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

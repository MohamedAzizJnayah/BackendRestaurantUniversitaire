package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite;

public class LoginRequestEtd {
    private Long cin;
    private String motpasse;

    // Getters et Setters
    public Long getCin() {
        return cin;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    public String getMotpasse() {
        return motpasse;
    }

    public void setMotpasse(String motpasse) {
        this.motpasse = motpasse;
    }
}


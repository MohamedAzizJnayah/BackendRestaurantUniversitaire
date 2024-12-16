package com.restaurantUniversitaire.Cantine.El.Ons.Persistance.Entite.RequestEntite;

public class LoginRequestEtd {
    private int cin;
    private String motpasse;

    // Getters et Setters
    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getMotpasse() {
        return motpasse;
    }

    public void setMotpasse(String motpasse) {
        this.motpasse = motpasse;
    }
}


package org.Suey.modele;

public class VDVote {
    public int id;
    public int satisfaction;
    public String nomEtudiant;
    public VDQuestion question;

    public VDVote() {

    }

    public VDVote(int id, int satisfaction, String nomEtudiant, VDQuestion question) {
        this.id = id;
        this.satisfaction = satisfaction;
        this.nomEtudiant = nomEtudiant;
        this.question = question;
    }

}

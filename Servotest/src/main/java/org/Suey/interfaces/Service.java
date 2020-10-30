package org.Suey.interfaces;

import org.Suey.modele.VDQuestion;
import org.Suey.modele.VDVote;

import java.util.List;
import java.util.Map;

public interface Service {

    void ajoutQuestion(VDQuestion question);

    void ajoutVote(VDVote vote);

    List<VDQuestion> questionsParNombreVotes(); //list ordonner par nombre de vote

    Map<Integer, Integer> distributionPour(VDQuestion question);

    double moyennePour(VDQuestion question);

    double ecartTypePour(VDQuestion question);

    String nomEtudiant();
}

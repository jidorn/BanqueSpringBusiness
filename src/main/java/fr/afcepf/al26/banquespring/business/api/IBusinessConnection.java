package fr.afcepf.al26.banquespring.business.api;

import fr.afcepf.al26.banquespring.entity.Utilisateur;

/**
 * Created by Stagiaire on 15/01/2016.
 */
public interface IBusinessConnection {
    Utilisateur seConnecter(String mail, String mdp);
}

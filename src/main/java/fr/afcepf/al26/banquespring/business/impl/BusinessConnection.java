package fr.afcepf.al26.banquespring.business.impl;

import fr.afcepf.al26.banquespring.business.api.IBusinessConnection;
import fr.afcepf.al26.banquespring.entity.Utilisateur;
import fr.afcepf.al26.banquespring.service.api.IDaoUtilisateur;
import fr.afcepf.al26.banquespring.service.impl.DaoUtilisateur;


public class BusinessConnection implements IBusinessConnection {
    @Override
    public Utilisateur seConnecter(String mail, String mdp) {
        IDaoUtilisateur daoUtilisateur = new DaoUtilisateur();
        return daoUtilisateur.connectUser(mail,mdp);
    }
}

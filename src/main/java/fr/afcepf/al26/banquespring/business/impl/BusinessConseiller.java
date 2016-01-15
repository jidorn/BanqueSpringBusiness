package fr.afcepf.al26.banquespring.business.impl;

import fr.afcepf.al26.banquespring.business.api.IBusinessConseiller;
import fr.afcepf.al26.banquespring.entity.Client;
import fr.afcepf.al26.banquespring.entity.Compte;
import fr.afcepf.al26.banquespring.entity.Operation;
import fr.afcepf.al26.banquespring.service.api.IDaoCompte;
import fr.afcepf.al26.banquespring.service.api.IDaoOperation;
import fr.afcepf.al26.banquespring.service.api.IDaoUtilisateur;
import fr.afcepf.al26.banquespring.service.impl.DaoCompte;
import fr.afcepf.al26.banquespring.service.impl.DaoOperation;
import fr.afcepf.al26.banquespring.service.impl.DaoUtilisateur;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessConseiller implements IBusinessConseiller {
    private IDaoUtilisateur daoUtilisateur;
    private IDaoCompte daoCompte;

    @Override
    public Client ajouterClient(Client client) {
        daoUtilisateur = new DaoUtilisateur();
        return daoUtilisateur.addClient(client);
    }

    @Override
    public Compte ajouterCompte(Compte compte) {
        daoCompte = new DaoCompte();
        return daoCompte.insert(compte);
    }

    @Override
    public List<Compte> rechercher(Client client) {
        daoCompte = new DaoCompte();
        return daoCompte.getByUser(client);
    }

    @Override
    public List<Operation> voirDetailCompte(Compte compte) {
        IDaoOperation daoOperation = new DaoOperation();
        return daoOperation.getByCompte(compte);
    }

    @Override
    public List<Client> voirClient() {
        daoUtilisateur = new DaoUtilisateur();
        return daoUtilisateur.getAllClient();
    }
}

package fr.afcepf.al26.banquespring.business.api;

import fr.afcepf.al26.banquespring.entity.Client;
import fr.afcepf.al26.banquespring.entity.Compte;
import fr.afcepf.al26.banquespring.entity.Operation;

import java.util.List;

/**
 * Created by Stagiaire on 15/01/2016.
 */
public interface IBusinessConseiller {
Client ajouterClient(Client client);
    Compte ajouterCompte(Compte compte);
    List<Compte> rechercher(Client client);
    List<Operation> voirDetailCompte(Compte compte);
    List<Client> voirClient();
}

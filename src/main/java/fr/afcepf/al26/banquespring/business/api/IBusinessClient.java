package fr.afcepf.al26.banquespring.business.api;

import fr.afcepf.al26.banquespring.entity.Client;
import fr.afcepf.al26.banquespring.entity.Compte;
import fr.afcepf.al26.banquespring.entity.Operation;

import java.util.List;

public interface IBusinessClient {
    List<Compte> rechercher(Client client);
    List<Operation> detailCompte(Compte compte);
}

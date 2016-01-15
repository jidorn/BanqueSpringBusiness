package fr.afcepf.al26.banquespring.business.impl;

import fr.afcepf.al26.banquespring.business.api.IBusinessClient;
import fr.afcepf.al26.banquespring.entity.Client;
import fr.afcepf.al26.banquespring.entity.Compte;
import fr.afcepf.al26.banquespring.entity.Operation;
import fr.afcepf.al26.banquespring.service.api.IDaoCompte;
import fr.afcepf.al26.banquespring.service.api.IDaoOperation;
import fr.afcepf.al26.banquespring.service.impl.DaoCompte;
import fr.afcepf.al26.banquespring.service.impl.DaoOperation;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessClient implements IBusinessClient {

    @Override
    public List<Compte> rechercher(Client client) {
        IDaoCompte daoCompte = new DaoCompte();
        return daoCompte.getByUser(client);
    }

    @Override
    public List<Operation> detailCompte(Compte compte) {
        IDaoOperation daoOperation = new DaoOperation();
        return daoOperation.getByCompte(compte);
    }
}

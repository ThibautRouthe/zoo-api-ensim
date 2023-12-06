package fr.ensim.info.zoo;

import fr.ensim.info.zoo.animaux.Animal;
import fr.ensim.info.zoo.exceptions.LimiteVisiteurException;

import java.util.List;

public class ZooService implements IZooService{
    IZooDaO zoodao;
    @Override
    public void ajouterSecteur(TypeAnimal ta) {
        zoodao.ajouterSecteur(ta);
    }

    @Override
    public void nouveauVisiteur() throws LimiteVisiteurException {
        zoodao.nouveauVisiteur();
    }

    @Override
    public int getLimiteVisiteur() {
        return zoodao.getLimiteVisiteur();
    }
    public void setLimiteVisiteur(int nbvis){
        zoodao.setLimiteVisiteur(nbvis);
    }
    @Override
    public void nouvelAnimal(Animal a) {
        zoodao.getLimiteVisiteur();
    }

    @Override
    public int nombreAnimaux() {
        return zoodao.nombreAnimaux();
    }

    @Override
    public List<Secteur> getSecteursAnimaux() {
        return zoodao.getSecteursAnimaux();
    }
}

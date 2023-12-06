package fr.ensim.info.zoo;

import fr.ensim.info.zoo.animaux.Animal;
import fr.ensim.info.zoo.exceptions.LimiteVisiteurException;

import java.util.List;

public interface IZooService {
    public void ajouterSecteur(TypeAnimal ta);
    public void nouveauVisiteur() throws LimiteVisiteurException;
    public int getLimiteVisiteur();
    public void setLimiteVisiteur(int nbvis);
    public void nouvelAnimal(Animal a);
    public int nombreAnimaux();
    public List<Secteur> getSecteursAnimaux();
}

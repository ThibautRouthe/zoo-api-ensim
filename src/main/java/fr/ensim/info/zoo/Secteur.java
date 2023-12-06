package fr.ensim.info.zoo;

import fr.ensim.info.zoo.animaux.Animal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Secteur {
    private TypeAnimal typeAnimauxDansSecteur;
    private List<Animal> animauxDansSecteur = new ArrayList<Animal>();
    public Secteur(TypeAnimal ta){
        typeAnimauxDansSecteur=ta;
    }
    void ajouterAnimal(Animal a){
        animauxDansSecteur.add(a);
    }
    int getNombreAnimaux(){
        return animauxDansSecteur.size();
    }
    TypeAnimal obtenirType(){
        return typeAnimauxDansSecteur;
    }
    public List<Animal> getAnimauxDansSecteur() {
        return animauxDansSecteur;
    }
}

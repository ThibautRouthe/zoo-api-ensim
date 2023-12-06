package fr.ensim.info.zoo.animaux;

import fr.ensim.info.zoo.TypeAnimal;

public class Chien extends Animal{
    public Chien(String nom, TypeAnimal ta) {
        super(nom, ta);
    }

    String getNomAnimal(){
        return super.getNomAnimal();
    }
}

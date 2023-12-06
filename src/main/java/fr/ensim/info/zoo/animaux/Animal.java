package fr.ensim.info.zoo.animaux;

import fr.ensim.info.zoo.TypeAnimal;

public class Animal {
    private String nomAnimal="";
    private TypeAnimal typeAnimal;
    public Animal(String nom, TypeAnimal ta){
        nomAnimal=nom;
        typeAnimal=ta;
    }
    String getNomAnimal(){
        return nomAnimal;
    }
    public TypeAnimal getTypeAnimal(){
        return typeAnimal;
    }
}

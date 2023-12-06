package fr.ensim.info.zoo.animaux;

import fr.ensim.info.zoo.TypeAnimal;

public class Chat extends Animal{
    public Chat(String nom, TypeAnimal ta) {
        super(nom, ta);
    }
    String getNomAnimal(){
        return super.getNomAnimal();
    }
}

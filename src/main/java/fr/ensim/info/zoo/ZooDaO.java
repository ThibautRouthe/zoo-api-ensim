package fr.ensim.info.zoo;

import fr.ensim.info.zoo.animaux.Animal;
import fr.ensim.info.zoo.exceptions.LimiteVisiteurException;

import java.util.ArrayList;
import java.util.List;

public class ZooDaO implements IZooDaO{
    private int visiteurs;
    private List<Secteur> secteursAnimaux = new ArrayList<Secteur>();
    private int nbVisiteurMaxParSecteur;
    public void ajouterSecteur(TypeAnimal ta){
        secteursAnimaux.add(new Secteur(ta));
    }
    public void nouveauVisiteur() throws LimiteVisiteurException {
        if(visiteurs+1>nbVisiteurMaxParSecteur) {
            throw new LimiteVisiteurException("il y a trop de visiteurs");
        }else {
            visiteurs++;
        }
    }
    public int getLimiteVisiteur(){
        return nbVisiteurMaxParSecteur;
    }
    public void setLimiteVisiteur(int nbvis){
        nbVisiteurMaxParSecteur=nbvis;
    }
    public void nouvelAnimal(Animal a){
        int i=0;
        while(i<secteursAnimaux.size() && secteursAnimaux.get(i).obtenirType()!=a.getTypeAnimal()){
            i++;
        }
        if(i<secteursAnimaux.size()) {
            secteursAnimaux.get(i).ajouterAnimal(a);
        }
    }
    public int nombreAnimaux(){
        int nbA=0;
        for(Secteur i : secteursAnimaux){
            nbA+=i.getNombreAnimaux();
        }
        return nbA;
    }
    public List<Secteur> getSecteursAnimaux() {
        return secteursAnimaux;
    }
}

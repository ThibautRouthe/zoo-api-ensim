package fr.ensim.info.zoo;

import fr.ensim.info.zoo.animaux.Chien;
import fr.ensim.info.zoo.exceptions.LimiteVisiteurException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {
    private static ZooDaO zo;
    private static List<Secteur> sects=new ArrayList<Secteur>();
    private static Chien chi;
    @BeforeAll
    public static void initTests() {
        zo=new ZooDaO();
        chi=new Chien("Boule",TypeAnimal.Chien);
        zo.ajouterSecteur(TypeAnimal.Chien);
        zo.ajouterSecteur(TypeAnimal.Chat);
    }
    /*@BeforeEach
    public void avantTest() {
    }*/
    @Test
    void tropVisiteurTest() throws LimiteVisiteurException {
        for(int i=0;i<10;i++){
            zo.nouveauVisiteur();
        }
        Exception e = assertThrows(LimiteVisiteurException.class, () ->{
            zo.nouveauVisiteur();
        });
    }
    @Test
    void secteurChientTest(){
        int attendu=1;
        int i=0;
        zo.nouvelAnimal(chi);
        while(zo.getSecteursAnimaux().get(i).obtenirType()!=TypeAnimal.Chien){
            i++;
        }
        assertTrue(zo.getSecteursAnimaux().get(i).getAnimauxDansSecteur().contains(chi));
    }
}
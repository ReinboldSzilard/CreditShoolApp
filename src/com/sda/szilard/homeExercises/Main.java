package com.sda.szilard.homeExercises;

public class Main {

    public static void main(String[] args) {
        iMaterials materials = new MaterialsAndCreditsImpl("Drep Civil",
                "Drept Consitutional",
                "Filosofie Juridica",
                "Logica Juridica","Engleza","Teoria Generala a Dreptului",
                "Drept Roman",6,6,3,3,2,6,5);
        materials.materials1();
        materials.materials2();
        materials.materials3();
        materials.materials4();
        materials.materials5();
        materials.materials6();
        materials.materials7();
        materials.calculateNoteAndCredits();
    }
}

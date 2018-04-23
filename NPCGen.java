package io.npcgen.npcgen;

import java.util.Scanner;

public class NPCGen {

    private double unique_id;
    private String npc_name;
    private String race;
    private String npc_class;
    private int challenge_rating;
    private int age;
    private String sex;
    private String alignment;
    private String plot_hook;
    private String occupation;
    private String religion;
    private String sexuality;
    private int relationship_status;
    private String personality;
    private String ideals_bonds;
    private String flaws;
    private String inventory;
    private boolean home_nomad;
    private int random_number;

    private static int number_of_npc = 0;

    static Scanner userinput = new Scanner(System.in);

    private NPCGen(){
        number_of_npc++;
        unique_id = number_of_npc * 647.6;
        //randomize name
        npc_name = "test";
        //race
        race = "test";
        //class
        npc_class = "test";
        //level/challenge rating
        challenge_rating = 1;
        //age
        age = 1;
        //sex
        sex = "test";
        //sexuality
        sexuality = "test";
        //alignment
        alignment = "test";
        //occupation
        occupation = "test";
        //religion
        religion = "test";
        // relationship_status
        relationship_status = "test";
    }

    public String getNpc_name() {
        return npc_name;
    }

    public static void main(String[] args) {

        NPCGen testNPC = new NPCGen();

    }
}

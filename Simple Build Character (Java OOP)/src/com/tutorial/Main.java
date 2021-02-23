package com.tutorial;

import java.util.Scanner;

class Player{
    static String name,job;
    static double health,atk;
    Weapon weapon;
    Armor armor;

    Player(double health, double atk){
        this.health=health;
        this.atk=atk;
    }
    void PlayerInput(){
        Scanner obj = new Scanner(System.in);

        System.out.print("\nName : ");this.name=obj.next();
        System.out.print("Job  : ");this.job=obj.next();
    }

    void Display(){
        System.out.println("\nName    "+this.name);
        System.out.println("Job     "+this.job);
        System.out.println("Atk     "+this.atk);
        System.out.println("Health  "+this.health);
    }
    void DisplayFight(){
        System.out.println("\nName    "+this.name+"      "+"  Name    "+Boss.name);
        System.out.println("Job     "+this.   job+"  vs  "+"Job     "+Boss.job);
        System.out.println("Atk     "+this.   atk+"      "+"  Atk     "+Boss.atk);
        System.out.println("Health  "+this.health+"      "+" Health  "+Boss.health);
    }
}
class Boss{
    static String name,job;
    static double health,atk;
    Weapon weapon;
    Armor armor;

    Boss(String name,String job,double health,double atk){
        this.name = name;
        this.job = job;
        this.health = health;
        this.atk = atk;
    }
    void Display(){
        System.out.println("\nName    "+this.name);
        System.out.println("Job     "+this.job);
        System.out.println("Atk     "+this.atk);
        System.out.println("Health  "+this.health);
    }
}
class Weapon{
    static String name;
    static double atk=0;

    Weapon(String name, double atk){
        this.name=name;
        this.atk=atk;
    }
    void Display(){
        System.out.println(this.name);
        System.out.println("Atk     "+this.atk);
    }
}
class Armor{
    static String name;
    static double health=0;

    Armor(String name, double health){
        this.name=name;
        this.health=health;
    }
    void Display(){
        System.out.println(this.name);
        System.out.println("health "+this.health);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int inputmenu;
        String exit,inputcase1,inputcase2,inputcase2menu,inputcase2menu2,inputcase3menu,inputcase4boss,inputcase4boss2;
        //Object Weapon and Armor and Player
        Player player1 = new Player(5000,250);
        Boss boss = new Boss("JacoB","Necromancer",10000,500);
        Weapon weapon = new Weapon("Beginner Sword",25);
        Armor  armor  = new Armor("Beginner Vest",1000);

        System.out.println("\n~~~~CharMaker~~~~");

        for(int i=0;i<5000;i++){
            inputmenu = MainMenu();
            switch (inputmenu){
                case 1:
                    for(int b=0;b<5000;b++){
                        System.out.print("\n====Make new Character====\n");
                        player1.PlayerInput();
                        System.out.print("\nConfirm New Character?<y/n>");
                        inputcase1 = obj.next();
                            if(inputcase1.equals("y")){
                                break;
                            }else if(inputcase1.equals("n")){
                                continue;
                            }
                    }
                    break;
                case 2:
                    if(Player.name == null){
                        System.out.println("\nCreate Character First");
                        break;
                    }
                    for(int c=0;c<5000;c++){
                        System.out.print("\n====Equipment====\n");
                        System.out.print("\n[Inventory]");
                        System.out.print("\n---Weapon---\n");
                        weapon.Display();
                        System.out.print("---Armor---\n");
                        armor.Display();
                            if(Player.atk>250){
                                System.out.print("\nAlready Equiped\n");
                                System.out.print("Unequip Equipment<y/n>");
                                inputcase2menu2 = obj.next();
                                    if(inputcase2menu2.equals("y")){
                                        Player.atk-=Weapon.atk;
                                        Player.health-=Armor.health;
                                    }else if(inputcase2menu2.equals("n")){
                                        Player.atk -= 0;
                                        Player.health -= 0;
                                    }
                                break;
                            }
                        System.out.print("\nEquip Equipment<y/n>");
                        inputcase2 = obj.next();
                            if(inputcase2.equals("y")){
                                Player.atk+=Weapon.atk;
                                Player.health+=Armor.health;
                            }else if(inputcase2.equals("n")){
                                Player.atk += 0;
                                Player.health += 0;
                            }
                        System.out.print("\nBack to Main Menu<y/n>");
                        inputcase2menu=obj.next();
                            if(inputcase2menu.equals("y")){
                                break;
                            }else if(inputcase2menu.equals("n")){
                                continue;
                            }
                    }
                    break;
                case 3:
                    if(Player.name == null){
                        System.out.println("\nCreate Character First");
                        break;
                    }
                    for(int e=0;e<5000;e++){
                        System.out.print("\n====Player Status====\n");
                        player1.Display();
                        System.out.print("\nBack to Main Menu<y/n>");
                        inputcase3menu=obj.next();
                            if(inputcase3menu.equals("y")){
                                break;
                            }else if(inputcase3menu.equals("n")){
                                continue;
                            }
                     }
                    break;
                case 4:
                    if(Player.name == null){
                        System.out.println("\nCreate Character First");
                        break;
                    }
                    for(int f=0;f<5000;f++){
                        System.out.print("\n====Attack The Boss====\n");
                        System.out.print("\n----Boss Status----\n");
                        boss.Display();
                        System.out.print("\nFight The Boss<y/n>");
                        inputcase4boss = obj.next();
                            if(inputcase4boss.equals("y")){
                                player1.DisplayFight();
                                System.out.print("\nBack To Main Menu<y/n>");
                                inputcase4boss2 = obj.next();
                                    if(inputcase4boss2.equals("y")){
                                        break;
                                    }else{
                                        continue;
                                    }
                            }else{
                                break;
                            }
                    }
                    break;
                case 5:
                    for(int a=0;a<5000;a++){
                        System.out.print("\nExit<y/n>");exit=obj.next();
                        if(exit.equals("y")){
                            System.exit(1);
                        }else if(exit.equals("n")){
                            break;
                        }
                    }
                    break;
                default:
                    continue;
            }
        }
    }
    static int MainMenu(){
        Scanner obj = new Scanner(System.in);
        int input;
        System.out.print("\n====Main Menu====\n");
        System.out.print("1. New Character\n");
        System.out.print("2. Equipment\n");
        System.out.print("3. Display Player Status\n");
        System.out.print("4. Attack The Boss\n");
        System.out.print("5. Exit\n");
        System.out.print("Select<1-4>");input=obj.nextInt();
        return input;
    }
}

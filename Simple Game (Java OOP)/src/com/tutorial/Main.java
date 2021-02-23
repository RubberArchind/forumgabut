package com.tutorial;

class Player{
    int health,deff,atk;

    Player(int health,int deff,int atk){
        this.health=health;
        this.deff=deff;
        this.atk=atk;
    }
    void PlayerStatsDisplay(int playerhealth){
        String status = "Alive";

        System.out.println("Health  = "+this.health+"/"+playerhealth);
        System.out.println("Defence = "+deff);
        System.out.println("Attack  = "+atk);
        if(this.health<=0){
            status = "Death";
        }
        System.out.println("Status  = "+status);
    }
}
public class Main {
    public static void main(String[] args) {
        //Character Object
        Player you    = new Player(5000,500,1000);
        Player bot    = new Player(2500,250,3000);

        for(int i=0;i<5000;i++){
            System.out.print("\nYour Status:\n");
            you.PlayerStatsDisplay(5000);
            System.out.print("Bot Status:\n");
            bot.PlayerStatsDisplay(2500);

            if(bot.health == 0 || you.health == 0){
                System.out.println("\nBot is Winner!!");
                System.exit(1);
            }

            System.out.println("\nYou attacking Bot with "+you.atk+" atk");
            System.out.println("~~Bot defence "+bot.deff);
            System.out.print("~~Bot earned  "+(you.atk-bot.deff)+" Dmg");
            System.out.println("\nBot attacking You with "+bot.atk+" atk");
            System.out.println("~~You defence "+you.deff);
            System.out.println("~~You earned  "+(bot.atk-you.deff)+" Dmg");

            bot.health -= (you.atk-bot.deff);
            you.health -= (bot.atk-you.deff);
        }
    }
}

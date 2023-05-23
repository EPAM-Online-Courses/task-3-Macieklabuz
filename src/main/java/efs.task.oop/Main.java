package efs.task.oop;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Villager kashya = new Villager ("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40 , ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);
        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;
        //ODP Nie można wywołać metody klasy ExtraordinatyVillager na objectDeckardCain
        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();

        List<Villager> Villagers = new ArrayList<>();
        Villagers.add(kashya);
        Villagers.add(akara);
        Villagers.add(gheed);
        Villagers.add(deckardCain);
        Villagers.add(warriv);
        Villagers.add(flawia);

        List<Monster> Monsters_List = new ArrayList<>();
        Monsters_List.add(Monsters.andariel);
        Monsters_List.add(Monsters.blacksmith);

        int j = 0;
        int i = 0;
        Villager Current_warrior = Villagers.get(i);
        Monster Current_monster = Monsters_List.get(j);
        while(Monsters.monstersHealth > 0){
            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punkty zycia ");
            System.out.println("Aktualnie walczacy osadnik to " + Current_warrior.name);

            if (Current_warrior.health == 0){
                i +=1;
                Current_warrior = Villagers.get(i);
            }


            Current_warrior.attack(Current_monster);

            if(Current_monster.health == 0 && j < 1){
                j+= 1;
                Current_monster = Monsters_List.get(j);
            }

            Current_monster.attack(Current_warrior);
        }
        System.out.println("Obozowisko ocalone!");

        Villagers.set(1, (ExtraordinaryVillager) objectAkara);
        Villagers.set(3, (ExtraordinaryVillager) objectDeckardCain);
    }
}

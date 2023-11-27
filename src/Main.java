// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        test10();
    }
    public static void test1(){
        Character Hero = new Character("Spider Man");
        System.out.println("My name is = "+Hero.name);
        System.out.println("My speed = "+Hero.max_Speed);
        System.out.println("My max HP = "+Hero.get_HP());
        System.out.println("My max mana = "+Hero.get_Mana());
        Hero.level_UP();
        Hero.level_UP();
        Equipment.sword RyuJin_By_Genji = new Equipment.sword(10);
        System.out.println(RyuJin_By_Genji.sword_Dmg);
        Hero.equip_SW(RyuJin_By_Genji);
        System.out.println("Speed Hero now! = "+Hero.max_Speed);
        Equipment.shield Vibranium = new Equipment.shield(5);
        Hero.equip_SH(Vibranium);
//        System.out.println("Speed Hero now! = "+Hero.max_Speed);
        System.out.println(Vibranium.shield_Def);
//        Hero.attack();
//        Hero.un_EquipSW(RyuJin_By_Genji);
//        Hero.attack();
    }
    public static void test2(){ // Test Create 2 Players
        Character P1 = new Character("Player 1");
        Character P2 = new Character("Player 2");
        System.out.println("Name: "+P1.name);
        System.out.println("Speed: "+P1.max_Speed);
        System.out.println("HP: "+P1.now_HP+"/"+P1.get_HP());
        System.out.println("Mana: "+P1.now_Mana+"/"+P1.get_Mana());
        System.out.println("Damage: "+P1.damage);
        System.out.println("Defend: "+P1.now_Defend+"/"+P1.get_Defend());
        System.out.println("------------------------");
        System.out.println("Name: "+P2.name);
        System.out.println("Speed: "+P2.max_Speed);
        System.out.println("HP "+P2.now_HP+"/"+P2.get_HP());
        System.out.println("Damage: "+P2.damage);
        System.out.println("Mana = "+P2.now_Mana+"/"+P2.get_Mana());
        System.out.println("------------------------");
    }
    public static void test3(){ // Test Level Up
        Character P1 = new Character("Player 1");
        System.out.println("Name: "+P1.name);
        System.out.println("Speed: "+P1.max_Speed);
        System.out.println("HP: "+P1.now_HP+"/"+P1.get_HP());
        System.out.println("Mana: "+P1.now_Mana+"/"+P1.get_Mana());
        System.out.println("Damage: "+P1.damage);
        System.out.println("Defend: "+P1.now_Defend+"/"+P1.get_Defend());
        System.out.println("------------------------");
        P1.level_UP();
        System.out.println("Name: "+P1.name);
        System.out.println("Speed: "+P1.max_Speed);
        System.out.println("HP: "+P1.now_HP+"/"+P1.get_HP());
        System.out.println("Mana: "+P1.now_Mana+"/"+P1.get_Mana());
        System.out.println("Damage: "+P1.damage);
        System.out.println("Defend: "+P1.now_Defend+"/"+P1.get_Defend());
        System.out.println("------------------------");

    }
    public static void test4(){ // test equipped and unequipped Shield
        Character p1 = new Character("MoMai");
        System.out.println("Def: "+p1.now_Defend+"/"+p1.get_Defend());
        Equipment.shield s = new Equipment.shield(10);
        p1.equip_SH(s);
        System.out.println("Equip Shield: "+p1.eq_Shield);
        System.out.println("Def: "+p1.now_Defend+"/"+p1.get_Defend());
        p1.un_EquipSH(s);
        System.out.println("Equip Shield: "+p1.eq_Shield);
        System.out.println("Def: "+p1.now_Defend+"/"+p1.get_Defend());
    }
    public static void test5(){ // test equipped and unequipped Sword
        Character p1 = new Character("MoMai");
        System.out.println("Damage: "+p1.damage);
        Equipment.sword s = new Equipment.sword(5);
        p1.equip_SW(s);
        System.out.println("Equip Sword: "+p1.eq_Sword);
        System.out.println("Damage: "+p1.damage);
        p1.un_EquipSW(s);
        System.out.println("Equip Sword: "+p1.eq_Sword);
        System.out.println("Damage: "+p1.damage);
    }
    public static void test6(){ // test equip both
        Character p1 = new Character("MoMai");
        System.out.println("Damage: "+p1.damage);
        System.out.println("Def: "+p1.now_Defend+"/"+p1.get_Defend());
        System.out.println("----------------");

        Equipment.sword s = new Equipment.sword(5);
        Equipment.shield sh = new Equipment.shield(10);

        p1.equip_SW(s);
        p1.equip_SH(sh);
        System.out.println("Equip Sword: "+p1.eq_Sword);
        System.out.println("Damage: "+p1.damage);
        System.out.println("Def: "+p1.now_Defend+"/"+p1.get_Defend());
        System.out.println("----------------");

        p1.un_EquipSW(s);
        p1.un_EquipSH(sh);
        System.out.println("Equip Sword: "+p1.eq_Sword);
        System.out.println("Damage: "+p1.damage);
        System.out.println("Def: "+p1.now_Defend+"/"+p1.get_Defend());
        System.out.println("----------------");
    }
    public static void test7(){ // test attack with sword
        Character a = new Character("A");
        Character b = new Character("B");

        System.out.println("Name: "+a.name);
        System.out.println("Damage: "+a.damage);
        System.out.println("HP: "+a.now_HP+"/"+a.get_HP());
        System.out.println("Defend: "+a.now_Defend);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        a.attack(b);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        System.out.println("---------------");

        Equipment.sword katana = new Equipment.sword(10);
        a.equip_SW(katana);

        a.attack(b);

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        a.attack(b);
        a.attack(b);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);
    }
    public static void test8(){ //test attack with shield
        Character a = new Character("A");
        Character b = new Character("B");

        System.out.println("Name: "+a.name);
        System.out.println("Damage: "+a.damage);
        System.out.println("HP: "+a.now_HP+"/"+a.get_HP());
        System.out.println("Defend: "+a.now_Defend);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        a.attack(b);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        System.out.println("---------------");

        Equipment.shield aegis = new Equipment.shield(10);
        b.equip_SH(aegis);

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        System.out.println("---------------");

        a.attack(b);

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        a.attack(b);
        a.attack(b);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);
    }
    public static void test9(){ //test attack with shield
        Character a = new Character("A");
        Character b = new Character("B");

        System.out.println("Name: "+a.name);
        System.out.println("Damage: "+a.damage);
        System.out.println("HP: "+a.now_HP+"/"+a.get_HP());
        System.out.println("Defend: "+a.now_Defend);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        a.attack(b);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        System.out.println("---------------");

        Equipment.sword katana = new Equipment.sword(10);
        Equipment.shield aegis = new Equipment.shield(10);

        a.equip_SW(katana);
        b.equip_SH(aegis);

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        System.out.println("---------------");

        a.attack(b);

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);

        a.attack(b);
        a.attack(b);
        a.attack(b);
        a.attack(b);
        a.attack(b);
        a.attack(b);
        a.attack(b);

        System.out.println("---------------");

        System.out.println("Name: "+b.name);
        System.out.println("Damage: "+b.damage);
        System.out.println("HP: "+b.now_HP+"/"+b.get_HP());
        System.out.println("Defend: "+b.now_Defend);
    }
    public static void test10(){
        Character a = new Character("A");
        Equipment.sword s1 = new Equipment.sword(5);
        Equipment.shield s2 = new Equipment.shield(10);

        a.equip_SW(s1);
        a.equip_SH(s2);

        System.out.println("Name: "+a.name);
        System.out.println("Sword damage: "+s1.sword_Dmg);
        System.out.println("Shield Defend: "+s2.shield_Def);
        System.out.println("------------");

        a.level_UP();

        System.out.println("Name: "+a.name);
        System.out.println("Sword damage: "+s1.sword_Dmg);
        System.out.println("Shield Defend: "+s2.shield_Def);

    }
}
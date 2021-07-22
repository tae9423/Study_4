package com.dg.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		System.out.println("Ex1 Start");
		
		
		Character tank = new Character();
		tank.name = "op";
		tank.level = 1;
		tank.hp = 200;
		tank.mp = 50;
		
		Pet pet = new Pet();
		pet.name = "강아지";
		pet.level = 1;
		pet.friends = 10;
			
		
		Weapon weapon = new Weapon();
		weapon.name = "낡은 검";
		weapon.damage = 10;
		weapon.critical = 0.4;
		weapon.upgrade = 1;
		
		tank.weapon=weapon;
		
			
		
		System.out.println(tank.weapon.name);
		
		tank.weapon.name = "대검";
		System.out.println(tank.weapon.name);
		
		weapon.name = "도끼";
		System.out.println(tank.weapon.name);
			
		
		Monster monster = new Monster();
		monster.name ="slime";
		monster.level = 2;
		monster.hp = 300;
		monster.mp = 100;
		monster.gold = 30;
		monster.weapon= new Weapon();
		monster.weapon.name = "야만의 몽둥이";
		monster.weapon.damage = 500;
		monster.weapon.critical=0.8;
		monster.weapon.upgrade=2;
		System.out.println(monster.weapon.name);
		
		tank.gold = tank.gold + monster.gold;
		
		tank.weapon=monster.weapon;
		
		System.out.println("Name : "+tank.name);
		System.out.println("Level : "+tank.level);
		System.out.println("HP : "+tank.hp);
		System.out.println("MP : "+tank.mp);
		System.out.println("Gold : "+tank.gold);
		System.out.println("Weapon : " +tank.weapon.name);
		System.out.println("Weapon Damage : " +tank.weapon.damage);
		
		System.out.println("=======================");
		
		
		
		
		
		System.out.println("Name : "+monster.name);
		System.out.println("Level : "+monster.level);
		System.out.println("HP : "+monster.hp);
		System.out.println("MP : "+monster.mp);
		System.out.println("Gold : "+monster.gold);
		
		monster = new Monster();
		System.out.println(monster.level);
		
		
		
		
		System.out.println("Ex1 Finish");
	}

}

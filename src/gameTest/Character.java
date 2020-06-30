package gameTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {

	private String mName;
	private int mLevel;
	private long mGUID;
	
	private ArrayList<Item>mItem ;
	private ArrayList<Skill>mSkills;
	private Scanner scan = new Scanner(System.in);
		
	public Character(String name, long guid) {
		this.mName = name;
		this.mLevel = 1;
		this.mItem = new ArrayList<Item>();
		this.mSkills = new ArrayList<Skill>();
		this.mGUID = guid;
	}
	
	public void itemGenerate(Character character) {
	
		String name="", type="";
		int buildUpCount=0;
		
		
		System.out.print("캐릭터 이름 : ");
		character.mName = scan.next();
		//System.out.println("캐릭터 레벨 : " + character.mLevel);
		System.out.println("사용할 아이템 속성을 입력해 주세요.");
		System.out.print("아이템 이름 : ");
		name = scan.next();
		System.out.print("아이템 종류(무기인가 옷인가 등) : ");
		type = scan.next();
		System.out.print("강화할 수 있는 횟수 : ");
		buildUpCount = scan.nextInt();
		
		Item item = new Item(name, type, buildUpCount);
		character.mItem.add(item);
	}
	
	public void skillGenerate(Character character) {
		
		String name="", type="";
		int hp=0, np = 0;
		
		
		System.out.print("스킬 이름 : ");
		name = scan.next();
		System.out.print("스킬 종류 : ");
		type = scan.next();
		System.out.print("hp : ");
		hp = scan.nextInt();
		System.out.print("np : ");
		np = scan.nextInt();
		
		Skill skills = new Skill(name,type,hp,np);
		character.mSkills.add(skills);
	}
	

}

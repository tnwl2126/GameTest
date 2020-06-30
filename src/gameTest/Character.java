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
	
	public void generate() {
		int num = 0;
		while(true) {

			System.out.println("캐릭터 이름 : ");
			mName = scan.next();
			
			System.out.println("어떤 직업의 캐릭터를 생성하시겠습니까?");
			System.out.println("1.마법사\n2.검술사\n3.궁수");
			num = scan.nextInt();
			
			if(num==1)magic();
			else if(num==2)fencer();
			else if(num==3)archer();
			else System.out.println("다시 입력해주세요.\n--------------");
		}
	}
	
	public void magic() {
		Item item = new Item("magicStick","stick",10);
		Skill skill = new Skill("magicPower","magic",100,200);
		mItem.add(item);
		mSkills.add(skill);
	}
	
	public void fencer() {
		
	}
	
	public void archer() {
		
	}
	
//	public void itemGenerate(Character character) {
//	
//		String name="", type="";
//		int buildUpCount=0;
//		
//		
//		System.out.print("캐릭터 이름 : ");
//		character.mName = scan.next();
//		//System.out.println("캐릭터 레벨 : " + character.mLevel);
//		System.out.println("사용할 아이템 속성을 입력해 주세요.");
//		System.out.print("아이템 이름 : ");
//		name = scan.next();
//		System.out.print("아이템 종류(무기인가 옷인가 등) : ");
//		type = scan.next();
//		System.out.print("강화할 수 있는 횟수 : ");
//		buildUpCount = scan.nextInt();
//		
//		Item item = new Item(name, type, buildUpCount);
//		character.mItem.add(item);
//	}
//	
//	public void skillGenerate(Character character) {
//		
//		String name="", type="";
//		int hp=0, np = 0;
//		
//		
//		System.out.print("스킬 이름 : ");
//		name = scan.next();
//		System.out.print("스킬 종류 : ");
//		type = scan.next();
//		System.out.print("hp : ");
//		hp = scan.nextInt();
//		System.out.print("np : ");
//		np = scan.nextInt();
//		
//		Skill skills = new Skill(name,type,hp,np);
//		character.mSkills.add(skills);
//	}
//	

}

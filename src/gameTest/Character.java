package gameTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Character {

	private String mName;
	private int mLevel;
	private long mGUID;
	
	private ArrayList<Item>mItems ;
	private ArrayList<Skill>mSkills;
	private Scanner scan = new Scanner(System.in);
		
	//ArrayList<Item> item,ArrayList<Skill> skill,
	
	public Character(String name, long guid) {
		this.mName = name;
		this.mLevel = 1;
		this.mItems = new ArrayList<Item>();
		this.mSkills = new ArrayList<Skill>();
		this.mGUID = guid;
	}
	
	public void generate(String name) {
		int num = 0;
		while(num < 4) {

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
		mItems.add(item);
		mSkills.add(skill);
	}
	
	public void fencer() {
		Item item = new Item("fencerSword","sword",10);
		Skill skill = new Skill("swordPower","fencing",200,100);
		mItems.add(item);
		mSkills.add(skill);
	}
	
	public void archer() {
		Item item = new Item("archerBow","bow",10);
		Skill skill = new Skill("archerPower","bow",200,100);
		mItems.add(item);
		mSkills.add(skill);
	}
	
//	public boolean creatItem(String name, String skill, int bildup) {
//		
//		mItems.add()
//		
//		return true;
//	}
	
}

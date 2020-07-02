package gameTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Character {

	private String mName;
	private int mLevel;
	private long mGUID;
	
	private ArrayList<Item>mItems ;
	private ArrayList<Skill>mSkills;
	private Scanner scan = new Scanner(System.in);
	private ItemManager itemManager;
	
	private HashMap charHashMap = new HashMap();
		
	//ArrayList<Item> item,ArrayList<Skill> skill,
	
	public Character(String name, long guid) {
		
		
		
		this.mName = name;
		this.mLevel = 1;
		this.mItems = new ArrayList<Item>();
		this.mSkills = new ArrayList<Skill>();
		this.mGUID = guid;
		
		generate(name);
	}
	
	public void generate(String name) {
		int num = 0;
		while(num < 4) {

			System.out.println("캐릭터 이름 : ");
			mName = scan.next();
			
			System.out.println("어떤 직업을 가진 캐릭터를 생성하시겠습니까?");
			System.out.println("1.마법사\n2.검술사\n3.궁수");
			num = scan.nextInt();
			
			if(num==1)magic();
			else if(num==2)fencer();
			else if(num==3)archer();
			else System.out.println("존재하지 않는 번호 입니다.\n--------------");
		}
	}
	
	public void magic() {
		creatItem(1000,10);
//		Skill skill = new Skill("magicPower","magic",100,200);
//		mSkills.add(skill);
	}
	
	public void fencer() {
		creatItem(1001,10);
//		Skill skill = new Skill("swordPower","fencing",200,100);
//		mSkills.add(skill);
	}
	
	public void archer() {
		creatItem(1002,10);
//		Skill skill = new Skill("archerPower","bow",200,100);
//		mSkills.add(skill);
	}
	
	public boolean creatItem(int code, int count) {
		
		mItems.add(itemManager.creatItem(code, count));
		
		return true;
	}
	
}

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
	
	private HashMap<String, Long> charHashMap = new HashMap<>();
	private Object charObject = new Object();
	
	public Character(String name, long guid) {
		
		itemManager = new ItemManager();
		
		checkName(name,guid);

		mName = name;
		mLevel = 1;
		mItems = new ArrayList<Item>();
		mSkills = new ArrayList<Skill>();
		mGUID = guid;
		
	}
		
	public void checkName(String name, long guid) {
		charObject = charHashMap.get(name);
		int num = 0;
		if(charObject == null) {
			charHashMap.put(name, guid);
			generate();
		}
		else {
		
			System.out.println("중복된 이름의 캐릭터가 있습니다.");
			System.out.println("1.캐릭터 정보 수정\n2.정보 수정 안함");
			num = scan.nextInt();
			// if(num==1)
		}
		
	}
	
	public void generate() {
		int num = 0;
		while(num < 4) {
			
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
		creatItem(2000,7);
		creatItem(2002,7);
		creatItem(3000,8);
//		Skill skill = new Skill("magicPower","magic",100,200);
//		mSkills.add(skill);
	}
	
	public void fencer() {
		creatItem(1001,10);
		creatItem(2001,7);
		creatItem(2003,7);
		creatItem(2005,5);
//		Skill skill = new Skill("swordPower","fencing",200,100);
//		mSkills.add(skill);
	}
	
	public void archer() {
		creatItem(1002,10);
		creatItem(2000,7);
		creatItem(2001,7);
		creatItem(2004,5);
//		Skill skill = new Skill("archerPower","bow",200,100);
//		mSkills.add(skill);
	}
	
	public boolean creatItem(int code, int count) {
		
		mItems.add(itemManager.creatItem(code, count));
		
		return true;
	}
	
}

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

			System.out.println("ĳ���� �̸� : ");
			mName = scan.next();
			
			System.out.println("� ������ ĳ���͸� �����Ͻðڽ��ϱ�?");
			System.out.println("1.������\n2.�˼���\n3.�ü�");
			num = scan.nextInt();
			
			if(num==1)magic();
			else if(num==2)fencer();
			else if(num==3)archer();
			else System.out.println("�ٽ� �Է����ּ���.\n--------------");
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
//		System.out.print("ĳ���� �̸� : ");
//		character.mName = scan.next();
//		//System.out.println("ĳ���� ���� : " + character.mLevel);
//		System.out.println("����� ������ �Ӽ��� �Է��� �ּ���.");
//		System.out.print("������ �̸� : ");
//		name = scan.next();
//		System.out.print("������ ����(�����ΰ� ���ΰ� ��) : ");
//		type = scan.next();
//		System.out.print("��ȭ�� �� �ִ� Ƚ�� : ");
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
//		System.out.print("��ų �̸� : ");
//		name = scan.next();
//		System.out.print("��ų ���� : ");
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

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
		
		
		System.out.print("ĳ���� �̸� : ");
		character.mName = scan.next();
		//System.out.println("ĳ���� ���� : " + character.mLevel);
		System.out.println("����� ������ �Ӽ��� �Է��� �ּ���.");
		System.out.print("������ �̸� : ");
		name = scan.next();
		System.out.print("������ ����(�����ΰ� ���ΰ� ��) : ");
		type = scan.next();
		System.out.print("��ȭ�� �� �ִ� Ƚ�� : ");
		buildUpCount = scan.nextInt();
		
		Item item = new Item(name, type, buildUpCount);
		character.mItem.add(item);
	}
	
	public void skillGenerate(Character character) {
		
		String name="", type="";
		int hp=0, np = 0;
		
		
		System.out.print("��ų �̸� : ");
		name = scan.next();
		System.out.print("��ų ���� : ");
		type = scan.next();
		System.out.print("hp : ");
		hp = scan.nextInt();
		System.out.print("np : ");
		np = scan.nextInt();
		
		Skill skills = new Skill(name,type,hp,np);
		character.mSkills.add(skills);
	}
	

}

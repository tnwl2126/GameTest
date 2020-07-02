package gameTest;

import java.util.Scanner;

public class Main {
	
	public static long char_GUID = 3000000000L;

	private static Scanner scan = new Scanner(System.in);
	private static String name;
	private static Character character;
	
	public static void main(String[] args) {

		Main start = new Main();
		System.out.println("캐릭터 이름 : ");
		name = scan.next();
		character = new Character(name, start.getGuid());
		
	}
	
	public long getGuid() {
		char_GUID++;
		return char_GUID;
	}
}

package gameTest;

public class Skill {
	private String mName;
	private String mSkillType;//스킬종류
	private int mHp;
	private int mMp;
	
	public Skill(String name, String type, int hp, int mp) {
		mName = name;
		mSkillType = type;
		mHp = hp;
		mMp = mp;
	}
}

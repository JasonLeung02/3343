package member;

public class Bronze implements MembershipState  {
	private static Bronze instance = new Bronze();
	private Bronze() {}
	
	public static Bronze getInstance () {
		return instance;
	}
	public double discount() {
		return 0.9;
	} 
	public int pointsAward() {
		return 100;
	}
	public String getType() {
		return "Bronze";
	}
}
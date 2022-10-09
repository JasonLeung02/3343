package member;

public class Gold implements MembershipState {
	private static Gold instance = new Gold();
	private Gold() {}
	
	public static Gold getInstance () {
		return instance;
	}
	public double discount() {
		return 0.5;
	} 
	public int pointsAward() {
		return 300;
	}
	public String getType() {
		return "Gold";
	}
}
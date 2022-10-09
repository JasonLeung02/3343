package member;

public class Silver implements MembershipState  {
	private static Silver instance = new Silver();
	private Silver() {}
	
	public static Silver getInstance () {
		return instance;
	}
	public double discount() {
		return 0.7;
	} 
	public int pointsAward() {
		return 200;
	}
	public String getType() {
		return "Silver";
	}
}
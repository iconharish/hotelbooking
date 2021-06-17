package design;

public enum RoomType {
	SINGLE(1), DOUBLE(2), TRIPLE(3);
	
	public final int numberOfGuest;
	
	RoomType(int numberOfGuest) {
		this.numberOfGuest = numberOfGuest;
	}
	
	public int getValue() {
		return numberOfGuest;
	}
}

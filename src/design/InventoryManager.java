package design;

import java.util.Map;

public class InventoryManager {
	
	private static class Inner {
		private static InventoryManager instance = new InventoryManager();
	}
	
	private InventoryManager() {}
	
	public static InventoryManager getInstance() {
		return Inner.instance;
	}
	
	public ResponseObject book(Booking booking, String hotelId, Map<RoomType, Integer> rooms, TimeDuration duration) {
		Hotel hotel = getHotel(hotelId);
		if (hotel.book(booking, rooms, duration)) {
			return new ResponseObject();
		}
		return null;
	}
	
	private Hotel getHotel(String hotelId) {
		return new Hotel();
	}

}

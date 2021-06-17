package design;

import java.util.Map;

public class HotelBookingSystem {
	
	private static class InnerClass {
		private static HotelBookingSystem instance = new HotelBookingSystem();
	}
	
	private HotelBookingSystem() {
		
	}
	
	public static HotelBookingSystem getInstance() {
		return InnerClass.instance;
	}
	
	public ResponseObject bookRooms(String customerId, String hotelId, Map<RoomType, Integer> rooms, TimeDuration duration) {
		return getCustomer(customerId).createBooking(hotelId, rooms, duration).book();
	}
	
	private Customer getCustomer(String customerId) {
		return new Customer();
	}
}

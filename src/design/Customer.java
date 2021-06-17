package design;

import java.util.List;
import java.util.Map;

public class Customer {
	String customerId;
	List<Booking> bookings;
	
	public Booking createBooking(String hotelId, Map<RoomType, Integer> rooms, TimeDuration duration) {
		Booking booking = new Booking(customerId, hotelId, rooms, duration);
		bookings.add(booking);
		return booking;
	}
}

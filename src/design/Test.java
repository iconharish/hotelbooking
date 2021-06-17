package design;

import java.util.Map;

public class Test {
	// Consumers -  end user, aggregators
	// Locations(Time zones)
	// referredBy, customerId, checkin, checkout, HotelId, Map<roomtype, count>
	// central availability
	// returns - response object with amount to pay(if room is available), otherwise an error message to say unavailability
	
	// Customer (id, list<Booking>, other details - address, gender, DOB, email)
	// Hotel (id, map<roomType, count>, bookedMap<date, map<roomType, count>>, map<roomType, price>, other details - location, landmark, other facilities)
	// Booking (id, customerId, hotelId, map<roomType, count>, duration)
	// Room (number, Type)
	// Type - single, double, triple
	
	public ResponseObject bookRooms(String customerId, String hotelId, Map<RoomType, Integer> rooms, TimeDuration duration) {
		return HotelBookingSystem.getInstance().bookRooms(customerId, hotelId, rooms, duration);
	}
}

// com.design.vo
// com.design.api
// com.design.impl
// com.design.do
// 
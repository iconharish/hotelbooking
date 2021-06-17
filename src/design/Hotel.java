package design;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Hotel {
	String hotelId;
	Address address;
	//List<> facilities;
	Map<RoomType, Integer> totalRooms = new HashMap<>();
	ConcurrentMap<Date, Map<RoomType, Integer>> reservedRooms = new ConcurrentHashMap<>();
	Map<RoomType, Double> priceMap;
	
	public boolean book(Booking booking, Map<RoomType, Integer> rooms, TimeDuration duration) {
		if (roomsAvailble()) {
			PaymentDetail paymentDetail = new PaymentDetail();
			booking.paymentDetail = paymentDetail;
		}
		return true;
	}
	
	private boolean roomsAvailble() {
		// iterate the duration dates
		// get entry from reservedRooms on that date
		// iterate rooms that have to be booked
		// check for each room type if number of total roomType from totalRooms - number of roomType from reservedRooms is greater than 0
		return true;
	}
	
}

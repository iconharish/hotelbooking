package design;

import java.util.Map;

public class Booking {
	String bookingId;
	String customerId;
	String hotelId;
	Map<RoomType, Integer> rooms;
	TimeDuration timeDuration;
	PaymentDetail paymentDetail;
	BookingStatus bookingStatus;
	
	public Booking (String customerId, String hotelId, Map<RoomType, Integer> rooms, TimeDuration duration) {
		bookingId = "X";
		this.customerId = customerId;
		this.hotelId = hotelId;
		this.rooms = rooms;
		this.timeDuration = duration;
		bookingStatus = BookingStatus.NEW;
	}
	
	public ResponseObject book() {
		InventoryManager inventoryManager = InventoryManager.getInstance();
		return inventoryManager.book(this, hotelId, rooms, timeDuration);
	}
	
	private enum BookingStatus {NEW, BOOKED, CANCELLED, EXPIRED}
}

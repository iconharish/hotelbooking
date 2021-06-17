package design;

public class PaymentDetail {
	enum PaymentStatus{PAID, UNPAID, PAYING}
	
	String paymentId;
	double Price;
	double discount;
	double finalAmount;
	PaymentStatus paymentStatus;
}

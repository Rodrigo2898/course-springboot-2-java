package com.testeWS.course.entities.enums;

public enum OrderStatus {

		WAITING_PAYMENT(1),
		PAID(2),
		SHIPPED(3),
		DELIVERED(4),
		CANCELED(5);
	
	private long code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public long getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(long code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalide OrderStatus code");
	}
}

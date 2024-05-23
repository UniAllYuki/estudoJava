package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	public Order() {
	}
	
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private List<OrderItem> items = new ArrayList<>();

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0;
		for (OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb =  new StringBuilder();
		sb.append("ORDER SUMMARY:" + "\n");
		sb.append("Order moment: ");
		sb.append(sdf2.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n" + "\n");
		sb.append(client + "\n" + "\n");
		sb.append("Order Items: " + "\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("\n");
		sb.append("Total price: ");
		sb.append(String.format("$%.2f", total()));
		return sb.toString();
	}
	
	
	
}

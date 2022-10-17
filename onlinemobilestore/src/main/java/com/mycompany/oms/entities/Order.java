package com.mycompany.oms.entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id",nullable=false)
	private int orderId;
	@Column(name="order_date",nullable=false)
	private LocalDate orderDate;
	@Column(name="dispatch_date",nullable=false)
	private LocalDate dispatchDate;
	@Column(name="quantity",nullable=false)
	private int quantity;
	@Column(name="cost",nullable=false)
	private int cost;
	@Column(name="total_cost",nullable=false)
	private int totalCost;
	@Column(name="status",nullable=false)
	private String status;
	@ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
	private Customer customer;
	@OneToMany
	@JoinColumn(name="order_id",referencedColumnName="order_id")
	private List<Mobile> mobiles;
	public Order() {
		
	}
	public Order(int orderId, LocalDate orderDate, LocalDate dispatchDate, int quantity, int cost, int totalCost,
			String status, Customer customer, List<Mobile> mobiles) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.dispatchDate = dispatchDate;
		this.quantity = quantity;
		this.cost = cost;
		this.totalCost = totalCost;
		this.status = status;
		this.customer = customer;
		this.mobiles = mobiles;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDispatchDate() {
		return dispatchDate;
	}
	public void setDispatchDate(LocalDate dispatchDate) {
		this.dispatchDate = dispatchDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Mobile> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Mobile> mobiles) {
		this.mobiles = mobiles;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", dispatchDate=" + dispatchDate
				+ ", quantity=" + quantity + ", cost=" + cost + ", totalCost=" + totalCost + ", status=" + status
				+ ", customer=" + customer + ", mobile=" + mobiles + "]";
	}
	
	
}

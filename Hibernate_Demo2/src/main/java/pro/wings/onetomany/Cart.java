package pro.wings.onetomany;

import java.util.Set;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Cart {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;
private double total;
@OneToMany(mappedBy = "cart")
private Set<Items> items;


public Cart(String name, double total, Set<Items> items) {
	super();
	this.name = name;
	this.total = total;
	this.items = items;
}
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getTotal() {
	return total;
}
public void setTotal(double total) {
	this.total = total;
}
public Set<Items> getItems() {
	return items;
}
public void setItems(Set<Items> items) {
	this.items = items;
}
@Override
public String toString() {
	return "Cart [id=" + id + ", name=" + name + ", total=" + total + ", items=" + items + "]";
}




}

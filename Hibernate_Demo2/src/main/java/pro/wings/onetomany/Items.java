package pro.wings.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "Items_details")
public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String itemId;
	private double itemTotal;
	private int quantity;

	@ManyToOne
	private Cart cart;

	public Items() {
		// TODO Auto-generated constructor stub
	}

public Items( String itemId, double itemTotal, int quantity, Cart cart) {
	super();
	this.itemId = itemId;
	this.itemTotal = itemTotal;
	this.quantity = quantity;
	this.cart = cart;
  }

@Override
public String toString() {
	return "Items [id=" + id + ", itemId=" + itemId + ", itemTotal=" + itemTotal + ", quantity=" + quantity + ", cart="
			+ cart + "]";
}

}
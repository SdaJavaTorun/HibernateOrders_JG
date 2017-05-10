package Entity;


import java.util.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "order", schema = "zamowienie")
public class OrderEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column(name = "user")
    int user_id;

    @ManyToOne
    @JoinColumn(name= "user_id", nullable = false)
    UserEntity user;

    @Column(name = "products", nullable = true, length = 128)
    String products;

    @Column(name = "date", nullable = true, length = 128)
    Date orderdate;

    public OrderEntity() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }
}

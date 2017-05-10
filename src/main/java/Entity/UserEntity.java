package Entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user", schema = "zamowienie")
public class UserEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @Column (name="name")
    String name;

    @Column (name="last_Name")
    String lastName;

    @Column (name="address")
    String address;

    @OneToMany(mappedBy = "user")
    List<OrderEntity> ordersList;

    public UserEntity() {
    }

    public int getId() {
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<OrderEntity> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<OrderEntity> ordersList) {
        this.ordersList = ordersList;
    }
}

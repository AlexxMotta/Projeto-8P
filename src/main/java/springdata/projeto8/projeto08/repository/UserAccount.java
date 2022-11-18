package springdata.projeto8.projeto08.repository;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserAccount {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String password;
    @OneToOne
    private PaymentInfo paymentInfo;

}
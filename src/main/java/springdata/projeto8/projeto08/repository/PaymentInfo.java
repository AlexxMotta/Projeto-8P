package springdata.projeto8.projeto08.repository;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PaymentInfo {
    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    private CreditCard creditCard;
    private String cardNumber;
    @Temporal(TemporalType.DATE)
    private Date expirationDate;
    @OneToOne
    private UserAccount user;

}

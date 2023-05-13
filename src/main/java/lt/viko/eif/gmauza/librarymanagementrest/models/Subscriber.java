package lt.viko.eif.gmauza.librarymanagementrest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Subscriber {

    @Id
    @GeneratedValue
    protected Long subscriberId;
    protected String subscriberName;
    protected String subscriberLastName;
    protected String address;
    protected String email;
    protected String phone;
    @OneToOne
    protected Borrowings borrowings;

    public Subscriber(String subscriberName, String subscriberLastName, String address, String email, String phone, Borrowings borrowings) {
        this.subscriberName = subscriberName;
        this.subscriberLastName = subscriberLastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.borrowings = borrowings;
    }

    public Subscriber(String subscriberName, String subscriberLastName, String address, String email, String phone) {
        this.subscriberName = subscriberName;
        this.subscriberLastName = subscriberLastName;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public Subscriber() {
    }

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriberId(Long value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the subscriberName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberName() {
        return subscriberName;
    }

    /**
     * Sets the value of the subscriberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberName(String value) {
        this.subscriberName = value;
    }

    /**
     * Gets the value of the subscriberLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberLastName() {
        return subscriberLastName;
    }

    /**
     * Sets the value of the subscriberLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberLastName(String value) {
        this.subscriberLastName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the borrowings property.
     * 
     * @return
     *     possible object is
     *     {@link Borrowings }
     *     
     */
    public Borrowings getBorrowings() {
        return borrowings;
    }

    /**
     * Sets the value of the borrowings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Borrowings }
     *     
     */
    public void setBorrowings(Borrowings value) {
        this.borrowings = value;
    }


}

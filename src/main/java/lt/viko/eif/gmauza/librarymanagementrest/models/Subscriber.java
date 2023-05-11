package lt.viko.eif.gmauza.librarymanagementwscontractlast.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriber", propOrder = {
    "subscriberId",
    "subscriberName",
    "subscriberLastName",
    "address",
    "email",
    "phone",
    "borrowings"
})
public class Subscriber {

    @XmlElement(name = "subscriber-id", required = true)
    protected String subscriberId;
    @XmlElement(name = "subscriber-name", required = true)
    protected String subscriberName;
    @XmlElement(name = "subscriber-last-name", required = true)
    protected String subscriberLastName;
    @XmlElement(required = true)
    protected String address;
    @XmlElement(required = true)
    protected String email;
    @XmlElement(required = true)
    protected String phone;
    @XmlElement(required = true)
    protected Borrowings borrowings;

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
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

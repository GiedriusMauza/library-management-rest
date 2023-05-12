package lt.viko.eif.gmauza.librarymanagementrest.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Borrowing {

    @Id
    @GeneratedValue
    protected Long borrowingId;
    protected String borrowDate;
    protected String returnDate;
    @OneToOne
    protected Item item;

    public Borrowing(String borrowDate, String returnDate, Item item) {
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.item = item;
    }

    public Borrowing() {
    }

    /**
     * Gets the value of the borrowingId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBorrowingId() {
        return borrowingId;
    }

    /**
     * Sets the value of the borrowingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBorrowingId(Long value) {
        this.borrowingId = value;
    }

    /**
     * Gets the value of the borrowDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowDate() {
        return borrowDate;
    }

    /**
     * Sets the value of the borrowDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowDate(String value) {
        this.borrowDate = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link Item }
     *     
     */
    public Item getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link Item }
     *     
     */
    public void setItem(Item value) {
        this.item = value;
    }


}

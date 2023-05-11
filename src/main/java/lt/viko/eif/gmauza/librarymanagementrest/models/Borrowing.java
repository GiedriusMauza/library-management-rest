package lt.viko.eif.gmauza.librarymanagementrest.models;



public class Borrowing {

    protected int borrowingId;
    protected String borrowDate;
    protected String returnDate;
    protected Item item;

    /**
     * Gets the value of the borrowingId property.
     * 
     * @return
     *     possible object is
     *     {@link int }
     *     
     */
    public int getBorrowingId() {
        return borrowingId;
    }

    /**
     * Sets the value of the borrowingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link int }
     *     
     */
    public void setBorrowingId(int value) {
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

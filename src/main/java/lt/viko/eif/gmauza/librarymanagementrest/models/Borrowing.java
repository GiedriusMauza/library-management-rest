package lt.viko.eif.gmauza.librarymanagementwscontractlast.models;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrowing", propOrder = {
    "borrowingId",
    "borrowDate",
    "returnDate",
    "item"
})
public class Borrowing {

    @XmlElement(name = "borrowing-id", required = true)
    protected String borrowingId;
    @XmlElement(name = "borrow-date", required = true)
    protected String borrowDate;
    @XmlElement(name = "return-date", required = true)
    protected String returnDate;
    @XmlElement(required = true)
    protected Item item;

    /**
     * Gets the value of the borrowingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorrowingId() {
        return borrowingId;
    }

    /**
     * Sets the value of the borrowingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorrowingId(String value) {
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

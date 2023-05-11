package lt.viko.eif.gmauza.librarymanagementwscontractlast.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "item", propOrder = {
    "itemId",
    "author",
    "copiesNumber",
    "productionYear",
    "publisher",
    "status",
    "title"
})
public class Item {

    @XmlElement(name = "item-id", required = true)
    protected String itemId;
    @XmlElement(required = true)
    protected String author;
    @XmlElement(name = "copies-number", required = true)
    protected String copiesNumber;
    @XmlElement(name = "production-year", required = true)
    protected String productionYear;
    @XmlElement(required = true)
    protected String publisher;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String title;

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the copiesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopiesNumber() {
        return copiesNumber;
    }

    /**
     * Sets the value of the copiesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopiesNumber(String value) {
        this.copiesNumber = value;
    }

    /**
     * Gets the value of the productionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductionYear() {
        return productionYear;
    }

    /**
     * Sets the value of the productionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductionYear(String value) {
        this.productionYear = value;
    }

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisher(String value) {
        this.publisher = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}

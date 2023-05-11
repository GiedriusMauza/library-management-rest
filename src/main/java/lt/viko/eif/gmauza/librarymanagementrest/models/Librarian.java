package lt.viko.eif.gmauza.librarymanagementwscontractlast.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "librarian", propOrder = {
    "librarianId",
    "librarianEmail",
    "librarianName",
    "lastName",
    "phoneNumber"
})
public class Librarian {

    @XmlElement(name = "librarian-id", required = true)
    protected String librarianId;
    @XmlElement(name = "librarian-email", required = true)
    protected String librarianEmail;
    @XmlElement(name = "librarian-name", required = true)
    protected String librarianName;
    @XmlElement(name = "last-name", required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String phoneNumber;

    /**
     * Gets the value of the librarianId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarianId() {
        return librarianId;
    }

    /**
     * Sets the value of the librarianId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarianId(String value) {
        this.librarianId = value;
    }

    /**
     * Gets the value of the librarianEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarianEmail() {
        return librarianEmail;
    }

    /**
     * Sets the value of the librarianEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarianEmail(String value) {
        this.librarianEmail = value;
    }

    /**
     * Gets the value of the librarianName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibrarianName() {
        return librarianName;
    }

    /**
     * Sets the value of the librarianName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibrarianName(String value) {
        this.librarianName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

}

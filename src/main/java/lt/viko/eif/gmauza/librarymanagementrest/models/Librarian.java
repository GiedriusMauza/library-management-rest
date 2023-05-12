package lt.viko.eif.gmauza.librarymanagementrest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Librarian {

    @Id
    @GeneratedValue
    protected Long  librarianId;
    protected String librarianEmail;
    protected String librarianName;
    protected String lastName;
    protected String phoneNumber;

    public Librarian(String librarianEmail, String librarianName, String lastName, String phoneNumber) {
        this.librarianEmail = librarianEmail;
        this.librarianName = librarianName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Librarian() {
    }

    /**
     * Gets the value of the librarianId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLibrarianId() {
        return librarianId;
    }

    /**
     * Sets the value of the librarianId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLibrarianId(Long value) {
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

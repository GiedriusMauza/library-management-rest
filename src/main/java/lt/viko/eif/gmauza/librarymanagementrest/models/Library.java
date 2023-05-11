package lt.viko.eif.gmauza.librarymanagementwscontractlast.models;

public class Library {


    protected String libraryId;

    protected String libraryAddress;

    protected String libraryName;

    protected String workHours;

    protected Librarian librarian;

    protected Subscribers subscribers;

    /**
     * Gets the value of the libraryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryId() {
        return libraryId;
    }

    /**
     * Sets the value of the libraryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryId(String value) {
        this.libraryId = value;
    }

    /**
     * Gets the value of the libraryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryAddress() {
        return libraryAddress;
    }

    /**
     * Sets the value of the libraryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryAddress(String value) {
        this.libraryAddress = value;
    }

    /**
     * Gets the value of the libraryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the value of the libraryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryName(String value) {
        this.libraryName = value;
    }

    /**
     * Gets the value of the workHours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkHours() {
        return workHours;
    }

    /**
     * Sets the value of the workHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkHours(String value) {
        this.workHours = value;
    }

    /**
     * Gets the value of the librarian property.
     * 
     * @return
     *     possible object is
     *     {@link Librarian }
     *     
     */
    public Librarian getLibrarian() {
        return librarian;
    }

    /**
     * Sets the value of the librarian property.
     * 
     * @param value
     *     allowed object is
     *     {@link Librarian }
     *     
     */
    public void setLibrarian(Librarian value) {
        this.librarian = value;
    }

    /**
     * Gets the value of the subscribers property.
     * 
     * @return
     *     possible object is
     *     {@link Subscribers }
     *     
     */
    public Subscribers getSubscribers() {
        return subscribers;
    }

    /**
     * Sets the value of the subscribers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Subscribers }
     *     
     */
    public void setSubscribers(Subscribers value) {
        this.subscribers = value;
    }

}

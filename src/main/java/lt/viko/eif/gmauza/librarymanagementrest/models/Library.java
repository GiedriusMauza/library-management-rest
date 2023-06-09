package lt.viko.eif.gmauza.librarymanagementrest.models;

import jakarta.persistence.*;
import org.springframework.hateoas.RepresentationModel;

import java.util.Objects;

@Entity
public class Library extends RepresentationModel<Library> {

    @Id
    @GeneratedValue
    private Long id;
    private String libraryName;
    private String libraryAddress;
    private String workHours;
    @OneToOne
    private Librarian librarian;
    @OneToOne
    private Subscribers subscribers;

    /**
     * Constructor for a Library object with a librarian and subscribers.
     *
     * @param libraryName    The name of the library.
     * @param libraryAddress The address of the library.
     * @param workHours      The working hours of the library.
     * @param librarian      The Librarian who manages the library.
     * @param subscribers    The Subscribers who borrow books from the library.
     */
    public Library(String libraryName, String libraryAddress, String workHours, Librarian librarian, Subscribers subscribers) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.workHours = workHours;
        this.librarian = librarian;
        this.subscribers = subscribers;
    }

    public Library(String libraryName, String libraryAddress, String workHours, Librarian librarian) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.workHours = workHours;
        this.librarian = librarian;
    }

    /**
     * Constructor for a Library object without a librarian or subscribers.
     *
     * @param libraryName    The name of the library.
     * @param libraryAddress The address of the library.
     * @param workHours      The working hours of the library.
     */
    public Library(String libraryName, String libraryAddress, String workHours) {
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.workHours = workHours;
    }

    /**
     * Constructs a new Library object.
     */
    public Library() {
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the libraryAddress property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLibraryAddress() {
        return libraryAddress;
    }

    /**
     * Sets the value of the libraryAddress property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLibraryAddress(String value) {
        this.libraryAddress = value;
    }

    /**
     * Gets the value of the libraryName property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the value of the libraryName property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLibraryName(String value) {
        this.libraryName = value;
    }

    /**
     * Gets the value of the workHours property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getWorkHours() {
        return workHours;
    }

    /**
     * Sets the value of the workHours property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setWorkHours(String value) {
        this.workHours = value;
    }

    /**
     * Gets the value of the librarian property.
     *
     * @return possible object is
     * {@link Librarian }
     */
    public Librarian getLibrarian() {
        return librarian;
    }

    /**
     * Sets the value of the librarian property.
     *
     * @param value allowed object is
     *              {@link Librarian }
     */
    public void setLibrarian(Librarian value) {
        this.librarian = value;
    }

    /**
     * Gets the value of the subscribers' property.
     *
     * @return possible object is
     * {@link Subscribers }
     */
    public Subscribers getSubscribers() {
        return subscribers;
    }

    /**
     * Sets the value of the subscribers' property.
     *
     * @param value allowed object is
     *              {@link Subscribers }
     */
    public void setSubscribers(Subscribers value) {
        this.subscribers = value;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Library library)) return false;
        return Objects.equals(this.id, library.id)
                && Objects.equals(this.libraryName, library.libraryName)
                && Objects.equals(this.libraryAddress, library.libraryAddress)
                && Objects.equals(this.workHours, library.workHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.libraryName, this.libraryAddress, this.workHours);
    }

    @Override
    public String toString() {
        return "Library{"
                + "id=" + this.id
                + ", name='" + this.libraryName + '\''
                + ", address='" + this.libraryAddress + '\''
                + ", hours='" + this.workHours + '\'' + '}';
    }

}

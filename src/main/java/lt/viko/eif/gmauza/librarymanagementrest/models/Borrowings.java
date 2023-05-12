package lt.viko.eif.gmauza.librarymanagementrest.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Borrowings {

    @OneToMany
    protected List<Borrowing> borrowing;

    @Id
    @GeneratedValue
    private Long id;

    public Borrowings(List<Borrowing> borrowing) {
        this.borrowing = borrowing;
    }

    public Borrowings() {
    }

    /**
     * Gets the value of the borrowing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borrowing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorrowing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Borrowing }
     * 
     * 
     */
    public List<Borrowing> getBorrowing() {
        if (borrowing == null) {
            borrowing = new ArrayList<Borrowing>();
        }
        return this.borrowing;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

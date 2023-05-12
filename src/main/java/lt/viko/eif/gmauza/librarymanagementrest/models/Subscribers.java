package lt.viko.eif.gmauza.librarymanagementrest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Subscribers {

    @OneToMany
    protected List<Subscriber> subscriber;

    @Id @GeneratedValue
    private Long id;

    public Subscribers(List<Subscriber> subscriber) {
        this.subscriber = subscriber;
    }

    public Subscribers() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    /**
     * Gets the value of the subscriber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore, any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subscriber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscriber }
     * 
     * 
     */

    public List<Subscriber> getSubscriber() {
        if (subscriber == null) {
            subscriber = new ArrayList<Subscriber>();
        }
        return this.subscriber;
    }


}

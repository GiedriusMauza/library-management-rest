package lt.viko.eif.gmauza.librarymanagementwscontractlast.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "borrowings", propOrder = {
    "borrowing"
})
public class Borrowings {

    protected List<Borrowing> borrowing;

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

}

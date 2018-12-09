package Classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "CHALLAN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Challan.findAll", query = "SELECT c FROM Challan c")
    , @NamedQuery(name = "Challan.findById", query = "SELECT c FROM Challan c WHERE c.id = :id")
    , @NamedQuery(name = "Challan.findByAmount", query = "SELECT c FROM Challan c WHERE c.amount = :amount")
    , @NamedQuery(name = "Challan.findByReason", query = "SELECT c FROM Challan c WHERE c.reason = :reason")
    , @NamedQuery(name = "Challan.findByDuedate", query = "SELECT c FROM Challan c WHERE c.duedate = :duedate")
    , @NamedQuery(name = "Challan.findByIssuedate", query = "SELECT c FROM Challan c WHERE c.issuedate = :issuedate")
    , @NamedQuery(name = "Challan.findByRegistrationnumber", query = "SELECT c FROM Challan c WHERE c.registrationnumber = :registrationnumber")})
public class Challan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "AMOUNT")
    private int amount;
    @Basic(optional = false)
    @Column(name = "REASON")
    private String reason;
    @Basic(optional = false)
    @Column(name = "DUEDATE")
    @Temporal(TemporalType.DATE)
    private Date duedate;
    @Basic(optional = false)
    @Column(name = "ISSUEDATE")
    @Temporal(TemporalType.DATE)
    private Date issuedate;
    @Basic(optional = false)
    @Column(name = "REGISTRATIONNUMBER")
    private String registrationnumber;

    public Challan() {
    }

    public Challan(Integer id) {
        this.id = id;
    }

    public Challan(Integer id, int amount, String reason, Date duedate, Date issuedate, String registrationnumber) {
        this.id = id;
        this.amount = amount;
        this.reason = reason;
        this.duedate = duedate;
        this.issuedate = issuedate;
        this.registrationnumber = registrationnumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public String getRegistrationnumber() {
        return registrationnumber;
    }

    public void setRegistrationnumber(String registrationnumber) {
        this.registrationnumber = registrationnumber;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Challan)) {
            return false;
        }
        Challan other = (Challan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Challan[ id=" + id + " ]";
    }
    
}

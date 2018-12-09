package Classes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "NOTIFICATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notification.findAll", query = "SELECT n FROM Notification n")
    , @NamedQuery(name = "Notification.findById", query = "SELECT n FROM Notification n WHERE n.id = :id")
    , @NamedQuery(name = "Notification.findByCnic", query = "SELECT n FROM Notification n WHERE n.cnic = :cnic")
    , @NamedQuery(name = "Notification.findByPhone", query = "SELECT n FROM Notification n WHERE n.phone = :phone")
    , @NamedQuery(name = "Notification.findByDescription", query = "SELECT n FROM Notification n WHERE n.description = :description")
    , @NamedQuery(name = "Notification.findByLocation", query = "SELECT n FROM Notification n WHERE n.location = :location")
    , @NamedQuery(name = "Notification.findByStatus", query = "SELECT n FROM Notification n WHERE n.status = :status")
    , @NamedQuery(name = "Notification.findByCategory", query = "SELECT n FROM Notification n WHERE n.category = :category")
    , @NamedQuery(name = "Notification.updateById", query = "UPDATE Notification n SET n.status = :status WHERE n.id = :id")})
public class Notification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "CNIC")
    private String cnic;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private String phone;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "LOCATION")
    private String location;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private int status;
    @Basic(optional = false)
    @Column(name = "CATEGORY")
    @Enumerated(EnumType.STRING)
    private Category category;

    public Notification() {
    }

    public Notification(Integer id) {
        this.id = id;
    }

    public Notification(Integer id, String cnic, String phone, String description, String location, int status, Category category) {
        this.id = id;
        this.cnic = cnic;
        this.phone = phone;
        this.description = description;
        this.location = location;
        this.status = status;
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notification)) {
            return false;
        }
        Notification other = (Notification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Classes.Notification[ id=" + id + " ]";
    }
    
}

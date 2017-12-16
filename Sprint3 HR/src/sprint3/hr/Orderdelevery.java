/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint3.hr;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Com User
 */
@Entity
@Table(name = "ORDERDELEVERY", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Orderdelevery.findAll", query = "SELECT o FROM Orderdelevery o"),
    @NamedQuery(name = "Orderdelevery.findByOrderid", query = "SELECT o FROM Orderdelevery o WHERE o.orderid = :orderid"),
    @NamedQuery(name = "Orderdelevery.findById", query = "SELECT o FROM Orderdelevery o WHERE o.id = :id"),
    @NamedQuery(name = "Orderdelevery.findByName", query = "SELECT o FROM Orderdelevery o WHERE o.name = :name"),
    @NamedQuery(name = "Orderdelevery.findByContact", query = "SELECT o FROM Orderdelevery o WHERE o.contact = :contact"),
    @NamedQuery(name = "Orderdelevery.findByTime", query = "SELECT o FROM Orderdelevery o WHERE o.time = :time"),
    @NamedQuery(name = "Orderdelevery.findByDate", query = "SELECT o FROM Orderdelevery o WHERE o.date = :date"),
    @NamedQuery(name = "Orderdelevery.findByOrderstatus", query = "SELECT o FROM Orderdelevery o WHERE o.orderstatus = :orderstatus")})
public class Orderdelevery implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDERID")
    private String orderid;
    @Column(name = "ID")
    private String id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "TIME")
    private String time;
    @Column(name = "DATE")
    private String date;
    @Column(name = "ORDERSTATUS")
    private String orderstatus;

    public Orderdelevery() {
    }

    public Orderdelevery(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        String oldOrderid = this.orderid;
        this.orderid = orderid;
        changeSupport.firePropertyChange("orderid", oldOrderid, orderid);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        String oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        String oldTime = this.time;
        this.time = time;
        changeSupport.firePropertyChange("time", oldTime, time);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        String oldOrderstatus = this.orderstatus;
        this.orderstatus = orderstatus;
        changeSupport.firePropertyChange("orderstatus", oldOrderstatus, orderstatus);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdelevery)) {
            return false;
        }
        Orderdelevery other = (Orderdelevery) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sprint3.hr.Orderdelevery[ orderid=" + orderid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

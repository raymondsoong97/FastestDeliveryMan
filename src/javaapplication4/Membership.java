/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

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
 * @author RPG
 */
@Entity
@Table(name = "MEMBERSHIP", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Membership.findAll", query = "SELECT m FROM Membership m"),
    @NamedQuery(name = "Membership.findByMemid", query = "SELECT m FROM Membership m WHERE m.memid = :memid"),
    @NamedQuery(name = "Membership.findByMemname", query = "SELECT m FROM Membership m WHERE m.memname = :memname"),
    @NamedQuery(name = "Membership.findByContactno", query = "SELECT m FROM Membership m WHERE m.contactno = :contactno"),
    @NamedQuery(name = "Membership.findByIc", query = "SELECT m FROM Membership m WHERE m.ic = :ic")})
public class Membership implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MEMID")
    private String memid;
    @Column(name = "MEMNAME")
    private String memname;
    @Column(name = "CONTACTNO")
    private String contactno;
    @Column(name = "IC")
    private String ic;

    public Membership() {
    }

    public Membership(String memid) {
        this.memid = memid;
    }

    public String getMemid() {
        return memid;
    }

    public void setMemid(String memid) {
        String oldMemid = this.memid;
        this.memid = memid;
        changeSupport.firePropertyChange("memid", oldMemid, memid);
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        String oldMemname = this.memname;
        this.memname = memname;
        changeSupport.firePropertyChange("memname", oldMemname, memname);
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        String oldContactno = this.contactno;
        this.contactno = contactno;
        changeSupport.firePropertyChange("contactno", oldContactno, contactno);
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        String oldIc = this.ic;
        this.ic = ic;
        changeSupport.firePropertyChange("ic", oldIc, ic);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (memid != null ? memid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membership)) {
            return false;
        }
        Membership other = (Membership) object;
        if ((this.memid == null && other.memid != null) || (this.memid != null && !this.memid.equals(other.memid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Membership[ memid=" + memid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

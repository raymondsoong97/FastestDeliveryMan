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
@Table(name = "LOGIN", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Login_1.findAll", query = "SELECT l FROM Login_1 l"),
    @NamedQuery(name = "Login_1.findById", query = "SELECT l FROM Login_1 l WHERE l.id = :id"),
    @NamedQuery(name = "Login_1.findByPasswd", query = "SELECT l FROM Login_1 l WHERE l.passwd = :passwd"),
    @NamedQuery(name = "Login_1.findByName", query = "SELECT l FROM Login_1 l WHERE l.name = :name"),
    @NamedQuery(name = "Login_1.findByContact", query = "SELECT l FROM Login_1 l WHERE l.contact = :contact"),
    @NamedQuery(name = "Login_1.findByIc", query = "SELECT l FROM Login_1 l WHERE l.ic = :ic"),
    @NamedQuery(name = "Login_1.findByPosition", query = "SELECT l FROM Login_1 l WHERE l.position = :position")})
public class Login_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "PASSWD")
    private String passwd;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CONTACT")
    private String contact;
    @Column(name = "IC")
    private String ic;
    @Column(name = "POSITION")
    private String position;

    public Login_1() {
    }

    public Login_1(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        String oldPasswd = this.passwd;
        this.passwd = passwd;
        changeSupport.firePropertyChange("passwd", oldPasswd, passwd);
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

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        String oldIc = this.ic;
        this.ic = ic;
        changeSupport.firePropertyChange("ic", oldIc, ic);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
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
        if (!(object instanceof Login_1)) {
            return false;
        }
        Login_1 other = (Login_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Login_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

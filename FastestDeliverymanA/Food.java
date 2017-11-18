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
@Table(name = "FOOD", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Food.findAll", query = "SELECT f FROM Food f"),
    @NamedQuery(name = "Food.findByFoodid", query = "SELECT f FROM Food f WHERE f.foodid = :foodid"),
    @NamedQuery(name = "Food.findByFoodname", query = "SELECT f FROM Food f WHERE f.foodname = :foodname"),
    @NamedQuery(name = "Food.findByFoodprice", query = "SELECT f FROM Food f WHERE f.foodprice = :foodprice"),
    @NamedQuery(name = "Food.findByCategory", query = "SELECT f FROM Food f WHERE f.category = :category"),
    @NamedQuery(name = "Food.findByStatus", query = "SELECT f FROM Food f WHERE f.status = :status")})
public class Food implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FOODID")
    private String foodid;
    @Column(name = "FOODNAME")
    private String foodname;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FOODPRICE")
    private Double foodprice;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "STATUS")
    private String status;

    public Food() {
    }

    public Food(String foodid) {
        this.foodid = foodid;
    }

    public String getFoodid() {
        return foodid;
    }

    public void setFoodid(String foodid) {
        String oldFoodid = this.foodid;
        this.foodid = foodid;
        changeSupport.firePropertyChange("foodid", oldFoodid, foodid);
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        String oldFoodname = this.foodname;
        this.foodname = foodname;
        changeSupport.firePropertyChange("foodname", oldFoodname, foodname);
    }

    public Double getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(Double foodprice) {
        Double oldFoodprice = this.foodprice;
        this.foodprice = foodprice;
        changeSupport.firePropertyChange("foodprice", oldFoodprice, foodprice);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        String oldCategory = this.category;
        this.category = category;
        changeSupport.firePropertyChange("category", oldCategory, category);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (foodid != null ? foodid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Food)) {
            return false;
        }
        Food other = (Food) object;
        if ((this.foodid == null && other.foodid != null) || (this.foodid != null && !this.foodid.equals(other.foodid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication4.Food[ foodid=" + foodid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

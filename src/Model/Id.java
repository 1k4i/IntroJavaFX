/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dylan
 */
@Entity
@Table(name = "ID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Id.findAll", query = "SELECT i FROM Id i")
    , @NamedQuery(name = "Id.findById", query = "SELECT i FROM Id i WHERE i.id = :id")
    , @NamedQuery(name = "Id.findByFollowers", query = "SELECT i FROM Id i WHERE i.followers = :followers")
    , @NamedQuery(name = "Id.findByActive", query = "SELECT i FROM Id i WHERE i.active = :active")})
public class Id implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "NAME")
    private String name;
    @Column(name = "FOLLOWERS")
    private Integer followers;
    @Basic(optional = false)
    @Column(name = "ACTIVE")
    private Boolean active;

    public Id() {
    }

    public Id(Integer id) {
        this.id = id;
    }

    public Id(Integer id, String name, Boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
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
        if (!(object instanceof Id)) {
            return false;
        }
        Id other = (Id) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Id[ id=" + id + " ]";
    }
    
}

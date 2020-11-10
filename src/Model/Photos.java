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
import javax.persistence.Id;
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
@Table(name = "PHOTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Photos.findAll", query = "SELECT p FROM Photos p")
    , @NamedQuery(name = "Photos.findByPhotoid", query = "SELECT p FROM Photos p WHERE p.photoid = :photoid")})
public class Photos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PHOTOID")
    private Integer photoid;
    @Lob
    @Column(name = "CAPTION")
    private String caption;

    public Photos() {
    }

    public Photos(Integer photoid) {
        this.photoid = photoid;
    }

    public Integer getPhotoid() {
        return photoid;
    }

    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (photoid != null ? photoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Photos)) {
            return false;
        }
        Photos other = (Photos) object;
        if ((this.photoid == null && other.photoid != null) || (this.photoid != null && !this.photoid.equals(other.photoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Photos[ photoid=" + photoid + " ]";
    }
    
}

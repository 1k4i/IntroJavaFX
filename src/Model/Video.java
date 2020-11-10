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
@Table(name = "VIDEO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Video.findAll", query = "SELECT v FROM Video v")
    , @NamedQuery(name = "Video.findByVideoid", query = "SELECT v FROM Video v WHERE v.videoid = :videoid")})
public class Video implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VIDEOID")
    private Integer videoid;
    @Lob
    @Column(name = "CAPTION")
    private String caption;

    public Video() {
    }

    public Video(Integer videoid) {
        this.videoid = videoid;
    }

    public Integer getVideoid() {
        return videoid;
    }

    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
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
        hash += (videoid != null ? videoid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Video)) {
            return false;
        }
        Video other = (Video) object;
        if ((this.videoid == null && other.videoid != null) || (this.videoid != null && !this.videoid.equals(other.videoid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Video[ videoid=" + videoid + " ]";
    }
    
}

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
@Table(name = "INBOX")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inbox.findAll", query = "SELECT i FROM Inbox i")
    , @NamedQuery(name = "Inbox.findByNotificationid", query = "SELECT i FROM Inbox i WHERE i.notificationid = :notificationid")
    , @NamedQuery(name = "Inbox.findByNumnotifications", query = "SELECT i FROM Inbox i WHERE i.numnotifications = :numnotifications")})
public class Inbox implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NOTIFICATIONID")
    private Integer notificationid;
    @Column(name = "NUMNOTIFICATIONS")
    private Integer numnotifications;
    @Basic(optional = false)
    @Lob
    @Column(name = "NOTIFICATIONTITLE")
    private String notificationtitle;
    @Lob
    @Column(name = "FROMUSER")
    private String fromuser;

    public Inbox() {
    }

    public Inbox(Integer notificationid) {
        this.notificationid = notificationid;
    }

    public Inbox(Integer notificationid, String notificationtitle) {
        this.notificationid = notificationid;
        this.notificationtitle = notificationtitle;
    }

    public Integer getNotificationid() {
        return notificationid;
    }

    public void setNotificationid(Integer notificationid) {
        this.notificationid = notificationid;
    }

    public Integer getNumnotifications() {
        return numnotifications;
    }

    public void setNumnotifications(Integer numnotifications) {
        this.numnotifications = numnotifications;
    }

    public String getNotificationtitle() {
        return notificationtitle;
    }

    public void setNotificationtitle(String notificationtitle) {
        this.notificationtitle = notificationtitle;
    }

    public String getFromuser() {
        return fromuser;
    }

    public void setFromuser(String fromuser) {
        this.fromuser = fromuser;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (notificationid != null ? notificationid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inbox)) {
            return false;
        }
        Inbox other = (Inbox) object;
        if ((this.notificationid == null && other.notificationid != null) || (this.notificationid != null && !this.notificationid.equals(other.notificationid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Inbox[ notificationid=" + notificationid + " ]";
    }
    
}

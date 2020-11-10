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
@Table(name = "COMMENTS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comments.findAll", query = "SELECT c FROM Comments c")
    , @NamedQuery(name = "Comments.findByCommentid", query = "SELECT c FROM Comments c WHERE c.commentid = :commentid")
    , @NamedQuery(name = "Comments.findByNumlikes", query = "SELECT c FROM Comments c WHERE c.numlikes = :numlikes")
    , @NamedQuery(name = "Comments.findByNumreplies", query = "SELECT c FROM Comments c WHERE c.numreplies = :numreplies")})
public class Comments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COMMENTID")
    private Integer commentid;
    @Basic(optional = false)
    @Lob
    @Column(name = "COMMENTTITLE")
    private String commenttitle;
    @Basic(optional = false)
    @Lob
    @Column(name = "FROMUSER")
    private String fromuser;
    @Column(name = "NUMLIKES")
    private Integer numlikes;
    @Column(name = "NUMREPLIES")
    private Integer numreplies;

    public Comments() {
    }

    public Comments(Integer commentid) {
        this.commentid = commentid;
    }

    public Comments(Integer commentid, String commenttitle, String fromuser) {
        this.commentid = commentid;
        this.commenttitle = commenttitle;
        this.fromuser = fromuser;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getCommenttitle() {
        return commenttitle;
    }

    public void setCommenttitle(String commenttitle) {
        this.commenttitle = commenttitle;
    }

    public String getFromuser() {
        return fromuser;
    }

    public void setFromuser(String fromuser) {
        this.fromuser = fromuser;
    }

    public Integer getNumlikes() {
        return numlikes;
    }

    public void setNumlikes(Integer numlikes) {
        this.numlikes = numlikes;
    }

    public Integer getNumreplies() {
        return numreplies;
    }

    public void setNumreplies(Integer numreplies) {
        this.numreplies = numreplies;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commentid != null ? commentid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comments)) {
            return false;
        }
        Comments other = (Comments) object;
        if ((this.commentid == null && other.commentid != null) || (this.commentid != null && !this.commentid.equals(other.commentid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Comments[ commentid=" + commentid + " ]";
    }
    
}

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
@Table(name = "FORUM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Forum.findAll", query = "SELECT f FROM Forum f")
    , @NamedQuery(name = "Forum.findById", query = "SELECT f FROM Forum f WHERE f.id = :id")
    , @NamedQuery(name = "Forum.findByFollowers", query = "SELECT f FROM Forum f WHERE f.followers = :followers")
    , @NamedQuery(name = "Forum.findByRecipecount", query = "SELECT f FROM Forum f WHERE f.recipecount = :recipecount")
    , @NamedQuery(name = "Forum.findByFollowing", query = "SELECT f FROM Forum f WHERE f.following = :following")})
public class Forum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "FOLLOWERS")
    private int followers;
    @Basic(optional = false)
    @Column(name = "RECIPECOUNT")
    private int recipecount;
    @Basic(optional = false)
    @Column(name = "FOLLOWING")
    private Boolean following;

    public Forum() {
    }

    public Forum(Integer id) {
        this.id = id;
    }

    public Forum(Integer id, String title, int followers, int recipecount, Boolean following) {
        this.id = id;
        this.title = title;
        this.followers = followers;
        this.recipecount = recipecount;
        this.following = following;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getRecipecount() {
        return recipecount;
    }

    public void setRecipecount(int recipecount) {
        this.recipecount = recipecount;
    }

    public Boolean getFollowing() {
        return following;
    }

    public void setFollowing(Boolean following) {
        this.following = following;
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
        if (!(object instanceof Forum)) {
            return false;
        }
        Forum other = (Forum) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Forum[ id=" + id + " ]";
    }
    
}

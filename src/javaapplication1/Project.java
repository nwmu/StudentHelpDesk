/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author nandu
 */
@Entity
@Table(name = "PROJECT", catalog = "", schema = "NANDU")
@NamedQueries({
    @NamedQuery(name = "Project.findAll", query = "SELECT p FROM Project p"),
    @NamedQuery(name = "Project.findByRefcode", query = "SELECT p FROM Project p WHERE p.refcode = :refcode"),
    @NamedQuery(name = "Project.findByTitle", query = "SELECT p FROM Project p WHERE p.title = :title"),
    @NamedQuery(name = "Project.findByTool", query = "SELECT p FROM Project p WHERE p.tool = :tool"),
    @NamedQuery(name = "Project.findByLan", query = "SELECT p FROM Project p WHERE p.lan = :lan"),
    @NamedQuery(name = "Project.findByDlink", query = "SELECT p FROM Project p WHERE p.dlink = :dlink"),
    @NamedQuery(name = "Project.findBySlink", query = "SELECT p FROM Project p WHERE p.slink = :slink"),
    @NamedQuery(name = "Project.findBySolb", query = "SELECT p FROM Project p WHERE p.solb = :solb")})
public class Project implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REFCODE")
    private String refcode;
    @Column(name = "TITLE")
    private String title;
    @Lob
    @Column(name = "IDEA")
    private String idea;
    @Column(name = "TOOL")
    private String tool;
    @Column(name = "LAN")
    private String lan;
    @Lob
    @Column(name = "SUG")
    private String sug;
    @Column(name = "DLINK")
    private String dlink;
    @Column(name = "SLINK")
    private String slink;
    @Column(name = "SOLB")
    private String solb;
    @Lob
    @Column(name = "REF")
    private String ref;

    public Project() {
    }

    public Project(String refcode) {
        this.refcode = refcode;
    }

    public String getRefcode() {
        return refcode;
    }

    public void setRefcode(String refcode) {
        String oldRefcode = this.refcode;
        this.refcode = refcode;
        changeSupport.firePropertyChange("refcode", oldRefcode, refcode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        String oldTitle = this.title;
        this.title = title;
        changeSupport.firePropertyChange("title", oldTitle, title);
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        String oldIdea = this.idea;
        this.idea = idea;
        changeSupport.firePropertyChange("idea", oldIdea, idea);
    }

    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        String oldTool = this.tool;
        this.tool = tool;
        changeSupport.firePropertyChange("tool", oldTool, tool);
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        String oldLan = this.lan;
        this.lan = lan;
        changeSupport.firePropertyChange("lan", oldLan, lan);
    }

    public String getSug() {
        return sug;
    }

    public void setSug(String sug) {
        String oldSug = this.sug;
        this.sug = sug;
        changeSupport.firePropertyChange("sug", oldSug, sug);
    }

    public String getDlink() {
        return dlink;
    }

    public void setDlink(String dlink) {
        String oldDlink = this.dlink;
        this.dlink = dlink;
        changeSupport.firePropertyChange("dlink", oldDlink, dlink);
    }

    public String getSlink() {
        return slink;
    }

    public void setSlink(String slink) {
        String oldSlink = this.slink;
        this.slink = slink;
        changeSupport.firePropertyChange("slink", oldSlink, slink);
    }

    public String getSolb() {
        return solb;
    }

    public void setSolb(String solb) {
        String oldSolb = this.solb;
        this.solb = solb;
        changeSupport.firePropertyChange("solb", oldSolb, solb);
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        String oldRef = this.ref;
        this.ref = ref;
        changeSupport.firePropertyChange("ref", oldRef, ref);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refcode != null ? refcode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Project)) {
            return false;
        }
        Project other = (Project) object;
        if ((this.refcode == null && other.refcode != null) || (this.refcode != null && !this.refcode.equals(other.refcode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Project[ refcode=" + refcode + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

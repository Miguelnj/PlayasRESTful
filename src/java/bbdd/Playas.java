/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author timon
 */
@Entity
@Table(name = "playas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Playas.findAll", query = "SELECT p FROM Playas p")
    , @NamedQuery(name = "Playas.findById", query = "SELECT p FROM Playas p WHERE p.id = :id")
    , @NamedQuery(name = "Playas.findByName", query = "SELECT p FROM Playas p WHERE p.name = :name")
    , @NamedQuery(name = "Playas.findByComunidad", query = "SELECT p FROM Playas p WHERE p.comunidad = :comunidad")
    , @NamedQuery(name = "Playas.findByProvincia", query = "SELECT p FROM Playas p WHERE p.provincia = :provincia")
    , @NamedQuery(name = "Playas.findByLatitud", query = "SELECT p FROM Playas p WHERE p.latitud = :latitud")
    , @NamedQuery(name = "Playas.findByLongitud", query = "SELECT p FROM Playas p WHERE p.longitud = :longitud")
    , @NamedQuery(name = "Playas.findByIsla", query = "SELECT p FROM Playas p WHERE p.isla = :isla")})
public class Playas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "comunidad")
    private String comunidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "provincia")
    private String provincia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "latitud")
    private double latitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "longitud")
    private double longitud;
    @Size(max = 22)
    @Column(name = "isla")
    private String isla;

    public Playas() {
    }

    public Playas(Integer id) {
        this.id = id;
    }

    public Playas(Integer id, String name, String comunidad, String provincia, double latitud, double longitud) {
        this.id = id;
        this.name = name;
        this.comunidad = comunidad;
        this.provincia = provincia;
        this.latitud = latitud;
        this.longitud = longitud;
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

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getIsla() {
        return isla;
    }

    public void setIsla(String isla) {
        this.isla = isla;
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
        if (!(object instanceof Playas)) {
            return false;
        }
        Playas other = (Playas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bbdd.Playas[ id=" + id + " ]";
    }
    
}

package com.star.domain;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by hp on 2017/3/21.
 */
@Entity
@Table(name = "myplants", schema = "rich_plants", catalog = "")
public class Myplants {
    private int id;
    private Date date;
    private Plant plantsByPlant;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Myplants that = (Myplants) o;

        if (id != that.id) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "plant", referencedColumnName = "id", nullable = false)
    public Plant getPlantsByPlant() {
        return plantsByPlant;
    }

    public void setPlantsByPlant(Plant plantsByPlant) {
        this.plantsByPlant = plantsByPlant;
    }
}

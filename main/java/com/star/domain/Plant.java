package com.star.domain;

import javax.persistence.*;

/**
 * Created by hp on 2017/3/21.
 */
@Entity
@Table(name = "plants", schema = "rich_plants", catalog = "")
public class Plant {
    private int id;
    private String plantname;
    private String category;
    private String imgs;
    private Integer price;
    private String description;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "plantname", nullable = false, length = 45)
    public String getPlantname() {
        return plantname;
    }

    public void setPlantname(String plantname) {
        this.plantname = plantname;
    }

    @Basic
    @Column(name = "category", nullable = false, length = 45)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "imgs", nullable = false, length = 45)
    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    @Basic
    @Column(name = "price", nullable = true)
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "description", nullable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String desc) {
        this.description = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Plant that = (Plant) o;

        if (id != that.id) return false;
        if (plantname != null ? !plantname.equals(that.plantname) : that.plantname != null) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (imgs != null ? !imgs.equals(that.imgs) : that.imgs != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (plantname != null ? plantname.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (imgs != null ? imgs.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }

}

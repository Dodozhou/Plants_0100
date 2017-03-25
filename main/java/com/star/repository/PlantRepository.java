package com.star.repository;

import com.star.domain.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hp on 2017/3/21.
 */
@Repository
public interface PlantRepository extends JpaRepository<Plant,Integer> {
    List<Plant> findByCategoryOrderByPriceDesc(String category);
}

package com.star.repository;

import com.star.domain.Material;
import com.star.domain.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by hp on 2017/3/21.
 */
@Repository
public interface MaterialRepository extends JpaRepository<Material,Integer> {
    List<Material> findByCategoryOrderByPriceDesc(String category);
}

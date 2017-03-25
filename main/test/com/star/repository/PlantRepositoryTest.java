package com.star.repository;

import com.star.config.RootConfig;
import com.star.config.WebConfig;
import com.star.domain.Plant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * Created by hp on 2017/3/21.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebConfig.class, RootConfig.class})
@WebAppConfiguration  //此注解引入Web Context
public class PlantRepositoryTest {
    @Autowired
    PlantRepository repository;
    @Test
    public void plantsTest(){
        List<Plant> plants=repository.findByCategoryOrderByPriceDesc("a");
        for (Plant p: plants) {
            System.out.println(p.getPlantname());
            System.out.println(p.getImgs());
            System.out.println(p.getPrice());
        }

    }

}
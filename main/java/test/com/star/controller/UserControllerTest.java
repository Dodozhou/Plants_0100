package test.com.star.controller; 

import com.star.config.RootConfig;
import com.star.config.WebConfig;
import com.star.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/** 
* UserController Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 20, 2017</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {WebConfig.class, RootConfig.class})
@WebAppConfiguration  //此注解引入Web Context
public class UserControllerTest {
    @Autowired
    UserRepository repository;

    /**
 *
 * Method: index()
 *
 */
@Test
public void testIndex() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: login_page() 
* 
*/ 
@Test
public void testLogin_page() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: login(String username, String password) 
* 
*/ 
@Test
public void testLogin() throws Exception {

    assertNotNull(repository.findByEmailAndPassword("zhouzhou@163.com","123"));
} 


} 

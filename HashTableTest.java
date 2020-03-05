// TODO: add imports as needed

// org.junit.Assert.*; 
import static org.junit.jupiter.api.Assertions.fail;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;




/** TODO: add class header comments here*/
public class HashTableTest{

    // TODO: add other fields that will be used by multiple tests
    
    // TODO: add code that runs before each test method
    @Before
    public void setUp() throws Exception {

    }

    // TODO: add code that runs after each test method
    @After
    public void tearDown() throws Exception {

    }
    
    /** 
     * Tests that a HashTable returns an integer code
     * indicating which collision resolution strategy 
     * is used.
     * REFER TO HashTableADT for valid collision scheme codes.
     */
    @Test
    public void test000_collision_scheme() {
        HashTableADT htIntegerKey = new HashTable<Integer,String>();
        int scheme = htIntegerKey.getCollisionResolution();
        if (scheme < 1 || scheme > 9) 
            fail("collision resolution must be indicated with 1-9");
    }
        
    /** IMPLEMENTED AS EXAMPLE FOR YOU
     * Tests that insert(null,null) throws IllegalNullKeyException
     */
    @Test
    public void test001_IllegalNullKey() {
        try {
            HashTableADT htIntegerKey = new HashTable<Integer,String>();
            htIntegerKey.insert(null, null);
            fail("should not be able to insert null key");
        } 
        catch (IllegalNullKeyException e) { /* expected */ } 
        catch (Exception e) {
            fail("insert null key should not throw exception "+e.getClass().getName());
        }
    }
    
    @Test
    public void test002_insert_one_size_one() {
    	try {
    		HashTable trial = new HashTable(500 , .75); 	//why is this different then test001, design seems to be gray box
    		trial.insert(10, "ten");
    		System.out.println(trial.numKeys());
    		Assert.assertEquals(1, trial.numKeys());
    	}
    	catch (Exception e) {
    		e.printStackTrace();
    		fail("Unexpected Exception occured");
    	}
    }
    
    // TODO add your own tests of your implementation
    
}



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Test091.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Test091
{
    private Granja granja1;
    private Pato pato1;
    private Cerdo cerdo1;
    private Vaca vaca1;
    private Pollo pollo1;

    /**
     * Default constructor for test class Test091
     */
    public Test091()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        granja1 = new Granja();
        pato1 = new Pato();
        cerdo1 = new Cerdo();
        vaca1 = new Vaca();
        pollo1 = new Pollo();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}

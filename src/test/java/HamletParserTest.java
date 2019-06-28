import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        HamletParser hp=new HamletParser();
        Assert.assertEquals(472, hp.findLeon(),0.0001);
    }

    @Test
    public void testChangeHoratioToTariq() {
        HamletParser hp=new HamletParser();
        Assert.assertEquals(158, hp.findTariq(),0.0001);
    }
    @Test
    public void testChangeHamletToLeon1() {
        HamletParser hp=new HamletParser();
        Assert.assertNotEquals(0, hp.findLeon(),0.0001);
    }

    @Test
    public void testChangeHoratioToTariq1() {
        HamletParser hp=new HamletParser();
        Assert.assertNotEquals(0, hp.findTariq(),0.0001);
    }

    @Test
    public void testFindHoratio() {
        HamletParser hp=new HamletParser();
        Assert.assertEquals(158, hp.findHoratio(),0.0001);
    }
    @Test
    public void testFindHoratio1() {
        HamletParser hp=new HamletParser();
        Assert.assertNotEquals(0, hp.findHoratio(),0.0001);
    }

    @Test
    public void testFindHamlet() {
        HamletParser hp=new HamletParser();
        Assert.assertEquals(472, hp.findHamlet(),0.0001);

    }
    @Test
    public void testFindHamlet1() {
        HamletParser hp=new HamletParser();
        Assert.assertNotEquals(0, hp.findHamlet(),0.0001);

    }
}
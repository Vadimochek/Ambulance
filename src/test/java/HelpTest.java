import org.junit.Assert;
import org.junit.Test;

public class HelpTest {

    Help help=new Help();
    @Test
    public void TempTest(){
        double temp1=36.6;
        Assert.assertEquals(help.getTemperature(temp1),0);
        double temp2=37.0;
        Assert.assertEquals(help.getTemperature(temp2),1);
        double temp3=36.0;
        Assert.assertEquals(help.getTemperature(temp3),-1);
    }
    @Test
    public void orviTest(){
        Assert.assertTrue(help.orvi("Да"));
        Assert.assertFalse(help.orvi("Нет"));
    }
    @Test
    public void DiabetTest(){
        Assert.assertEquals(help.diabet("Да", "Нет"),0);
        Assert.assertEquals(help.diabet("Нет", "Нет"),-1);
        Assert.assertEquals(help.diabet("Нет", "Да"), 0);
        Assert.assertEquals(help.diabet("Да", "Да"),1);
    }
    @Test
    public void RotovirusTest(){
        Assert.assertEquals(help.rvirus("Да", "Нет"),0);
        Assert.assertEquals(help.rvirus("Нет", "Да"),0);
        Assert.assertEquals(help.rvirus("Нет", "Нет"),-1);
        Assert.assertEquals(help.rvirus("Да", "Да"),1);
    }
    @Test
    public void simptomsTest(){
        
    }
}

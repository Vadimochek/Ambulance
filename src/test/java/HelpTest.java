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
        Boolean gripp= true;
        Assert.assertEquals(gripp,orvi("yes"));
        gripp=false;
        Assert.assertEquals(gripp,orvi("no"));
    }

}

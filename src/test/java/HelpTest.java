import org.junit.Assert;
import org.junit.Test;

public class HelpTest {

    Help help=new Help();
    @Test
    public void TempTest(){
        double temp1=36.6;
        Assert.assertEquals(temp1, help.getTemperature());
        double temp2=39.0;
        Assert.assertEquals(temp2, help.getTemperature());
    }

}

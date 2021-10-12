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
    public void RotavirusTest(){
        Assert.assertEquals(help.rvirus("Да", "Нет"),0);
        Assert.assertEquals(help.rvirus("Нет", "Да"),0);
        Assert.assertEquals(help.rvirus("Нет", "Нет"),-1);
        Assert.assertEquals(help.rvirus("Да", "Да"),1);
    }
    @Test
    public void simptomsTest(){
        Assert.assertTrue(help.simptoms("Да"));
        Assert.assertFalse(help.simptoms("Нет"));
    }
    @Test
    public void diagnoseTest(){
        Assert.assertEquals(help.diagnose(1,true, -1, -1, true),"У Вас, скорее всего, ОРВИ. Обратитесь к врачу.");
        Assert.assertEquals(help.diagnose(1, true, -1, 1, true),"У Вас, скорее всего, ротавирус. Обратитесь к врачу.");
        Assert.assertEquals(help.diagnose(1, false, 1, -1, true),"У Вас может быть диабет! Сдайте кровь на анализ.");
        Assert.assertEquals(help.diagnose(0, false, -1, -1, false),"Вы здоровы");
        Assert.assertEquals(help.diagnose(-1, false, -1, -1, true),"У Вас лёгкое недомогание");
        Assert.assertEquals(help.diagnose(0, true, -1, -1, false),"У Вас лёгкая форма ОРВИ");
    }
}

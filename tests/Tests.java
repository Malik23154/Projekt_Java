package tests;
import com.kacper.hurtownia.Hurtownia;
import com.kacper.klient.Klient;
import com.kacper.sklep.Sklep;
import org.junit.Assert;
import org.junit.Test;

/**
 * testy
 */
public class Tests {
    @Test
    public void testInicjalizacji(){
    Klient klient = new Klient("Adam", "Małysz");
            Assert.assertTrue(klient.getGruboscPortfela() == 1500);
    }
    public void testPracy(){
        Klient klient = new Klient("Adam", "Małysz");
        Assert.assertTrue(klient.pracuj() == 1800);
    }
    @Test
    public void testSprzedazySklepu(){
        Hurtownia hurtownia = new Hurtownia("CarParts", 100000);
        hurtownia.sprowadzTowarOdProducenta("Tłoki", 500, 100);
        Sklep sklep = new Sklep("U Adama", 10000);
        sklep.kupOdHurtowni(hurtownia, "Tłoki", 500, 2);
        Assert.assertTrue(sklep.sprzedajTowar("Tłoki", 1) == 500);

    }

}

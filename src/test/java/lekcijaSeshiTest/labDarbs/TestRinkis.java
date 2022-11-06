package lekcijaSeshiTest.labDarbs;

import lekcijaCetri.labDarbs.Rinkis;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRinkis {

    @Test
    public void testRinkaLaukumaFormula() {
        System.out.println("Tests vai rēķina Rinķa liniju?");
        Rinkis mansRinkis = new Rinkis(4);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedArea = 50.24;
        Double actualArea = mansRinkis.rekinatLaukumu();
        //assert
        Assert.assertEquals(actualArea, expectedArea);


    }

    @Test
    public void testRinkaLinijasFormulaDecimals() {
        System.out.println("Tests vai rēķina Rinķa liniju?");
        Rinkis mansRinkis = new Rinkis(3.5);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedLength = 21.98 ;
        Double actualLength = mansRinkis.rekinatLinGarumu();
        //assert
        Assert.assertEquals(actualLength, expectedLength);
    }
    @Test
    public void testRinkaLinijasFormulaVeseli() {
        System.out.println("Tests vai rēķina Rinķa liniju?");
        Rinkis mansRinkis = new Rinkis(3);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedLength = 18.84 ;
        Double actualLength = mansRinkis.rekinatLinGarumu();
        //assert
        Assert.assertEquals(actualLength, expectedLength);
    }
    @Test
    public void testRinkaLinijasFormulaNulle() {
        System.out.println("Tests vai rēķina Rinķa liniju?");
        Rinkis mansRinkis = new Rinkis(0);

        //expectedResult - sagaidāmais rezultāts
        //actualResult - reālais rezultāts

        Double expectedLength = 0.0 ;
        Double actualLength = mansRinkis.rekinatLinGarumu();
        //assert
        Assert.assertEquals(actualLength, expectedLength);
    }
    private void calculateCircleLength (Double radiuss, Double circleLength){
        Rinkis mansRinkis = new Rinkis(radiuss);
        Assert.assertEquals(mansRinkis.rekinatLinGarumu(),circleLength );
    }
}
//    private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
//        System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
//        Rinkis mansRinkis = new Rinkis(radiuss);
//        //expectedResult - sagaidāmais rezultāts
//        //actualResult - reālais rezultāts
//        Double expectedArea = sagaidamaisLaukums;
//        Double actualArea = mansRinkis.rekinatLaukumu();
//        //assert/assertion -
//        private void calculateAreaAndAssert(Double radiuss, Double sagaidamaisLaukums){
//            System.out.println("Tests kurš testē kā rēķinās riņķa laukums");
//            Rinkis mansRinkis = new Rinkis(radiuss);
//            Assert.assertEquals(mansRinkis.rekinatLaukumu(),sagaidamaisLaukums);
//        }


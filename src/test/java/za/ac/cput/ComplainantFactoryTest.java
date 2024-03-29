package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Complainant;
import za.ac.cput.Domain.Docket;
import za.ac.cput.Factory.ComplainantFactory;
import za.ac.cput.Factory.DocketFactory;

/**
 * Unit test for simple App.
 */
public class ComplainantFactoryTest
{
    @Test

    public void getComplainant(){

        String complainantID = "9410100983456";
        String complainantName = "Naby";
        String complainantSurname = "Kate";
        String complainantStatement = "Got assualted in a road rage incident";

        Complainant complainant = ComplainantFactory.getComplainant(complainantID,complainantName,complainantSurname,complainantStatement);
        System.out.println(complainant);
        Assert.assertNotNull(complainant.getComplainantID());
        Assert.assertNotNull(complainant.getComplainantName());
        Assert.assertNotNull(complainant.getComplainantSurname());
        Assert.assertNotNull(complainant.getComplainantStatement());
    }
}

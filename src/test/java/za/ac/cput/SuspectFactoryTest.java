package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.Domain.Docket;
import za.ac.cput.Domain.Suspect;
import za.ac.cput.Factory.DocketFactory;
import za.ac.cput.Factory.SuspectFactory;

/**
 * Unit test for simple App.
 */
public class SuspectFactoryTest
{
    @Test

    public void getSuspect(){

        String suspectID = "8803127987890";
        String suspectName = "Virgil";
        String suspectSurname = "Van Dyk";
        String suspectAccusation = "Accused of assault";

        Suspect suspect = SuspectFactory.getSuspect(suspectID,suspectName,suspectSurname,suspectAccusation);
        System.out.println(suspect);
        Assert.assertNotNull(suspect.getSuspectID());
        Assert.assertNotNull(suspect.getSuspectName());
        Assert.assertNotNull(suspect.getSuspectSurname());
        Assert.assertNotNull(suspect.getSuspectAccusation());
    }
}

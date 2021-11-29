import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AscendingSequencesTest {
    @Test
    public void AscendingListHappyPath(){
        int startNumber = 1;
        int endNumber = 5;
        int step = 1;
        List<Integer> expectedResult = Arrays.asList(1, 2, 3, 4, 5);
      AscendingSequences ascendingSequences = new AscendingSequences();
      List<Integer> actualResults = ascendingSequences.buildAscendingList(startNumber, endNumber, step);

        Assert.assertEquals(expectedResult, actualResults);
    }

}

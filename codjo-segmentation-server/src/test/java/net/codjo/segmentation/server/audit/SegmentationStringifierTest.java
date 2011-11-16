package net.codjo.segmentation.server.audit;
import net.codjo.workflow.common.message.Arguments;
import net.codjo.workflow.common.message.JobRequest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
/**
 *
 */
public class SegmentationStringifierTest {
    private SegmentationStringifier stringifier = new SegmentationStringifier();


    @Test
    public void test_toString_moreThanThreeIds() throws Exception {
        Arguments arguments = new Arguments("segmentations", "1, 2, 3, 5, 77, 88, 107, 206");

        assertEquals("Axes : 1, 2, 3, ... (5 de plus)",
                     stringifier.toString(new JobRequest("segmentation", arguments)));
    }


    @Test
    public void test_toString_exactlyThreeIds() throws Exception {
        Arguments arguments = new Arguments("segmentations", "1, 2, 3");

        assertEquals("Axes : 1, 2, 3", stringifier.toString(new JobRequest("segmentation", arguments)));
    }


    @Test
    public void test_toString_lessThanThreeIds() throws Exception {
        Arguments arguments = new Arguments("segmentations", "1, 2");

        assertEquals("Axes : 1, 2", stringifier.toString(new JobRequest("segmentation", arguments)));
    }
}

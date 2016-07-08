/**
 * Created by employee on 7/8/16.
 */
import com.interlink.FindingSequence;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
public class SequenceTest {
    @org.junit.Test
    public void emptySequenceTest() throws Exception {
        assertThat(FindingSequence.getSubSequence(null),is(new ArrayList()));
    }
}

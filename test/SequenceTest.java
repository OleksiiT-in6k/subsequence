/**
 * Created by employee on 7/8/16.
 */

import com.interlink.FindingSequence;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.interlink.FindingSequence.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class SequenceTest {
    @org.junit.Test
    public void nullSequenceTest() throws Exception {
        assertThat(getSubSequence(null), is(new ArrayList()));
    }

    @Test
    public void emptySequenceTest() throws Exception {
        assertThat(getSubSequence(new ArrayList<>()), is(new ArrayList()));

    }
}

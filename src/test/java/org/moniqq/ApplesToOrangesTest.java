package org.moniqq;

import org.joda.time.DateTime;
import org.junit.Test;
import org.moniqq.model.Apple;
import org.moniqq.model.Orange;

import java.util.Date;

import static org.moniqq.model.Assertions.assertThat;

public class ApplesToOrangesTest {

    public static final String GRANNIE_SMITH = "Grannie Smith";
    public static final long ID = 1L;
    public static final DateTime NOW = DateTime.now();

    private ApplesToOranges mapper = new ApplesToOranges();
    @Test
    public void testApplesToOranges() throws Exception {
        Apple apple = new Apple(ID, GRANNIE_SMITH, NOW);

        Orange orange = mapper.map(apple);
        assertThat(orange)
                .hasId(ID)
                .hasDatePicked(new Date(NOW.getMillis()))
                .hasPrice(null);
        assertThat(orange.getTree()).hasName(GRANNIE_SMITH);
    }
}
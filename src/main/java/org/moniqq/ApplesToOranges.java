package org.moniqq;

import org.dozer.CustomConverter;
import org.dozer.DozerBeanMapper;
import org.joda.time.DateTime;
import org.moniqq.customconverters.DateToDateTimeConverter;
import org.moniqq.model.Apple;
import org.moniqq.model.Orange;

import java.util.Collections;
import java.util.Date;

import static org.moniqq.mappings.AppleToOrangeMapping.appleToOrange;

public class ApplesToOranges {

    private final DozerBeanMapper mapper;

    public ApplesToOranges() {
        mapper = new DozerBeanMapper();
        mapper.setCustomConverters(Collections.<CustomConverter>singletonList(new DateToDateTimeConverter(DateTime.class, Date.class)));
        mapper.addMapping(appleToOrange);
    }

    public Orange map(Apple apple) {
        return mapper.map(apple, Orange.class);
    }

    public Apple map(Orange orange) {
        return mapper.map(orange, Apple.class);
    }
}

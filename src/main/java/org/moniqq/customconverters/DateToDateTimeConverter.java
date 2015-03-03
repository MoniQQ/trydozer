package org.moniqq.customconverters;

import org.dozer.DozerConverter;
import org.joda.time.DateTime;

import java.util.Date;

public class DateToDateTimeConverter extends DozerConverter<DateTime, Date> {

    /**
     * Defines two types, which will take part transformation.
     * As Dozer supports bi-directional mapping it is not known which of the classes is source and
     * which is destination. It will be decided in runtime.
     *
     * @param prototypeA type one
     * @param prototypeB type two
     */
    public DateToDateTimeConverter(Class<DateTime> prototypeA, Class<Date> prototypeB) {
        super(prototypeA, prototypeB);
    }

    @Override
    public Date convertTo(DateTime source, Date destination) {
        if (source == null) return null;
        if(destination == null) destination = new Date();
        destination.setTime(source.getMillis());
        return destination;
    }

    @Override
    public DateTime convertFrom(Date source, DateTime destination) {
        if (source == null) return null;
        return new DateTime(source.getTime());
    }
}

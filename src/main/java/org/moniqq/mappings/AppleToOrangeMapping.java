package org.moniqq.mappings;

import org.dozer.classmap.RelationshipType;
import org.dozer.loader.api.BeanMappingBuilder;
import org.dozer.loader.api.FieldsMappingOptions;
import org.joda.time.DateTime;
import org.moniqq.customconverters.DateToDateTimeConverter;
import org.moniqq.model.Apple;
import org.moniqq.model.Orange;

import java.util.Date;

import static org.dozer.loader.api.FieldsMappingOptions.*;
import static org.dozer.loader.api.TypeMappingOptions.*;
import static org.dozer.loader.api.TypeMappingOptions.oneWay;

public class AppleToOrangeMapping {

    public static BeanMappingBuilder appleToOrange;

    static {
        appleToOrange = new BeanMappingBuilder() {
            protected void configure() {
                mapping(Apple.class, Orange.class, oneWay(), mapNull(true))
                        .fields("datePicked", "datePicked",
                                hintA(DateTime.class),
                                hintB(Date.class),
                                customConverter(DateToDateTimeConverter.class))
                        .fields("id", "id")
                        .fields("name", "tree.name");
            }
        };
    }

}

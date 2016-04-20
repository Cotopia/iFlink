package org.cotopia.iflink.api.driver;

import org.cotopia.iflink.api.dataset.DataSet;
import org.cotopia.iflink.api.operators.DataSink;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Acceml on 2016/4/20
 * Email: huminghit@gmail.com
 */
public class OperatorTranslation {
    private Map<DataSet<?>, Operator<?>> translated = new HashMap<>();

    public Plan translateToPlan(List<DataSink<?>> sinks) {
        List<GenericDataSinkBase<?>> planSinks = new ArrayList<>();

        for (DataSink<?> sink : sinks) {
            planSinks.add(translate(sink));
        }
        Plan p=new Plan(planSinks);
        return p;
    }

    private <T> GenericDataSinkBase<T> translate(DataSink<T> sink) {

    }
}

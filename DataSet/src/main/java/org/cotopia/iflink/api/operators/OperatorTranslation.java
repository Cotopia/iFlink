package org.cotopia.iflink.api.operators;

import org.cotopia.iflink.api.common.Plan;
import org.cotopia.iflink.api.dataset.DataSet;
import org.cotopia.iflink.api.common.Operator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public class OperatorTranslation {
    /**
     * The already translated operations
     */
    private Map<DataSet<?>, Operator<?>> translated = new HashMap<>();

    public Plan translateToPlan(List<DataSink<?>> sinks, String jobName) {

    }
}

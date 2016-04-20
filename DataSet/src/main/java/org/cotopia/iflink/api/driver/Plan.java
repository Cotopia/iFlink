package org.cotopia.iflink.api.driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public class Plan {
    protected final List<GenericDataSinkBase<?>> sinks=new ArrayList<>();
    public Plan(Collection<? extends GenericDataSinkBase<?>> sink) {
        sinks.add(sink);
    }
}

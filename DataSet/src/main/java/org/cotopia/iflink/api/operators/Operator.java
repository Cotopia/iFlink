package org.cotopia.iflink.api.operators;

import org.cotopia.iflink.api.dataset.DataSet;
import org.cotopia.iflink.api.enviroment.ExecutionEnvironment;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public abstract class Operator<OUT, O extends Operator<OUT, O>> extends DataSet<OUT> {
    public Operator(ExecutionEnvironment context) {
        super(context);
    }
}

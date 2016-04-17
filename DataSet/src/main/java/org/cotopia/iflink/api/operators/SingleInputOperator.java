package org.cotopia.iflink.api.operators;

import org.cotopia.iflink.api.dataset.DataSet;
import org.cotopia.iflink.api.enviroment.ExecutionEnvironment;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public class SingleInputOperator<IN, OUT, O extends SingleInputOperator<IN, OUT, O>> extends Operator<OUT, O> {

    DataSet<IN> input;

    public SingleInputOperator(DataSet<IN> input) {
        super(input.getEnvironment());
    }
}

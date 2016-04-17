package org.cotopia.iflink.api.operators;

import org.cotopia.iflink.api.dataset.DataSet;
import org.cotopia.iflink.api.enviroment.ExecutionEnvironment;
import org.cotopia.iflink.api.functions.FlatMapFunction;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public class FlatMapOperator<IN, OUT> extends SingleInputOperator<IN, OUT, FlatMapOperator<IN, OUT>> {

    protected final FlatMapFunction<IN, OUT> function;

    public FlatMapOperator(DataSet<IN> input, FlatMapFunction<IN, OUT> function) {
        super(input);
        this.function = function;
    }

}

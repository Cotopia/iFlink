package org.cotopia.iflink.api.dataset;

import org.cotopia.iflink.api.enviroment.ExecutionEnvironment;
import org.cotopia.iflink.api.functions.FlatMapFunction;
import org.cotopia.iflink.api.operators.FlatMapOperator;

/**
 * Created by Acceml on 2016/3/31
 * Email: huminghit@gmail.com
 */
public abstract class DataSet<T> {

    ExecutionEnvironment context;

    protected DataSet(ExecutionEnvironment context) {
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        this.context = context;
    }

    public <R> FlatMapOperator<T, R> flatMap(FlatMapFunction<T, R> flatMapper) {
        if (flatMapper == null) {
            throw new NullPointerException("FlatMap function must not be null.");
        }
        return new FlatMapOperator<T, R>(this,flatMapper);
    }

    public ExecutionEnvironment getEnvironment() {
        return context;
    }
}

package org.cotopia.iflink.api.dataset;

import org.cotopia.iflink.api.JobExecutionResult;
import org.cotopia.iflink.api.enviroment.ExecutionEnvironment;
import org.cotopia.iflink.api.functions.FlatMapFunction;
import org.cotopia.iflink.api.operators.DataSink;
import org.cotopia.iflink.api.operators.FlatMapOperator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Acceml on 2016/3/31
 * Email: huminghit@gmail.com
 */
public abstract class DataSet<T> {

    public static final String DEFAULT_JOB_NAME="test";

    protected final ExecutionEnvironment context;

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
        return new FlatMapOperator<T, R>(this, flatMapper);
    }

    public ExecutionEnvironment getEnvironment() {
        return context;
    }

    public void print() throws Exception {
        List<T> elements = collect();
        for (T e : elements) {
            System.out.println(e);
        }
    }

    public List<T> collect() throws Exception {
        this.output();
        this.getEnvironment().execute(DEFAULT_JOB_NAME);
    }

    public DataSink<T> output() {
        DataSink<T> sink = new DataSink<>(this);
        this.context.registerDataSink(sink);
        return sink;
    }
}

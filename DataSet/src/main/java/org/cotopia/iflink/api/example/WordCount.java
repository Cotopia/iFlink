package org.cotopia.iflink.api.example;

import org.cotopia.iflink.api.functions.Collector;
import org.cotopia.iflink.api.functions.FlatMapFunction;
import org.cotopia.iflink.api.utils.tuple.Tuple2;

/**
 * Created by Acceml on 2016/4/17.
 * Email: huminghit@gmail.com
 */
public class WordCount {


    public static final class SplitWords implements FlatMapFunction<String, Tuple2<String, Integer>> {
        @Override
        public void flatMap(String value, Collector<Tuple2<String, Integer>> out) throws Exception {
            String[] tokens = value.toLowerCase().split("\\W+");
            // match one or more number or character.
            for (String token : tokens) {
                if (token.length() > 0) {
                    out.collector(new Tuple2<String, Integer>(token, 1));
                }
            }
        }
    }
}

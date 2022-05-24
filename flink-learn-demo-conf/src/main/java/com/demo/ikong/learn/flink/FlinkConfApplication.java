package com.demo.ikong.learn.flink;

import com.demo.ikong.learn.flink.model.KafkaConsumerConf;
import com.demo.ikong.learn.flink.utils.ConfUtils;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName FlinkConfApplication
 * @Description: TODO
 * @Author ikong
 * @Date 2022/5/24
 * @Version V1.0
 **/
public class FlinkConfApplication {

    public static void main(String[] args) throws Exception {

        KafkaConsumerConf cnf = ConfUtils.getConsumerConf();

        System.out.println(cnf.toString());

        // 读取参数
        ParameterTool paramTool = ParameterTool.fromArgs(args);

        String jobName = paramTool.get("jobName");

        int parallelism = Integer.valueOf(paramTool.get("parallelism"));

        System.out.println("参数，jobName: " + jobName + "  parallelism: " + parallelism);

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//        env.setParallelism()
//        env.execute();
//
    }

}

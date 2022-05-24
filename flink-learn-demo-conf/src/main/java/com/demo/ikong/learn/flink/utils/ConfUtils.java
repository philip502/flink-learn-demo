package com.demo.ikong.learn.flink.utils;

import com.demo.ikong.learn.flink.model.KafkaConsumerConf;
import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 * @ClassName ConfUtils
 * @Description: TODO
 * @Author ikong
 * @Date 2022/5/24
 * @Version V1.0
 **/
public class ConfUtils {

    private static Config config = ConfigFactory.load();

    public static KafkaConsumerConf getConsumerConf() {

        KafkaConsumerConf cnf = new KafkaConsumerConf();
        cnf.setBroker(config.getString("ikong.learn.kafka.broker"));
        cnf.setClient(config.getString("ikong.learn.kafka.groupId"));
        cnf.setTopic(config.getString(" ikong.learn.kafka.topic"));
        cnf.setGroup(config.getString("ikong.learn.kafka.groupId"));
        cnf.setUser(config.getString("ikong.learn.kafka.userName"));
        cnf.setPwd(config.getString("ikong.learn.kafka.password"));

        return cnf;
    }
}

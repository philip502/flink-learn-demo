package com.demo.ikong.learn.flink.model;

/**
 * @ClassName MqConsumerConf
 * @Description: TODO
 * @Author ikong
 * @Date 2022/5/10
 * @Version V1.0
 **/
public class KafkaConsumerConf {

    private String broker;
    private String topic;
    private String client;
    private String group;
    private String user;
    private String pwd;

    public String getBroker() {
        return broker;
    }

    public void setBroker(String broker) {
        this.broker = broker;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "KafkaConsumerConf{" +
                "broker='" + broker + '\'' +
                ", topic='" + topic + '\'' +
                ", client='" + client + '\'' +
                ", group='" + group + '\'' +
                ", user='" + user + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

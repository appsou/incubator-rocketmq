package com.alibaba.rocketmq.filtersrv;

import com.alibaba.rocketmq.remoting.common.RemotingUtil;


public class FiltersrvConfig {
    // private String rocketmqHome =
    // System.getProperty(MixAll.ROCKETMQ_HOME_PROPERTY,
    // System.getenv(MixAll.ROCKETMQ_HOME_ENV));

    private String rocketmqHome = "/Users/vive/Desktop/share/work/gitlab/rocketmq";
    private String namesrvAddr = "10.235.170.7:9877";

    // 连接到哪个Broker
    private String connectWhichBroker = "10.235.170.7:10911";
    // Filter Server对外服务的IP
    private String filterServerIP = RemotingUtil.getLocalAddress();
    // 消息超过指定大小，开始压缩
    private int compressMsgBodyOverHowmuch = 1024 * 8;
    // 压缩Level
    private int zipCompressLevel = 5;

    // 是否允许客户端上传Java类
    private boolean clientUploadFilterClassEnable = true;


    public String getRocketmqHome() {
        return rocketmqHome;
    }


    public void setRocketmqHome(String rocketmqHome) {
        this.rocketmqHome = rocketmqHome;
    }


    public String getNamesrvAddr() {
        return namesrvAddr;
    }


    public void setNamesrvAddr(String namesrvAddr) {
        this.namesrvAddr = namesrvAddr;
    }


    public String getConnectWhichBroker() {
        return connectWhichBroker;
    }


    public void setConnectWhichBroker(String connectWhichBroker) {
        this.connectWhichBroker = connectWhichBroker;
    }


    public String getFilterServerIP() {
        return filterServerIP;
    }


    public void setFilterServerIP(String filterServerIP) {
        this.filterServerIP = filterServerIP;
    }


    public int getCompressMsgBodyOverHowmuch() {
        return compressMsgBodyOverHowmuch;
    }


    public void setCompressMsgBodyOverHowmuch(int compressMsgBodyOverHowmuch) {
        this.compressMsgBodyOverHowmuch = compressMsgBodyOverHowmuch;
    }


    public int getZipCompressLevel() {
        return zipCompressLevel;
    }


    public void setZipCompressLevel(int zipCompressLevel) {
        this.zipCompressLevel = zipCompressLevel;
    }


    public boolean isClientUploadFilterClassEnable() {
        return clientUploadFilterClassEnable;
    }


    public void setClientUploadFilterClassEnable(boolean clientUploadFilterClassEnable) {
        this.clientUploadFilterClassEnable = clientUploadFilterClassEnable;
    }
}

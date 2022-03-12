package cn.doitedu.dynamic_rule.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

@Data //自动获取getset方法
@NoArgsConstructor  //无参构造
@AllArgsConstructor  //有参构造
@ToString

//封装日志数据
public class LogBean {

    private String account;
    private String appId;
    private String appVersion;
    private String carrier;
    private String deviceId;
    private String deviceType;
    private String ip;
    private double latitude;
    private double longitude;
    private String netType;
    private String osName;
    private String osVersion;
    private String releaseChannel;
    private String resolution;
    private String sessionId;
    private long timeStamp;
    private String eventId;
    private Map<String,String> properties;
}

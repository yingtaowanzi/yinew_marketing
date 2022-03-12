package cn.doitedu.dynamic_rule.datagen;

/**
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data:
 * @desc
 */
/**
 * @Title:fffdd
 * @Description：ddd
 * @Param： * @pardddam null
 * @Return：dd
 * @MethosName：dd
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/9 21:59
 * @desc
 */


import cn.doitedu.dynamic_rule.pojo.LogBean;
//import org.apache.commons.lang.StringUtils;
//import org.apache.commons.lang.math.RandomUtils;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/*
 @author 樱桃丸子
 @data 2022-01-11
 2desc 行为日志生成模拟器
  */




/*
* kafka中要先创建topic
* 【root@hdp01】
*
*
* */
public class ActionLogGen {
     public static void main(String[] args) throws InterruptedException {

         while(true){
             //生成的账号形如：004078
             LogBean logBean= new LogBean();
//           String account = StringUtils.leftPad(RandomUtils.nextInt(1,10000) + "", );
             String account = StringUtils.leftPad(RandomUtils.nextInt(1,10000) + "", 6,"0");
             logBean.setAccount(account);
             logBean.setAppId("cn.doitedu.yinew");
             logBean.setAppVersion("2.5");
             logBean.setCarrier("中国移动");
             //deviceid直接用account
             logBean.setDeviceId(account);
             logBean.setIp("10.102.36.88");
             logBean.setLatitude(RandomUtils.nextDouble(10.0,52.0));
             logBean.setLongitude(RandomUtils.nextDouble(120.0,160.0));
             logBean.setDeviceType("mi6");
             logBean.setNetType("5G");
             logBean.setOsName("android");
             logBean.setOsVersion("7.5");
             logBean.setReleaseChannel("小米应用市场");
             logBean.setResolution("2048*1024");
             logBean.setEventId(RandomStringUtils.randomAlphabetic(1));

             HashMap<String,String> properties = new HashMap<String, String>();
             for (int i=0; i<RandomUtils.nextInt(1,5);i++){
                 //生成的属性形如 ：p1=v3，p2=v5；p3=v3........
                 properties.put("p" + RandomUtils.nextInt(1,10), "v" + RandomUtils.nextInt(1,10));

             }

             logBean.setProperties(properties);
             logBean.setTimeStamp(System.currentTimeMillis());
             logBean.setSessionId(RandomStringUtils.randomNumeric(10,10));

             //将日志对象，转成JSON
             String log = JSON.toJSONString(logBean);
             System.out.println(log);
             //System.out.println(log);//log.sout

             //new KafkaProducer<String,String>()

             Thread.sleep(RandomUtils.nextInt(500,3000));

         }

     }

}


















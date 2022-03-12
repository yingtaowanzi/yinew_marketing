package cn.doitedu.dynamic_rule.service;

import cn.doitedu.dynamic_rule.pojo.RuleParam;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.ConnectionFactory;

import javax.security.auth.login.Configuration;
import java.sql.Connection;
import java.util.HashMap;

/**
 * @Title:用户1画像
 * @Description：
 * @Param： * @param nulla
 * @Return：
 * @MethosName：
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/11 21:00
 * @desc 用户画像查询服务hbase查询实现
 */

public class UserProfileQueryServiceHbaseImpl implements UserProfileQueryService {

    Connection conn;
    Table table;

    /*
    构造函数
     */
    public class UserProfileQueryServiceHbaseImpl() throws IOException {
        Configuration conf = new Configuration();
        conf.set("hbase.zookeeper.quorum", "hdp01:2181,hdp02:2181,hdp03:2181");

        conn = ConnectionFactory.createConnection(conf);
        table = conn.getTable(TableName.valueOf("yinew_profile"));

    }

    /**
     * 传入一个用户号，以及要查询的条件
     * 返回这些条件是否满足
     * @param devicedId
     * @return ruleParam
     * @return
     *
     */
    @Override
    public boolean judgeProfileCondition(String deviceId, RuleParam ruleParam){

        HashMap<String, String> userProfileParams = ruleParam.getUserProfileParams();


        return false;
    }








































}

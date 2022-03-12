package cn.doitedu.dynamic_rule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @Title:dd
 * @Description：
 * @Param： * @params null
 * @Return：
 * @MethosName：
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/11 15:53
 * @desc 规则参数中的原子条件封装实体
 */

@Data
@NoArgsConstructor
@AllArgsConstructor


public class RuleAtomicParam implements Serializable {

    //事件的类型要求
    private String eventId;

    //事件的属性要求
    private HashMap<String,String>properties;

    //规则要求的阈值
    private int cnts;

    //要求的事件发生时间段起始
    private long rangeStart;

    //要求事件发生时间段结束
    private long rangeEnd;

    //条件对应的clickhouse查询sql
    private String countQuerySql;

    //用于记录查询服务所返回的查询值
    private int realCnts;

    //用于记录初始range
    private long originStart;
    public void setOriginStart(long orginStart){
        this.originStart = orginStart;
        this.rangeStart = orginStart;
    }

}





















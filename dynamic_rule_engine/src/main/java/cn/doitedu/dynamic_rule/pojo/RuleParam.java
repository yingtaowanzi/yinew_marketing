package cn.doitedu.dynamic_rule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Title:aa
 * @Description：
 * @Param： * @paraam null
 * @Return：
 * @MethosName：
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/11 19:46
 * @desc 规则整体条件封装实体
 *
 *  需求中要实现的判断程序：
 *    触发条件：E事件
 *    画像事件条件：k3=v3，k100=v80，k230=v360
 *    行为属性条件：U（p1=v3，p2=v2）>= 3次 且 G（p6=v8，p4=v5，p1=v2）>=1
 *    行为次序条件：依次做过：w（p1=p4）-> R(p2=v3)->F
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RuleParam implements Serializable {

    //规则中的触发条件
    private RuleAtomicParam triggerParam;

    //规则中的用户画像条件
    private MashMap<String,String> userProfileParams;

    //规则中的行为次数类条件
    private List<RuleAtmicParam> userActionCountParams;

    //规则中的行为次序类条件
    private List<RuleAtomicParam> userActionSequenceParams;

    //用于记录查询服务所返回的序列中匹配的最大步骤号
    private int userActionSequenceQuerieMaxStep;

}

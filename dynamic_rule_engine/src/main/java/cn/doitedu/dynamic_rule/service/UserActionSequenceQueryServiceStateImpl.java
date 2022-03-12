package cn.doitedu.dynamic_rule.service;

import cn.doitedu.dynamic_rule.pojo.RuleParam;

import java.util.List;

/**
 * @Title:
 * @Description：
 * @Param： * @param null
 * @Return：
 * @MethosName：
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/11 21:53
 * @desc 用户行为次序类条件查询服务类实现（在state中查询）
 *
 */

public class UserActionSequenceQueryServiceStateImpl implements UserActionSequenceQueryService {

    /**
     * 查询规则条件中的 行为序列条件
     * 会将查询到的最大匹配步骤 set回ruleParam对象中
     * @param eventState flink中存储用户事件明细的state
     * @param ruleParam 规则参数对象
     * @return 条件成立是否
     */
    @Override
    public boolean queryActionSequence(List<logBean> eventState, RuleParam ruleParam){

        return false;
    }


}

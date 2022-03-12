package cn.doitedu.dynamic_rule.service;

import cn.doitedu.dynamic_rule.pojo.RuleParam;
import org.apache.flink.api.common.state.ListState;

/**
 * @Title:
 * @Description：
 * @Param： * @param null
 * @Return：
 * @MethosName：
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/11 21:25
 * @desc 用户行为次数类条件查询服务实现：在flink的state中统计行为次数
 *
 */


public class UserActionCountQueryServiceStateImpl implements UserActionCountQueryService {

    /**
     * 查询规则参对象中，要求的用户行为次数类条件是否满足
     * 同时，将得到的真实次数，set回规则参数对象中
     *
     * @param eventState 传入的用户事件明细存储state
     * @param ruleParam 规则整体参数对象
     * @return 条件是否满足
     */
    public boolean queryActionCounts(ListState<logBean> eventState, RuleParam ruleParam){

        return false;
    }




}


















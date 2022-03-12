package cn.doitedu.dynamic_rule.service;

import cn.doitedu.dynamic_rule.pojo.RuleParam;
import org.apache.flink.api.common.state.ListState;

/**
 * @Title:dd
 * @Description：
 * @Param： * @param null
 * @Return：
 * @MethosName：
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/11 21:21
 * @desc 用户行为次数类条件查询服务接口
 */

public interface UserActionCountQueryService {

    public boolean queryActionCounts(ListState<logBean> eventState, RuleParam ruleParam);
}

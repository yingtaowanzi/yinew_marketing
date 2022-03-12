package cn.doitedu.dynamic_rule.service;


import cn.doitedu.dynamic_rule.pojo.RuleParam;

import java.util.List;

/**
 * @Title:a
 * @Description：
 * @Param： * @param null
 * @Return：
 * @MethosName：
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/11 21:51
 * @desc 用户行为次序类条件查询服务接口
 */

public interface UserActionSequenceQueryService {

    public boolean queryActionSequence(List<logBean> eventState, RuleParam ruleParam);
}

package cn.doitedu.dynamic_rule.service;


import cn.doitedu.dynamic_rule.pojo.RuleParam;

/**
 * @Title: jj
 * @Description：
 * @Param： * @param nulljj
 * @Return：
 * @MethosName：
 * @author 樱桃丸子
 * @nick_name "deep as the sea"
 * @contact qq:1822563275
 * @data: 2022/3/11 20:54
 * @desc 用户画像数据查询服务
 */

public interface UserProfileQueryService {

    public boolean judgeProfileCondition(String deviceId, RuleParam ruleParam);



}

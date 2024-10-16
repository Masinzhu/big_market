package cn.bugstack.domain.strategy.model.valobj;


import cn.bugstack.types.common.Constants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Masin_Zhu
 * @Date: 2024/10/15
 * @Description: 抽奖策略规则规则值对象；值对象没有唯一id,仅限于从数据库中查询对象
 */
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StrategyAwardRuleModelVO {
    private String ruleModels;

}

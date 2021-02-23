package sungryuleom.core;

import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

/**
 * MyBatis Mapper 플러그인 인터페이스의 사용자 정의 버전. 다른 인터페이스가 필요한 경우 공식 문서를 참조하여 직접 추가하십시오.
 */
public interface Mapper<T>
        extends
        BaseMapper<T>,
        ConditionMapper<T>,
        IdsMapper<T>,
        InsertListMapper<T> {
}

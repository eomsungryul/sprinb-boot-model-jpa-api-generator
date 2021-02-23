package sungryuleom.core;

import org.apache.ibatis.exceptions.TooManyResultsException;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * 서비스 계층 기본 인터페이스, 다른 서비스 인터페이스는이 인터페이스를 상속해야합니다.
 */
public interface Service<T> {
    void save(T model);//지속성
    void save(List<T> models);//일괄 처리 지속성
    void deleteById(Integer id);//기본 키로 삭제
    void deleteByIds(String ids);//배치 삭제 예 : ids -> "1,2,3,4"
    void update(T model);//업데이트
    T findById(Integer id);//ID로 찾기
    T findBy(String fieldName, Object value) throws TooManyResultsException; //모델의 멤버 변수 이름 (비 데이터 테이블 열 이름)을 통해 값을 찾습니다 . 값은 고유 제한 조건을 충족해야합니다.
    List<T> findByIds(String ids);//여러 ID 찾기 // eg : ids -> "1,2,3,4"
    List<T> findByCondition(Condition condition);//조건으로 찾기
    List<T> findAll();//모두 가져 오기
}

package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

//    오픈 프로젝션으로 엔티티 전부를 조회해서 우리가 원하는 타겟들 값만 보여준다.
//    @Value("#{target.username + ' ' + target.age}")
    String getUsername();
}

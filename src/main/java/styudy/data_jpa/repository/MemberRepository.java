package styudy.data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import styudy.data_jpa.entity.Member;

// JpaRepository를 상속받으면 구현체를 다 만들어줌
// 구현 클래스를 프록시에서 생성해서 넣어준다
public interface MemberRepository extends JpaRepository<Member, Long> {
}

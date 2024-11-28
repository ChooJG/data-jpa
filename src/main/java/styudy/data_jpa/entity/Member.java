package styudy.data_jpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// 출력시 하나의 문자열로 편하게
// 연관관계 있는거에는 하지 말고
@ToString(of = {"id", "username", "age"})
public class Member {


    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String username;
    private int age;


    // 성능 최적화를 위해 언제나 LAZY로 설정
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;


    public Member(String username) {
        this.username = username;
    }

    public Member(String username, int age, Team team) {
        this.username = username;
        this.age = age;
        if (team != null) {
            changeTeam(team);
        }
    }

    public void changeTeam(Team team) {
        this.team = team;               // 유저 객체에 저장된 팀 변경
        team.getMembers().add(this);    // 팀의 유저 list에 해당 유저 객체 추가
    }


}

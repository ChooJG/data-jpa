package styudy.data_jpa.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "name"})
public class Team {


    @Id
    @GeneratedValue
    @Column(name = "team_id")
    private Long id;
    private String name;


    // mappedBy는 외래키 없는 쪽에 매핑
    @OneToMany(mappedBy = "team")
    private List<Member> members = new ArrayList<>();


    // 팀 생성
    public Team(String name) {
        this.name = name;
    }

}

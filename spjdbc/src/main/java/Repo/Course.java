package Repo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Course {
    @Id
    private int id;
    private int name;
    private int author;

}

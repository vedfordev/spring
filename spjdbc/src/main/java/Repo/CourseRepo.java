package Repo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Slf4j
@Repository
public class CourseRepo {
    @Autowired
    private JdbcTemplate template;

    private String ins =
            """
            insert into course(id,name,author) values(1,'nothing','vedant');
            """;

    private String create =
            """
            CREATE TABLE IF NOT EXISTS course(
                id integer not null,
                name varchar(255) not null,
                author varchar(255) not null,
                primary key(id)
            );        
            """;
    public void insert(){
        template.update(ins);
    }

    public void create(){
        log.info("executing create statement");
        template.execute(create);
    }
}

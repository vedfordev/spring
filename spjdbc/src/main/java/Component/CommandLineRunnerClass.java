package Component;

import Repo.CourseRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
@Slf4j
@Component
@ComponentScan("Repo")
public class CommandLineRunnerClass implements CommandLineRunner {
    @Autowired
    CourseRepo courseRepo;
    @Override
    public void run(String... args) throws Exception {
        log.info("runner is working");
//        System.out.println("Started");
        courseRepo.create();
        courseRepo.insert();
        log.info("statement end");
    }
}

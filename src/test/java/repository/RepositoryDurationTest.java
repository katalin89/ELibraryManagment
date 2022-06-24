package repository;

import model.Course;
import model.Duration;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryDurationTest {
    @Test
    public void insertDuration() {
        RepositoryDuration repositoryDuration=new RepositoryDuration();
Duration duration=new Duration(1,1,"2017-02-015 -2017-03-01","scurta","2017-03-01","14:00");
repositoryDuration.insertDuration(duration);
    }

    @Test
    public void deleteById() {
        RepositoryDuration repositoryDuration=new RepositoryDuration();
        repositoryDuration.stergeDurationById(6);

    }

    @Test
    public void update() {
        RepositoryDuration repositoryDuration=new RepositoryDuration();
        repositoryDuration.updateData(1, "1999-01-01");

    }



    @Test
    public void allList() {
        RepositoryDuration repositoryDuration=new RepositoryDuration();
        List<Duration> durations = repositoryDuration.allDurations();
        for (Duration d : durations) {
            System.out.println(d.toString());
        }

    }



}
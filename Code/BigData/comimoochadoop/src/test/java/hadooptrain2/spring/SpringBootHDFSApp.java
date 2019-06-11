package hadooptrain2.spring;

import org.apache.hadoop.fs.FileStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.hadoop.fs.FsShell;

@SpringBootApplication
public class SpringBootHDFSApp implements CommandLineRunner {

    @Autowired
    FsShell fsShell;

    public void run(String... strings) throws Exception {
        System.out.println("run");
        System.out.println(fsShell.lsr("/springhdfs").size());
        for(FileStatus fileStatus : fsShell.lsr("/springhdfs")) {
            System.out.println("Test");
            System.out.println("> " + fileStatus.getPath());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHDFSApp.class, args);
    }

}

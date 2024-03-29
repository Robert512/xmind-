package hadooptrain2.spring;

import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 *  使用Spring Hadoop访问HDFS文件系统
 */
public class SpringHadoopHDFSAPP {

    private ApplicationContext ctx;

    private FileSystem fileSystem;

    /**
     * 创建hdfs文件夹
     * @throws Exception
     */
    @Test
    public void testMkdir() throws Exception {
        fileSystem.mkdirs(new Path("/springhdfs/"));
    }


    @Before
    public void setUp() {
        ctx = new ClassPathXmlApplicationContext("beans.xml");
        fileSystem = (FileSystem)ctx.getBean("fileSystem");
    }

    @After
    public void tearDown() throws IOException {
        ctx = null;
        fileSystem.close();

    }


}

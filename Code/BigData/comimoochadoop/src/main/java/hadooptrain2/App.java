package hadooptrain2;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

/**
 * Hello world!
 *
 */
public class App 
{

    public static final String HDFS_PATH = "hdfs://192.168.137.7:8082";



    public static void main( String[] args ) throws Exception
    {
        FileSystem fileSystem = null;
        Configuration configuration = null;

        configuration = new Configuration();
        fileSystem = FileSystem.get(new URI(HDFS_PATH), configuration, "jerrylee");

        System.out.println( "Hello World!" );
        fileSystem.mkdirs(new Path("/hdfsapi/test"));
        System.out.println( "End!" );
    }
}

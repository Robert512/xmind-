package hadooptrain2.useragent;

import com.kumkee.userAgent.UserAgent;
import com.kumkee.userAgent.UserAgentParser;
import org.junit.Test;

import java.io.*;

public class UserAgentApp {
    @Test
    public void test1() throws IOException {
        String path = "E:\\xmind\\xmind-\\10小时入门大数据\\源码\\note\\100_access.log";
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(new File(path)))
        );

        UserAgentParser userAgentParser = new UserAgentParser();

        String line = "";
        while((line = reader.readLine()) != null) {

            String browser = userAgentParser.parse(line).getBrowser();
            System.out.println(browser);
        }
    }
}

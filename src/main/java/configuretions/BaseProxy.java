package configuretions;

import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.core.har.Har;
import net.lightbody.bmp.core.har.HarEntry;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BaseProxy extends BaseClass{
    public static BrowserMobProxyServer serverBase;
    @BeforeClass
    static public void startProxy(){
        serverBase.newHar("youtube");
        ConfigUserAgens.createUserAgent(USERAGENT.ANDROIRU,serverBase);
    }

}

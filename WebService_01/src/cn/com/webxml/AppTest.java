package cn.com.webxml;

import java.util.List;

import org.junit.Test;

/**
 * 远程调用webservice服务
 * 
 *   查询手机号码归属地
 * @author wjl
 *
 */
public class AppTest {
	
	@Test
	public void test()
	{
		MobileCodeWS ss = new MobileCodeWS();
		MobileCodeWSSoap soap = ss.getMobileCodeWSSoap();
		String info = soap.getMobileCodeInfo("15000XXXXX", null);
		System.out.println(info);
		
		ArrayOfString databaseInfo = soap.getDatabaseInfo();
		List<String> list = databaseInfo.getString();
		for (String string : list) {
			System.out.println(string);
		}
	}
}

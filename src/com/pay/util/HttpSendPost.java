package com.pay.util;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.pay.conf.NbpConfig;

/* *
 *类名：NbpConfig
 *功能：消息发送类
 *详细：传入json数据发送post请求
 */
public class HttpSendPost {

	public static HttpResponse sendPost(String reqdata) throws Exception{
		DefaultHttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(NbpConfig.NBPAY_RDATA);
        StringEntity s = new StringEntity(reqdata.toString(),"UTF-8");
        s.setContentEncoding("UTF-8");
        s.setContentType("application/json");//发送json数据需要设置contentType
        post.setEntity(s);
        HttpResponse res = client.execute(post);
		return res;	
	}

}

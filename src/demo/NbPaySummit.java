package demo;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import com.alibaba.fastjson.JSON;
import com.pay.bean.Goods;
import com.pay.bean.TotalData;
import com.pay.util.HttpSendPost;

/* *
*类名：AlipaySubmit
*功能：宁波接口请求提交类
*/
public class NbPaySummit {
    public static void main(String[] args) throws Exception {
    	//拼数据
    	Goods gd=new Goods();
    	gd.setFreight("10.00");
    	gd.setImg("http://www.baidu.com");
    	gd.setName("长白山");
    	gd.setNum("1");
    	gd.setOnlynum("32165413");
    	gd.setPrice("50.00");
    	gd.setSale("3");
    	gd.setTotalPrice("5000.00");
    	List<Goods> lg=new ArrayList<Goods>();
    	lg.add(gd);
    	TotalData td=new TotalData();
    	td.setGoods(lg);
    	td.setCommid("1");
    	td.setOrderId("2134");
    	
    	
    	String reqdata=new String(JSON.toJSONString(td).toString().getBytes(), "UTF-8");
    	HttpResponse hts=HttpSendPost.sendPost(reqdata);
        System.out.println(hts.toString());
	}
}

package demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpResponse;
import com.alibaba.fastjson.JSON;
import com.pay.bean.Goods;
import com.pay.bean.TotalData;
import com.pay.util.ConstForm;
import com.pay.util.HttpSendPost;


public class SummitPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SummitPayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//构造商品
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
    	td.setOrderId("123456");
    	
    	//发送数据
    	String reqdata=new String(JSON.toJSONString(td).toString().getBytes(), "UTF-8");
    	HttpResponse hts;
		try {
			hts = HttpSendPost.sendPost(reqdata);
		    System.out.println(hts.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//构造html 页面提交跳转
		String htmlForm=ConstForm.getHtmlForm("123456");
		PrintWriter pw=response.getWriter();
		pw.write(htmlForm);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}

}

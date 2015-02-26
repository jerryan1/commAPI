package com.pay.util;

import com.pay.conf.NbpConfig;
/* *
 *类名：ConstForm
 *功能：构造提交表单
 *详细：构造提交表单
 */
public class ConstForm {
	public static String getHtmlForm(String orderId){
		  StringBuffer sbHtml = new StringBuffer();
        sbHtml.append("<form id=\"nbpsubmit\" action=\"" + NbpConfig.NBPAY_GATEWAY_NEW + "\">");
        sbHtml.append("<input type=\"hidden\" name=\"commid\" value=\"" + NbpConfig.COMMID + "\"/>");
        sbHtml.append("<input type=\"hidden\" name=\"orderId\" value=\"" + orderId + "\"/></form>");
        sbHtml.append("<script>document.forms['nbpsubmit'].submit();</script>");
		return sbHtml.toString();
	}
}

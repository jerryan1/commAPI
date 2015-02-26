package com.pay.conf;

/* *
 *类名：NbpConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 */

public class NbpConfig {
	
	
	public static final String NBPAY_RDATA = "http://192.168.0.56:8090/nbpay-pay/merchant/receiveCar.action?";//购物车数据发送请求网关
	public static final String NBPAY_GATEWAY_NEW = "http://192.168.0.56:8090/nbpay-pay/merchant/toPlaceOrder.action?";//数据发送网关
    public static final String COMMID="1";//商户ID
}

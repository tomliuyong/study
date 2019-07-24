package com.ipay.pay.wxpay.exception;

import com.ipay.pay.exception.PayException;

/**  
* @ClassName: WxPayException  
* @Description: 微信支付异常
* @author tom liu  
* @date 2019年7月22日 下午1:35:54  
*    
*/
public class WxPayException extends  PayException{

	/**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 1L;
	/**
	  * 微信支付返回的结果xml字符串
	 */
	  private String xmlString;

	public String getXmlString() {
		return xmlString;
	}

	public void setXmlString(String xmlString) {
		this.xmlString = xmlString;
	}
	
	public WxPayException(String returnMsg) {
		super.returnMsg = returnMsg;
	}
	  
	  
}

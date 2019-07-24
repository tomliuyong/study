package com.ipay.pay.wxpay;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import com.ipay.pay.wxpay.config.WxPayConfig;
import com.ipay.pay.wxpay.exception.WxPayException;
import com.ipay.pay.wxpay.request.WxPayRefundRequest;
import com.ipay.pay.wxpay.request.WxPayUnifiedOrderRequest;
import com.ipay.pay.wxpay.result.WxPayBaseResult;
import com.ipay.pay.wxpay.result.WxPayOrderCloseResult;
import com.ipay.pay.wxpay.result.WxPayOrderNotifyResult;
import com.ipay.pay.wxpay.result.WxPayOrderQueryResult;
import com.ipay.pay.wxpay.result.WxPayRefundNotifyResult;
import com.ipay.pay.wxpay.result.WxPayRefundQueryResult;
import com.ipay.pay.wxpay.result.WxPayRefundResult;
import com.ipay.pay.wxpay.result.WxPayUnifiedOrderResult;

/**  
* @ClassName: WxPayBaseService  
* @Description: 微信支付服务
* @author tom liu  
* @date 2019年7月22日 下午1:23:15  
*    
*/
public class WxPayBaseService  implements WxPayService {

	private static final String PAY_BASE_URL = "https://api.mch.weixin.qq.com";
	
	private static Logger log = (Logger) LogManager.getLogger(WxPayBaseService.class.getName());
	  
	@Override
	public WxPayOrderQueryResult queryOrder(String transactionId, String outTradeNo) throws WxPayException {
		
		return null;
	}

	@Override
	public WxPayOrderCloseResult closeOrder(String outTradeNo) throws WxPayException {
		
		return null;
	}

	@Override
	public WxPayUnifiedOrderResult unifiedOrder(WxPayUnifiedOrderRequest request) throws WxPayException {
		   // request.checkAndSign(this.getConfig());

		    String url = this.getPayBaseUrl() + "/pay/unifiedorder";
		    String responseContent = this.post(url, request.toXML(), false);
		    WxPayUnifiedOrderResult result = WxPayBaseResult.fromXML(responseContent, WxPayUnifiedOrderResult.class);
		  //  result.checkResult(this);
		    return result;
	}

	@Override
	public Map<String, String> getPayInfo(WxPayUnifiedOrderRequest request) throws WxPayException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxPayConfig getConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setConfig(WxPayConfig config) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WxPayRefundResult refund(WxPayRefundRequest request) throws WxPayException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxPayRefundQueryResult refundQuery(String transactionId, String outTradeNo, String outRefundNo,
			String refundId) throws WxPayException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxPayOrderNotifyResult parseOrderNotifyResult(String xmlData) throws WxPayException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WxPayRefundNotifyResult parseRefundNotifyResult(String xmlData) throws WxPayException {
		// TODO Auto-generated method stub
		return null;
	}

	 private String getPayBaseUrl() {
		    if (this.getConfig().useSandbox()) {
		      return PAY_BASE_URL + "/sandboxnew";
		    }

		    return PAY_BASE_URL;
		  }

}

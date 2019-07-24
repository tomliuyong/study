package com.ipay.pay.exception;

/**  
* @ClassName: PayException  
* @Description: 支付异常
* @author tom liu  
* @date 2019年7月22日 下午1:38:35  
*    
*/
public class PayException extends Exception{
	
	  /**  
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)  
	 */  
	private static final long serialVersionUID = 1L;
	
	  /**
	      * 返回状态码
	   */
	  protected String returnCode;
	  
	  /**
	      * 返回信息
	   */
	  protected String returnMsg;

	  /**
	      * 业务结果
	   */
	  protected String resultCode;

	  public String getReturnCode() {
	    return this.returnCode;
	  }

	  public String getReturnMsg() {
	    return this.returnMsg;
	  }

	  public String getResultCode() {
	    return this.resultCode;
	  }

}

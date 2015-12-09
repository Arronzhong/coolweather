
package util;

/**
 * HttpCallbackListener类中用到的接口
 *
 */
public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e);
	
	
}


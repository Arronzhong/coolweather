
package util;

/**
 * HttpCallbackListener�����õ��Ľӿ�
 *
 */
public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e);
	
	
}


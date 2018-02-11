package com.dapeng.qq4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dapeng.qq4j.face.IMsgHandler;

/**
 * 
 * @author jinpeng.zou
 * @created: 2018年2月11日
 * 
 */

public class QQ {
	private static final Logger LOG = LoggerFactory.getLogger(QQ.class);
	private IMsgHandler msgHandler;

	public QQ(IMsgHandler msgHandler, String qrPath) {
		System.setProperty("jsse.enableSNIExtension", "false"); // 防止SSL错误
		this.msgHandler = msgHandler;

		// 登陆
//		LoginController login = new LoginController();
//		login.login(qrPath);
	}

	public void start() {
		LOG.info("+++++++++++++++++++开始消息处理+++++++++++++++++++++");
		new Thread(new Runnable() {
			@Override
			public void run() {
				//MsgCenter.handleMsg(msgHandler);
			}
		}).start();
	}
}

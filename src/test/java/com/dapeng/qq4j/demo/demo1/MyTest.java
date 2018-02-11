package com.dapeng.qq4j.demo.demo1;

import com.dapeng.qq4j.face.IMsgHandler;


/**
 * 
 * @author jinpeng.zou
 * @created: 2018年2月11日
 * 
 */

public class MyTest {
	public static void main(String[] args) {
		String qrPath = "D://qq4j"; // 保存登陆二维码图片的路径，这里需要在本地新建目录
		IMsgHandler msgHandler = new SimpleDemo(); // 实现IMsgHandler接口的类
//		Wechat wechat = new Wechat(msgHandler, qrPath); // 【注入】
//		wechat.start(); // 启动服务，会在qrPath下生成一张二维码图片，扫描即可登陆，注意，二维码图片如果超过一定时间未扫描会过期，过期时会自动更新，所以你可能需要重新打开图片
	}
}

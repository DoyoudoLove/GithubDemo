package com.qrcode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;

import jp.sourceforge.qrcode.QRCodeDecoder;
import jp.sourceforge.qrcode.data.QRCodeImage;

/**
 * 解析QRcode生成的二维码
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月19日 下午3:13:15
 */
public class ReadQRcode {

	public static void main(String[] args) throws Exception {
		//首先读取二维码生成的位置
		File file = new File("/Users/Super/Desktop/1.png");
		
		BufferedImage bufferedImage = ImageIO.read(file);
		
		QRCodeDecoder codeDecoder = new QRCodeDecoder();
		String result = new String(codeDecoder.decode(new MYcoderImage(
				bufferedImage)), "gb2312");
		System.out.println(result);
	}

}

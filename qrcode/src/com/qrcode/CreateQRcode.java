package com.qrcode;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.UnsupportedEncodingException;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;

public class CreateQRcode {

	public static void main(String[] args) throws Exception  {

		Qrcode x=new Qrcode();
		x.setQrcodeErrorCorrect('M');//纠错等级
		x.setQrcodeEncodeMode('B');//N代表数字，A代表a-z,B代表其他
		x.setQrcodeVersion(7);//qrcode 版本号
		String qrData = "http://www.baidu.com";
		int width = 67 + 12 * ( 7 - 1);
		int height = 67 + 12 * ( 7 - 1);
		
		
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		Graphics2D gs = bufferedImage.createGraphics();
		
		gs.setBackground(Color.white);
		gs.setColor(Color.black);
		gs.clearRect(0, 0, width, height);
		
		int pixoff = 2;//偏移量
		
		byte[] d =qrData.getBytes("utf-8");
		if (d.length>0 && d.length <120){
		    boolean[][] s = x.calQrcode(d);

		    for (int i=0;i<s.length;i++){
		    		for (int j=0;j<s.length;j++){
		    			if (s[j][i]) {
		    				gs.fillRect(j * 3 + pixoff,i * 3 + pixoff, 3, 3);
		    			}
		    		}
		    }
		}
		
		gs.dispose(); //结束写入
		bufferedImage.flush();
		
		ImageIO.write(bufferedImage, "png", new File("/Users/Super/Desktop/QRcode生成二维码.png"));
		

	}

}

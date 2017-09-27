package com.qrcode;

import java.awt.image.BufferedImage;

import jp.sourceforge.qrcode.data.QRCodeImage;
/**
 * 实现QRCodeImage接口方法
 * @author SugarMan
 * @version 1.0
 * @time 2017年9月19日 下午3:33:21
 */

public class MYcoderImage implements QRCodeImage {
	
	BufferedImage bufferedImage;
	
	public MYcoderImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}

	@Override
	public int getHeight() {
		return bufferedImage.getHeight() ;
	}

	@Override
	public int getPixel(int arg0, int arg1) {
		
		return bufferedImage.getRGB(arg0, arg1);
	}

	@Override
	public int getWidth() {
		return bufferedImage.getWidth();
	}

}

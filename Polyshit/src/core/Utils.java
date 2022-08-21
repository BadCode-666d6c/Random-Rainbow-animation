package core;

import java.awt.Color;

public class Utils {

	
	public static Color getRainbowColor(int i) {
		
		int r=0,g=0,b=0;
		
		while(i<0)
			i+=255*6;
		
		while(i>255*6)
			i-=255*6;
		

		if(i>255*0&&i<=255*1) {
			r=255;
			g=i-255*0;
		}
		if(i>255*1&&i<=255*2) {
			r=255*2-i;
			g=255;
		}
		if(i>255*2&&i<=255*3) {
			b=i-255*2;
			g=255;
		}
		if(i>255*3&&i<=255*4) {
			g=255*4-i;
			b=255;
		}
		if(i>255*4&&i<=255*5) {
			r=i-255*4;
			b=255;
		}
		if(i>255*5&&i<=255*6) {
			b=255*6-i;
			r=255;
		}
		//System.out.println(r+" "+g+" "+b);
		return new Color(r,g,b);
	}
	
}

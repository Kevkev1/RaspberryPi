public class ConvertRGB
{
    public void main(String[] args) {
	return;
    }

    public int[] convert(int[] rgb) {
	int[] colors = new int[rgb.length];
	for(int i=0; i<rgb.length; i++) {
	    java.awt.Color c = new java.awt.Color(rgb[i]);
	    int b = c.getBlue();
	    int r = c.getRed();
	    int g = c.getGreen();
	    if(r >= 90 && g < 200 && b < 200 && r > g && r > b) colors[i] = 10; 	   //RED
	    else if(b >= 90 && r < 200 && g < 200 && b > g && b > r) colors[i] = 01; 			   //BLUE
	    else if(r < 80 && g < 80 && b < 80) colors[i] = 11;	   //BLACK
	    else colors[i] = 00;				   //OTHER

	    //System.out.println("Pixel " + i + " | RED: " + r + " | GREEN: " + g + " | BLUE: " + b + " | COLORS: " + colors[i]);
	}
	return colors;
    }
}

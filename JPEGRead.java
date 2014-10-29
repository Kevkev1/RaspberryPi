public class JPEGRead
{
    public static void main(String [] args) {
	return;
    }

    public static int[] getColors(String image, int height) {
	try {
	    if(height == 0) {
		return null;
	    }
	    java.awt.image.BufferedImage img = null;
	    img = javax.imageio.ImageIO.read(new java.io.File(image));
	    int[] colors = new int[img.getWidth()];
	    for(int x=0; x<img.getWidth(); x++) {
	        colors[x] = img.getRGB(x,height);
	    }
	    return colors;
	}
	catch (Exception e) {
	    return null;
	}
    }

    public static int[] getVerticalColors(String image) {
	try {
	    java.awt.image.BufferedImage img = null;
	    img = javax.imageio.ImageIO.read(new java.io.File(image));
	    int[] colors = new int[img.getHeight()];
	    int width = img.getWidth()/2;
	    for(int y=0; y<img.getHeight(); y++) {
		colors[y] = img.getRGB(width,y);
	    }
	    return colors;
	}
	catch (Exception e) { return null; }
    }
}

public class ProcessImage {
   public static void main(String [] args) {
      int[] colors;
      JPEGRead j = new JPEGRead();
      ConvertRGB c = new ConvertRGB();
      CalibrateWebcam cw = new CalibrateWebcam();
      int height = cw.calibrate(args[0]);
      colors = j.getColors(args[0],height);
      /*for(int i=0; i<colors.length; i++) {
         System.out.println("Pixel " + i + " " + colors[i]);
      }*/
      colors = c.convert(colors);
      int lastColor = 0;
      int start = 0;
      /*String s = "|";
      for(int i=0; i<colors.length; i++) {
	 if(lastColor != colors[i]) {
      	    s = s + " " + start + ".." + i + ": "  + lastColor + " |";
	    lastColor = colors[i];
      	    start = i;
	 }
      }
      System.out.println(s + " " + start + ".." + (colors.length-1) + ": " + colors[lastColor] + " |");
      //s.send(colors);
      */
      String s = "";
      for(int i=0; i<colors.length; i++) {
	 if(colors[i] == 1) s = s + "01";
	 if(colors[i] == 0) s = s + "00";
	 if(colors[i] == 10) s = s + "10";
	 if(colors[i] == 11) s = s + "11";
      }
      System.out.println(s);
      return;
   }
}

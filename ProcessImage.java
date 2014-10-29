public class ProcessImage {
   public ProcessImage(String file, int height) {
      long s1 = System.nanoTime();
      int[] colors;
      long s3 = System.nanoTime();
      colors = JPEGRead.getColors(file,height);
      long e3 = System.nanoTime();
      long s4 = System.nanoTime();
      colors = ConvertRGB.convert(colors);
      long e4 = System.nanoTime();
      int lastColor = 0;
      int start = 0;
      /*String s = "";
      for(int i=0; i<colors.length; i++) {
         if(colors[i] == 1) s = s + "01";
         if(colors[i] == 0) s = s + "00";
         if(colors[i] == 10) s = s + "10";
         if(colors[i] == 11) s = s + "11";
      }
      System.out.println(s);*/
      long e1 = System.nanoTime();
      System.out.println("Total Duration: " + (e1-s1));
      System.out.println("Read Duration: " + (e3-s3));
      System.out.println("Convertion Duration: " + (e4-s4));
      return;
   }

   public static void main(String [] args) {
      new ProcessImage(args[0],Integer.parseInt(args[1]));
      return;
   }
}

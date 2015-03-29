
public class Main {

  /** Main entry point. */
  public static void main(String args[]) {
    JarvisParser parser=null;
    if (args.length == 1) {
      try {
        parser = new JarvisParser(new java.io.FileInputStream(args[0]));
      } catch (java.io.FileNotFoundException e) {
	      e.printStackTrace();
      }
    } 
    try {
      parser.CompilationUnit();
      ((SimpleNode)parser.jjtree.rootNode()).dump(">");
      parser.rootNode().interpret();
    } catch (ParseException e) {
      e.printStackTrace();
    } catch (Exception e1) {
      e1.printStackTrace();
    }
  }
}

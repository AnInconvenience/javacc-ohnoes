public class JCompilationUnit extends SimpleNode {
  public JCompilationUnit(int id) {
    super(id);
  }

  public JCompilationUnit(JarvisParser p, int id) {
    super(p, id);
  }

  public void interpret()
  {
     int i, k = jjtGetNumChildren();

     for (i = 0; i < k; i++)
     {
	System.out.print("Executing:");
	Token first  = ((SimpleNode)jjtGetChild(i)).jjtGetFirstToken();
	Token last = ((SimpleNode)jjtGetChild(i)).jjtGetLastToken();
	for (Token t = first; t != null; t = t.next)
	{
	    System.out.print(" " + t);

	    if (t == last)
	    	break;
	}
	System.out.println();
	
        jjtGetChild(i).interpret();
     }

  }

}

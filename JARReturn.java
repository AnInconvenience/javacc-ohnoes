/* Generated By:JJTree: Do not edit this line. JARReturn.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=JAR,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JARReturn extends SimpleNode {
  public JARReturn(int id) {
    super(id);
  }

  public JARReturn(JarvisParser p, int id) {
    super(p, id);
  }

  public void interpret() {
	  jjtGetChild(0).interpret();
		  throw new JARError("[ERROR] Return out of function !!");
  }

}
/* JavaCC - OriginalChecksum=65a82822407950659e3db4a0252963bf (do not edit this line) */

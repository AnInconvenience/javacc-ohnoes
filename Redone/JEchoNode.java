/* Generated By:JJTree: Do not edit this line. JEchoNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=J,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JEchoNode extends SimpleNode {
  public JEchoNode(int id) {
    super(id);
  }

  public JEchoNode(JarvisParser p, int id) {
    super(p, id);
  }

  public void interpret()
  {
	  jjtGetChild(0).interpret();
	  System.out.println(""+stack[top--]);
  }

}
/* JavaCC - OriginalChecksum=93264c3f2b07a8104c9cf3abcc9ee10d (do not edit this line) */

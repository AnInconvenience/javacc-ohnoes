/* Generated By:JJTree: Do not edit this line. JARGENode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=JAR,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JARGENode extends SimpleNode {
  public JARGENode(int id) {
    super(id);
  }

  public JARGENode(JarvisParser p, int id) {
    super(p, id);
  }

	public void interpret()
	{
		jjtGetChild(0).interpret();
		jjtGetChild(1).interpret();

		if (stack[top] instanceof Integer && stack[top-1] instanceof Integer)
		{
			stack[--top] = new Boolean(((Integer)stack[top]).intValue() >= 
					((Integer)stack[top + 1]).intValue());
		}
		else

			stack[--top] = new Boolean(((Number)stack[top]).doubleValue() >=
					((Number)stack[top + 1]).doubleValue());
	}
}
/* JavaCC - OriginalChecksum=89d5e0bac0529426ebe7db80d8f41a76 (do not edit this line) */

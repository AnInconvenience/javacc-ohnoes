/* Generated By:JJTree: Do not edit this line. JMultNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=J,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JMultNode extends SimpleNode {
	public JMultNode(int id) {
		super(id);
	}

	public JMultNode(JarvisParser p, int id) {
		super(p, id);
	}

	public void interpret()
	{
		jjtGetChild(0).interpret();
		jjtGetChild(1).interpret();
		if (stack[top] instanceof Integer && stack[top-1] instanceof Integer)
			stack[--top] = new Integer(((Integer)stack[top]).intValue() * ((Integer)stack[top+1]).intValue());
		else
			stack[--top] = new Double(((Double)stack[top]).doubleValue() * ((Double)stack[top+1]).doubleValue());

	}
}
/* JavaCC - OriginalChecksum=54dcec7ecbc5064ff52daef5d3e04498 (do not edit this line) */

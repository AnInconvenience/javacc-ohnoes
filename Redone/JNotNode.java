/* Generated By:JJTree: Do not edit this line. JNotNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=J,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JNotNode extends SimpleNode {
	public JNotNode(int id) {
		super(id);
	}

	public JNotNode(JarvisParser p, int id) {
		super(p, id);
	}

	public void interpret()
	{
		jjtGetChild(0).interpret();
			stack[top]=new Boolean(!((Boolean)stack[top]).booleanValue());

	}
}
/* JavaCC - OriginalChecksum=8465e500b84869eb1f38949b833e968d (do not edit this line) */

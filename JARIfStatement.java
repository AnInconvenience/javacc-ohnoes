/* Generated By:JJTree: Do not edit this line. JARIfStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=JAR,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JARIfStatement extends SimpleNode {
	public JARIfStatement(int id) {
		super(id);
	}

	public JARIfStatement(JarvisParser p, int id) {
		super(p, id);
	}

	public void interpret()
	{
		jjtGetChild(0).interpret();
		int k=jjtGetNumChildren();
		
		//traiter bloc si if(true)
		if (((Boolean)stack[top]).booleanValue())
		{
			jjtGetChild(1).interpret();
		}
		else
		{
			if (k<3)
			{
			if (((Boolean)stack[top]).booleanValue())
			jjtGetChild(2).interpret();
			}
			else
			{
				for (int i = 3; i<=k; i=i+2) 
				{
					jjtGetChild(i-1).interpret();
					if (((Boolean)stack[top]).booleanValue())
					{
						jjtGetChild(i).interpret();
						break ; 
					}
				if (!((Boolean)stack[top]).booleanValue() && i==k-1)
				jjtGetChild(i).interpret();

				}
				
			}
		}

	}
}
/* JavaCC - OriginalChecksum=bbad753370bdff70c54e1dc4a0bb7189 (do not edit this line) */

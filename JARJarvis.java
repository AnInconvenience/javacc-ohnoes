/* Generated By:JJTree: Do not edit this line. JARJarvis.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=JAR,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JARJarvis extends SimpleNode {
	public JARJarvis(int id) {
		super(id);
	}

	public JARJarvis(JarvisParser p, int id) {
		super(p, id);
	}
	public void interpret()
	{
		int i, k = jjtGetNumChildren();
		for(i = 0; i < k ; i++)
		{
			System.out.print("Executing:");
			Token first = ((SimpleNode)jjtGetChild(i)).jjtGetFirstToken();
			Token last = ((SimpleNode)jjtGetChild(i)).jjtGetLastToken();
			for(Token t = first; t != null; t = t.next)
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
/* JavaCC - OriginalChecksum=de566767fba2abfd593409288aeb2a1a (do not edit this line) */

/* Generated By:JJTree: Do not edit this line. JARForStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=JAR,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JARForStatement extends SimpleNode {
  public JARForStatement(int id) {
    super(id);
  }

  public JARForStatement(JarvisParser p, int id) {
    super(p, id);
  }

  public void interpret()
  {
	//decl variable
	jjtGetChild(0).interpret();
	//affect° variable
	jjtGetChild(1).interpret();
	  do {
		  //condition boolenne
		  jjtGetChild(2).interpret();
		  if(((Boolean)stack[top--]).booleanValue())
		  {
			 //execution bloc
			 jjtGetChild(4).interpret();
			 //execution incrementation/decrementation
			 jjtGetChild(3).interpret();
		  }
		  else break;
	  } while (true);
  }

}
/* JavaCC - OriginalChecksum=c6c6fdab1fddabfec00048c6c2b6e109 (do not edit this line) */
/* Generated By:JJTree: Do not edit this line. JARAssign.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=JAR,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JARAssign extends SimpleNode {
  public JARAssign(int id) {
    super(id);
  }

  public JARAssign(JarvisParser p, int id) {
    super(p, id);
  }
  public void interpret()
  {

	  jjtGetChild(1).interpret();
	  symtab.put(""+((JARVarEval)jjtGetChild(0)).val, stack[top]);
  }

}
/* JavaCC - OriginalChecksum=9a20fc997479c605148e842aba6f7ba8 (do not edit this line) */

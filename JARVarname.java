/* Generated By:JJTree: Do not edit this line. JARVarname.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=JAR,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JARVarname extends SimpleNode {
	protected String val;
  public JARVarname(int id) {
    super(id);
  }

  public JARVarname(JarvisParser p, int id) {
    super(p, id);
  }
  public void interpret()
  {
	  stack[++top] = new String(this.val);
  }

}
/* JavaCC - OriginalChecksum=47878263057b9c779e3af20346a6aa22 (do not edit this line) */

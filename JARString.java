/* Generated By:JJTree: Do not edit this line. JARString.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=JAR,NODE_EXTENDS=MyNode,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class JARString extends SimpleNode {
	String val;
  public JARString(int id) {
    super(id);
  }

  public JARString(JarvisParser p, int id) {
    super(p, id);
  }

  public void interpret()
  {
	  stack[++top] = new String(val);
  }
  
  public String toString() {
	  return this.val;
  }

}
/* JavaCC - OriginalChecksum=333a7c09752385ba2b5aa23ed4483cfd (do not edit this line) */

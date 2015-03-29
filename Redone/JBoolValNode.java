public
class JBoolValNode extends SimpleNode {
	boolean val;
  public JBoolValNode(int id) {
    super(id);
  }

  public JBoolValNode(JarvisParser p, int id) {
    super(p, id);
  }

  public void interpret()
  {
	  stack[++top]=new Boolean(val);
  }
}


public
class JARBool extends SimpleNode {
	boolean val;
  public JARBool(int id) {
    super(id);
  }

  public JARBool(JarvisParser p, int id) {
    super(p, id);
  }

  public void interpret()
  {
	  stack[++top]=new Boolean(val);
  }
}


public
class JStringValNode extends SimpleNode {
	String val;
	public JStringValNode(int id) {
		super(id);
	}

	public JStringValNode(JarvisParser p, int id) {
		super(p, id);
	}

	public void interpret()
	{
		stack[++top]=val;
	}
}

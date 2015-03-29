public
class JIntValNode extends SimpleNode {
	int val;
	public JIntValNode(int id) {
		super(id);
	}

	public JIntValNode(JarvisParser p, int id) {
		super(p, id);
	}

	public void interpret()
	{
		stack[++top]=new Integer(val);
	}
}


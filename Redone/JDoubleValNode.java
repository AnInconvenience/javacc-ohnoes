
public
class JDoubleValNode extends SimpleNode {
	double val;
	public JDoubleValNode(int id) {
		super(id);
	}

	public JDoubleValNode(JarvisParser p, int id) {
		super(p, id);
	}

	public void interpret()
	{
		stack[++top]=new Double(val);
	}
}


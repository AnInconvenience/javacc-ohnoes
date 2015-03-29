public
class JAndNode extends SimpleNode {
	public JAndNode(int id) {
		super(id);
	}

	public JAndNode(JarvisParser p, int id) {
		super(p, id);
	}

	public void interpret()
	{
		jjtGetChild(0).interpret();
		jjtGetChild(1).interpret();
		stack[--top] = new Boolean(((Boolean)stack[top]).booleanValue() && ((Boolean)stack[top+1]).booleanValue());
	}
}

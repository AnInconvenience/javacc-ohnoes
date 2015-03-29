public
class JGENode extends SimpleNode {
	public JGENode(int id) {
		super(id);
	}

	public JGENode(JarvisParser p, int id) {
		super(p, id);
	}
	public void interpret()
	{
		jjtGetChild(0).interpret();
		jjtGetChild(1).interpret();

		if (stack[top] instanceof Integer && stack[top-1] instanceof Integer)
		{
stack[--top] = new Boolean(((Integer)stack[top]).intValue() >=
				((Integer)stack[top + 1]).intValue());
		}
		else
		stack[--top] = new Boolean(((Double)stack[top]).doubleValue() >=
				((Double)stack[top + 1]).doubleValue());
	}

}

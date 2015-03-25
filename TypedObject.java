

public class TypedObject
{

	private Boolean b;
	private Character c;
	private Integer i;
	private Double d;
	private String s;
	private Type type;

	public TypedObject (Type t, Object o)
	{
		this.type=t;
		if (o!=null) 
		{
			switch(t)
			{
				case STRING:
					this.s=(String)o;
					break;
				case INT:
					this.i=(Integer)o;
					break;
				case DOUBLE:
					this.d=(Double)o;
					break;
				case BOOL:
					this.b=(Boolean)o;
					break;
				case CHAR:
					this.c=(Character)c;
					break;
			}
		}
	}

	public Boolean getBoolean()
	{
		return this.b;
	}

	public String getString()
	{
		return this.s;
	}

	public Integer getInteger()
	{
		return this.i;
	}
	public Double getDouble()
	{
		return this.d;
	}

	public Character getCharacter()
	{
		return this.c;
	}

	public Type getType()
	{
		return this.type;
	}

	@Override
	public String toString()
	{
		String str="";
		if (b!=null) str = b.toString();
		else if (s!=null) str = s;
		else if (i!=null) str = i.toString();
		else if (d!=null) str = d.toString();
		else if (c!=null) str = c.toString();
		return str+" type : "+this.type; 
	}

	public void setType(Type t)
	{
		this.type=t;
	}

	public void resetFields()
	{
		this.s=null;
		this.d=null;
		this.c=null;
		this.b=null;
		this.i=null;
		this.type=Type.NULL;
	}

	public void intToDouble()
	{
		if (this.i != null) 
		{
			this.d=new Double(this.i.doubleValue());
			this.i=null;
		}
	}

	public void doubleToInt()
	{
		if (this.d != null) 
		{
			this.i=new Integer(this.d.intValue());
			this.d=null;
		}
	}
	public void setBoolean(Boolean b)
	{
		this.b=b;
	}

	public void setString(String s)
	{
		this.s = s;
	}

	public void setInteger(Integer i)
	{
		this.i = i;
	}
	public void setDouble(Double d)
	{
		this.d = d;
	}

	public TypedObject neg()
	{
		if(this.type.equals(Type.INT))
			this.i=-this.i;
		else if(this.type.equals(Type.DOUBLE))
			this.d=-this.d;

		return this;
	}
	public void add(TypedObject o)
	{
		if (this.type.equals(Type.INT))
			this.i+=o.getInteger();
		else if (this.type.equals(Type.DOUBLE))
			this.d+=o.getDouble();
	}

	public void sub(TypedObject o)
	{
		if (this.type.equals(Type.INT))
			this.i-=o.getInteger();
		else if (this.type.equals(Type.DOUBLE))
			this.d-=o.getDouble();

	}

	public void div(TypedObject o)
	{
		if (this.type.equals(Type.INT))
			this.i/=o.getInteger();
		else if (this.type.equals(Type.DOUBLE))
			this.d/=o.getDouble();

	}

	public void mul(TypedObject o)
	{
		if (this.type.equals(Type.INT))
			this.i*=o.getInteger();
		else if (this.type.equals(Type.DOUBLE))
			this.d*=o.getDouble();

	}

	public void and(TypedObject o)
	{
		this.b=this.b && o.getBoolean();
	}

	public void or(TypedObject o)
	{
		this.b=this.b || o.getBoolean();
	}

	public Boolean lt(TypedObject o)
	{
		return this.i == null ? this.d < o.getDouble() : this.i < o.getInteger();
	}

	public Boolean le(TypedObject o)
	{
		return this.i == null ? this.d <= o.getDouble() : this.i <= o.getInteger();
	}

	public Boolean gt(TypedObject o)
	{
		return this.i == null ? this.d > o.getDouble() : this.i > o.getInteger();
	}

	public Boolean ge(TypedObject o)
	{
		return this.i == null ? this.d >= o.getDouble() : this.i >= o.getInteger();
	}

	public Boolean eq(TypedObject o)
	{
		return this.i == null ? this.d == o.getDouble() : this.i == o.getInteger();
	}

	public Boolean ne(TypedObject o)
	{
		return this.i == null ? this.d != o.getDouble() : this.i != o.getInteger();
	}


}

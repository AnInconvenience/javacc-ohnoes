
public class Jarvis{
	public static void main(String args[]) {
		try {
		JarvisParser parser= new JarvisParser(System.in);
			if(args.length == 0) {
					try{
						parser.jarvis();
						((SimpleNode)parser.rootNode()).dump(" ");
						
						//((SimpleNode)parser.rootNode()).printStack();
						parser.rootNode().interpret();
					} catch(Exception e)

					{
						System.out.println("NOK.");
						e.printStackTrace();

					}
			}else {
				java.io.File f = new java.io.File(args[0]);
				JarvisParser.ReInit(new java.io.FileInputStream(f));
					try{
						parser.jarvis();
						((SimpleNode)parser.rootNode()).dump(" ");
						parser.rootNode().interpret();
					} catch(Exception e)

					{
						System.out.println("NOK.");
						System.out.println(e.getMessage());

						System.out.println(e.getClass().toString());

					}
				}
			}
		catch (java.io.FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}

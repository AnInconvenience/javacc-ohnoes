/* Generated By:JJTree&JavaCC: Do not edit this line. JarvisParser.java */
/** Stupid Programming Language parser. */
public class JarvisParser/*@bgen(jjtree)*/implements JarvisParserTreeConstants, JarvisParserConstants {/*@bgen(jjtree)*/
  protected static JJTJarvisParserState jjtree = new JJTJarvisParserState();
  /**
   * Returns the root node of the AST.  
   * It only makes sense to call this after a successful parse. 
   * @return the root node
   */
  public Node rootNode() {
    return jjtree.rootNode();
  }

/*
 * Program structuring syntax follows.
 */
  static final public void CompilationUnit() throws ParseException {
                                           /*@bgen(jjtree) CompilationUnit */
  JCompilationUnit jjtn000 = new JCompilationUnit(JJTCOMPILATIONUNIT);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
  jjtn000.jjtSetFirstToken(getToken(1));
    try {
      label_1:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ECHO:
          ;
          break;
        default:
          jj_la1[0] = jj_gen;
          break label_1;
        }
        Echo();
      }
      jj_consume_token(0);
    } catch (Throwable jjte000) {
  if (jjtc000) {
    jjtree.clearNodeScope(jjtn000);
    jjtc000 = false;
  } else {
    jjtree.popNode();
  }
  if (jjte000 instanceof RuntimeException) {
    {if (true) throw (RuntimeException)jjte000;}
  }
  if (jjte000 instanceof ParseException) {
    {if (true) throw (ParseException)jjte000;}
  }
  {if (true) throw (Error)jjte000;}
    } finally {
  if (jjtc000) {
    jjtree.closeNodeScope(jjtn000, true);
    jjtn000.jjtSetLastToken(getToken(0));
  }
    }
  }

  static final public void Echo() throws ParseException {
  JEchoNode jjtn001 = new JEchoNode(JJTECHONODE);
  boolean jjtc001 = true;
  jjtree.openNodeScope(jjtn001);
  jjtn001.jjtSetFirstToken(getToken(1));
    try {
      jj_consume_token(ECHO);
      expr();
    } catch (Throwable jjte001) {
  if (jjtc001) {
    jjtree.clearNodeScope(jjtn001);
    jjtc001 = false;
  } else {
    jjtree.popNode();
  }
  if (jjte001 instanceof RuntimeException) {
    {if (true) throw (RuntimeException)jjte001;}
  }
  if (jjte001 instanceof ParseException) {
    {if (true) throw (ParseException)jjte001;}
  }
  {if (true) throw (Error)jjte001;}
    } finally {
  if (jjtc001) {
    jjtree.closeNodeScope(jjtn001,  1);
    jjtn001.jjtSetLastToken(getToken(0));
  }
    }
  }

  static final public void expr() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MINUS:
    case NOT:
    case LP:
    case INTEGER_LITERAL:
    case DECIMALNUMBER:
    case BOOLVAL:
      bool_expr();
      break;
    case STRINGDECL:
      string();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void bool_expr() throws ParseException {
    bool_or_expr();
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      jj_consume_token(AND);
                JAndNode jjtn001 = new JAndNode(JJTANDNODE);
                boolean jjtc001 = true;
                jjtree.openNodeScope(jjtn001);
                jjtn001.jjtSetFirstToken(getToken(1));
      try {
        bool_expr();
      } catch (Throwable jjte001) {
                if (jjtc001) {
                  jjtree.clearNodeScope(jjtn001);
                  jjtc001 = false;
                } else {
                  jjtree.popNode();
                }
                if (jjte001 instanceof RuntimeException) {
                  {if (true) throw (RuntimeException)jjte001;}
                }
                if (jjte001 instanceof ParseException) {
                  {if (true) throw (ParseException)jjte001;}
                }
                {if (true) throw (Error)jjte001;}
      } finally {
                if (jjtc001) {
                  jjtree.closeNodeScope(jjtn001,  2);
                  jjtn001.jjtSetLastToken(getToken(0));
                }
      }
    }
  }

  static final public void bool_or_expr() throws ParseException {
    equ_expr();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OR:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      jj_consume_token(OR);
                  JOrNode jjtn001 = new JOrNode(JJTORNODE);
                  boolean jjtc001 = true;
                  jjtree.openNodeScope(jjtn001);
                  jjtn001.jjtSetFirstToken(getToken(1));
      try {
        equ_expr();
      } catch (Throwable jjte001) {
                  if (jjtc001) {
                    jjtree.clearNodeScope(jjtn001);
                    jjtc001 = false;
                  } else {
                    jjtree.popNode();
                  }
                  if (jjte001 instanceof RuntimeException) {
                    {if (true) throw (RuntimeException)jjte001;}
                  }
                  if (jjte001 instanceof ParseException) {
                    {if (true) throw (ParseException)jjte001;}
                  }
                  {if (true) throw (Error)jjte001;}
      } finally {
                  if (jjtc001) {
                    jjtree.closeNodeScope(jjtn001,  2);
                    jjtn001.jjtSetLastToken(getToken(0));
                  }
      }
    }
  }

  static final public void equ_expr() throws ParseException {
    compar_expr();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VALEQUALS:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_4;
      }
      jj_consume_token(VALEQUALS);
                       JEQNode jjtn001 = new JEQNode(JJTEQNODE);
                       boolean jjtc001 = true;
                       jjtree.openNodeScope(jjtn001);
                       jjtn001.jjtSetFirstToken(getToken(1));
      try {
        compar_expr();
      } catch (Throwable jjte001) {
                       if (jjtc001) {
                         jjtree.clearNodeScope(jjtn001);
                         jjtc001 = false;
                       } else {
                         jjtree.popNode();
                       }
                       if (jjte001 instanceof RuntimeException) {
                         {if (true) throw (RuntimeException)jjte001;}
                       }
                       if (jjte001 instanceof ParseException) {
                         {if (true) throw (ParseException)jjte001;}
                       }
                       {if (true) throw (Error)jjte001;}
      } finally {
                       if (jjtc001) {
                         jjtree.closeNodeScope(jjtn001,  2);
                         jjtn001.jjtSetLastToken(getToken(0));
                       }
      }
      jj_consume_token(NOTEQUALS);
                       JNENode jjtn002 = new JNENode(JJTNENODE);
                       boolean jjtc002 = true;
                       jjtree.openNodeScope(jjtn002);
                       jjtn002.jjtSetFirstToken(getToken(1));
      try {
        compar_expr();
      } catch (Throwable jjte002) {
                       if (jjtc002) {
                         jjtree.clearNodeScope(jjtn002);
                         jjtc002 = false;
                       } else {
                         jjtree.popNode();
                       }
                       if (jjte002 instanceof RuntimeException) {
                         {if (true) throw (RuntimeException)jjte002;}
                       }
                       if (jjte002 instanceof ParseException) {
                         {if (true) throw (ParseException)jjte002;}
                       }
                       {if (true) throw (Error)jjte002;}
      } finally {
                       if (jjtc002) {
                         jjtree.closeNodeScope(jjtn002,  2);
                         jjtn002.jjtSetLastToken(getToken(0));
                       }
      }
    }
  }

  static final public void compar_expr() throws ParseException {
    num_expr();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case GEQUALS:
      case LEQUALS:
      case GREATER:
      case LESSER:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case GEQUALS:
        jj_consume_token(GEQUALS);
                                JGENode jjtn001 = new JGENode(JJTGENODE);
                                boolean jjtc001 = true;
                                jjtree.openNodeScope(jjtn001);
                                jjtn001.jjtSetFirstToken(getToken(1));
        try {
          num_expr();
        } catch (Throwable jjte001) {
                                if (jjtc001) {
                                  jjtree.clearNodeScope(jjtn001);
                                  jjtc001 = false;
                                } else {
                                  jjtree.popNode();
                                }
                                if (jjte001 instanceof RuntimeException) {
                                  {if (true) throw (RuntimeException)jjte001;}
                                }
                                if (jjte001 instanceof ParseException) {
                                  {if (true) throw (ParseException)jjte001;}
                                }
                                {if (true) throw (Error)jjte001;}
        } finally {
                                if (jjtc001) {
                                  jjtree.closeNodeScope(jjtn001,  2);
                                  jjtn001.jjtSetLastToken(getToken(0));
                                }
        }
        break;
      case LEQUALS:
        jj_consume_token(LEQUALS);
                                JLENode jjtn002 = new JLENode(JJTLENODE);
                                boolean jjtc002 = true;
                                jjtree.openNodeScope(jjtn002);
                                jjtn002.jjtSetFirstToken(getToken(1));
        try {
          num_expr();
        } catch (Throwable jjte002) {
                                if (jjtc002) {
                                  jjtree.clearNodeScope(jjtn002);
                                  jjtc002 = false;
                                } else {
                                  jjtree.popNode();
                                }
                                if (jjte002 instanceof RuntimeException) {
                                  {if (true) throw (RuntimeException)jjte002;}
                                }
                                if (jjte002 instanceof ParseException) {
                                  {if (true) throw (ParseException)jjte002;}
                                }
                                {if (true) throw (Error)jjte002;}
        } finally {
                                if (jjtc002) {
                                  jjtree.closeNodeScope(jjtn002,  2);
                                  jjtn002.jjtSetLastToken(getToken(0));
                                }
        }
        break;
      case GREATER:
        jj_consume_token(GREATER);
                                JGTNode jjtn003 = new JGTNode(JJTGTNODE);
                                boolean jjtc003 = true;
                                jjtree.openNodeScope(jjtn003);
                                jjtn003.jjtSetFirstToken(getToken(1));
        try {
          num_expr();
        } catch (Throwable jjte003) {
                                if (jjtc003) {
                                  jjtree.clearNodeScope(jjtn003);
                                  jjtc003 = false;
                                } else {
                                  jjtree.popNode();
                                }
                                if (jjte003 instanceof RuntimeException) {
                                  {if (true) throw (RuntimeException)jjte003;}
                                }
                                if (jjte003 instanceof ParseException) {
                                  {if (true) throw (ParseException)jjte003;}
                                }
                                {if (true) throw (Error)jjte003;}
        } finally {
                                if (jjtc003) {
                                  jjtree.closeNodeScope(jjtn003,  2);
                                  jjtn003.jjtSetLastToken(getToken(0));
                                }
        }
        break;
      case LESSER:
        jj_consume_token(LESSER);
                                JLTNode jjtn004 = new JLTNode(JJTLTNODE);
                                boolean jjtc004 = true;
                                jjtree.openNodeScope(jjtn004);
                                jjtn004.jjtSetFirstToken(getToken(1));
        try {
          num_expr();
        } catch (Throwable jjte004) {
                                if (jjtc004) {
                                  jjtree.clearNodeScope(jjtn004);
                                  jjtc004 = false;
                                } else {
                                  jjtree.popNode();
                                }
                                if (jjte004 instanceof RuntimeException) {
                                  {if (true) throw (RuntimeException)jjte004;}
                                }
                                if (jjte004 instanceof ParseException) {
                                  {if (true) throw (ParseException)jjte004;}
                                }
                                {if (true) throw (Error)jjte004;}
        } finally {
                                if (jjtc004) {
                                  jjtree.closeNodeScope(jjtn004,  2);
                                  jjtn004.jjtSetLastToken(getToken(0));
                                }
        }
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

/**c'est souvent une expression numerique**/
  static final public void num_expr() throws ParseException {
    term();
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
                 JPlusNode jjtn001 = new JPlusNode(JJTPLUSNODE);
                 boolean jjtc001 = true;
                 jjtree.openNodeScope(jjtn001);
                 jjtn001.jjtSetFirstToken(getToken(1));
        try {
          term();
        } catch (Throwable jjte001) {
                 if (jjtc001) {
                   jjtree.clearNodeScope(jjtn001);
                   jjtc001 = false;
                 } else {
                   jjtree.popNode();
                 }
                 if (jjte001 instanceof RuntimeException) {
                   {if (true) throw (RuntimeException)jjte001;}
                 }
                 if (jjte001 instanceof ParseException) {
                   {if (true) throw (ParseException)jjte001;}
                 }
                 {if (true) throw (Error)jjte001;}
        } finally {
                 if (jjtc001) {
                   jjtree.closeNodeScope(jjtn001,  2);
                   jjtn001.jjtSetLastToken(getToken(0));
                 }
        }
        break;
      case MINUS:
        jj_consume_token(MINUS);
                  JMinusNode jjtn002 = new JMinusNode(JJTMINUSNODE);
                  boolean jjtc002 = true;
                  jjtree.openNodeScope(jjtn002);
                  jjtn002.jjtSetFirstToken(getToken(1));
        try {
          term();
        } catch (Throwable jjte002) {
                  if (jjtc002) {
                    jjtree.clearNodeScope(jjtn002);
                    jjtc002 = false;
                  } else {
                    jjtree.popNode();
                  }
                  if (jjte002 instanceof RuntimeException) {
                    {if (true) throw (RuntimeException)jjte002;}
                  }
                  if (jjte002 instanceof ParseException) {
                    {if (true) throw (ParseException)jjte002;}
                  }
                  {if (true) throw (Error)jjte002;}
        } finally {
                  if (jjtc002) {
                    jjtree.closeNodeScope(jjtn002,  2);
                    jjtn002.jjtSetLastToken(getToken(0));
                  }
        }
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void term() throws ParseException {
    unary();
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
      case DIVIDE:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_7;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULTIPLY:
        jj_consume_token(MULTIPLY);
                     JMultNode jjtn001 = new JMultNode(JJTMULTNODE);
                     boolean jjtc001 = true;
                     jjtree.openNodeScope(jjtn001);
                     jjtn001.jjtSetFirstToken(getToken(1));
        try {
          unary();
        } catch (Throwable jjte001) {
                     if (jjtc001) {
                       jjtree.clearNodeScope(jjtn001);
                       jjtc001 = false;
                     } else {
                       jjtree.popNode();
                     }
                     if (jjte001 instanceof RuntimeException) {
                       {if (true) throw (RuntimeException)jjte001;}
                     }
                     if (jjte001 instanceof ParseException) {
                       {if (true) throw (ParseException)jjte001;}
                     }
                     {if (true) throw (Error)jjte001;}
        } finally {
                     if (jjtc001) {
                       jjtree.closeNodeScope(jjtn001,  2);
                       jjtn001.jjtSetLastToken(getToken(0));
                     }
        }
        break;
      case DIVIDE:
        jj_consume_token(DIVIDE);
                   JDivNode jjtn002 = new JDivNode(JJTDIVNODE);
                   boolean jjtc002 = true;
                   jjtree.openNodeScope(jjtn002);
                   jjtn002.jjtSetFirstToken(getToken(1));
        try {
          unary();
        } catch (Throwable jjte002) {
                   if (jjtc002) {
                     jjtree.clearNodeScope(jjtn002);
                     jjtc002 = false;
                   } else {
                     jjtree.popNode();
                   }
                   if (jjte002 instanceof RuntimeException) {
                     {if (true) throw (RuntimeException)jjte002;}
                   }
                   if (jjte002 instanceof ParseException) {
                     {if (true) throw (ParseException)jjte002;}
                   }
                   {if (true) throw (Error)jjte002;}
        } finally {
                   if (jjtc002) {
                     jjtree.closeNodeScope(jjtn002,  2);
                     jjtn002.jjtSetLastToken(getToken(0));
                   }
        }
        break;
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void unary() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NOT:
      jj_consume_token(NOT);
          JNotNode jjtn001 = new JNotNode(JJTNOTNODE);
          boolean jjtc001 = true;
          jjtree.openNodeScope(jjtn001);
          jjtn001.jjtSetFirstToken(getToken(1));
      try {
        element();
      } catch (Throwable jjte001) {
          if (jjtc001) {
            jjtree.clearNodeScope(jjtn001);
            jjtc001 = false;
          } else {
            jjtree.popNode();
          }
          if (jjte001 instanceof RuntimeException) {
            {if (true) throw (RuntimeException)jjte001;}
          }
          if (jjte001 instanceof ParseException) {
            {if (true) throw (ParseException)jjte001;}
          }
          {if (true) throw (Error)jjte001;}
      } finally {
          if (jjtc001) {
            jjtree.closeNodeScope(jjtn001,  1);
            jjtn001.jjtSetLastToken(getToken(0));
          }
      }
      break;
    case MINUS:
      jj_consume_token(MINUS);
              JNegNode jjtn002 = new JNegNode(JJTNEGNODE);
              boolean jjtc002 = true;
              jjtree.openNodeScope(jjtn002);
              jjtn002.jjtSetFirstToken(getToken(1));
      try {
        element();
      } catch (Throwable jjte002) {
              if (jjtc002) {
                jjtree.clearNodeScope(jjtn002);
                jjtc002 = false;
              } else {
                jjtree.popNode();
              }
              if (jjte002 instanceof RuntimeException) {
                {if (true) throw (RuntimeException)jjte002;}
              }
              if (jjte002 instanceof ParseException) {
                {if (true) throw (ParseException)jjte002;}
              }
              {if (true) throw (Error)jjte002;}
      } finally {
              if (jjtc002) {
                jjtree.closeNodeScope(jjtn002,  1);
                jjtn002.jjtSetLastToken(getToken(0));
              }
      }
      break;
    case LP:
    case INTEGER_LITERAL:
    case DECIMALNUMBER:
    case BOOLVAL:
      element();
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void element() throws ParseException {
Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER_LITERAL:
  JIntValNode jjtn001 = new JIntValNode(JJTINTVALNODE);
  boolean jjtc001 = true;
  jjtree.openNodeScope(jjtn001);
  jjtn001.jjtSetFirstToken(getToken(1));
      try {
        jj_consume_token(INTEGER_LITERAL);
                       jjtree.closeNodeScope(jjtn001, true);
                       jjtc001 = false;
                       jjtn001.jjtSetLastToken(getToken(0));
                      jjtn001.val=Integer.parseInt(token.image);
      } finally {
  if (jjtc001) {
    jjtree.closeNodeScope(jjtn001, true);
    jjtn001.jjtSetLastToken(getToken(0));
  }
      }
      break;
    case DECIMALNUMBER:
  JDoubleValNode jjtn002 = new JDoubleValNode(JJTDOUBLEVALNODE);
  boolean jjtc002 = true;
  jjtree.openNodeScope(jjtn002);
  jjtn002.jjtSetFirstToken(getToken(1));
      try {
        jj_consume_token(DECIMALNUMBER);
                     jjtree.closeNodeScope(jjtn002, true);
                     jjtc002 = false;
                     jjtn002.jjtSetLastToken(getToken(0));
                    jjtn002.val=Double.parseDouble(token.image);
      } finally {
  if (jjtc002) {
    jjtree.closeNodeScope(jjtn002, true);
    jjtn002.jjtSetLastToken(getToken(0));
  }
      }
      break;
    case BOOLVAL:
  JBoolValNode jjtn003 = new JBoolValNode(JJTBOOLVALNODE);
  boolean jjtc003 = true;
  jjtree.openNodeScope(jjtn003);
  jjtn003.jjtSetFirstToken(getToken(1));
      try {
        jj_consume_token(BOOLVAL);
               jjtree.closeNodeScope(jjtn003, true);
               jjtc003 = false;
               jjtn003.jjtSetLastToken(getToken(0));
              jjtn003.val=Boolean.parseBoolean(token.image);
      } finally {
  if (jjtc003) {
    jjtree.closeNodeScope(jjtn003, true);
    jjtn003.jjtSetLastToken(getToken(0));
  }
      }
      break;
    case LP:
      jj_consume_token(LP);
      expr();
      jj_consume_token(RP);
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void string() throws ParseException {
Token t,s;
String str;
  JStringValNode jjtn001 = new JStringValNode(JJTSTRINGVALNODE);
  boolean jjtc001 = true;
  jjtree.openNodeScope(jjtn001);
  jjtn001.jjtSetFirstToken(getToken(1));
    try {
      t = jj_consume_token(STRINGDECL);
         str=t.image.substring(1,t.image.length()-1);
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
          ;
          break;
        default:
          jj_la1[13] = jj_gen;
          break label_8;
        }
        jj_consume_token(PLUS);
        s = jj_consume_token(STRINGDECL);
                str=str+s.image.substring(1,s.image.length()-1);
      }
          jjtree.closeNodeScope(jjtn001, true);
          jjtc001 = false;
          jjtn001.jjtSetLastToken(getToken(0));
         jjtn001.val=str;
    } finally {
  if (jjtc001) {
    jjtree.closeNodeScope(jjtn001, true);
    jjtn001.jjtSetLastToken(getToken(0));
  }
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public JarvisParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[14];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x100000,0x10080080,0x20000,0x40000,0x800,0x1e000,0x1e000,0xc0,0xc0,0x300,0x300,0x10080080,0x10000000,0x40,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x41c,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1c,0x1c,0x0,};
   }

  /** Constructor with InputStream. */
  public JarvisParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public JarvisParser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new JarvisParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public JarvisParser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new JarvisParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public JarvisParser(JarvisParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(JarvisParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 14; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[47];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 14; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 47; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}

package analizadores;
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserGraphics extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserGraphics() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserGraphics(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserGraphics(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\064\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\004\000\002\003\002" +
    "\000\002\004\006\000\002\005\006\000\002\006\006\000" +
    "\002\007\010\000\002\010\010\000\002\011\010\000\002" +
    "\012\006\000\002\013\003\000\002\013\003\000\002\014" +
    "\010\000\002\015\010\000\002\016\006\000\002\017\006" +
    "\000\002\020\004\000\002\020\004\000\002\020\004\000" +
    "\002\020\004\000\002\020\002\000\002\021\004\000\002" +
    "\021\004\000\002\021\004\000\002\021\004\000\002\021" +
    "\004\000\002\021\004\000\002\021\004\000\002\021\002" +
    "\000\002\022\004\000\002\023\005\000\002\023\002\000" +
    "\002\024\006\000\002\025\007\000\002\025\002\000\002" +
    "\026\004\000\002\027\004\000\002\027\002\000\002\030" +
    "\004\000\002\031\005\000\002\031\005\000\002\031\005" +
    "\000\002\031\005\000\002\031\002\000\002\032\003\000" +
    "\002\032\003\000\002\032\004\000\002\033\010\000\002" +
    "\033\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\202\000\010\002\uffce\004\004\007\006\001\002\000" +
    "\010\002\ufffc\005\017\006\022\001\002\000\004\002\015" +
    "\001\002\000\004\033\010\001\002\000\004\002\uffff\001" +
    "\002\000\004\024\011\001\002\000\004\034\012\001\002" +
    "\000\004\027\013\001\002\000\006\002\uffce\007\006\001" +
    "\002\000\004\002\uffcf\001\002\000\004\002\001\001\002" +
    "\000\010\002\uffce\004\004\007\006\001\002\000\004\031" +
    "\155\001\002\000\004\002\000\001\002\000\010\002\uffce" +
    "\004\004\007\006\001\002\000\004\031\023\001\002\000" +
    "\022\010\025\013\035\014\033\017\036\020\030\021\027" +
    "\022\041\032\uffe2\001\002\000\022\010\025\013\035\014" +
    "\033\017\036\020\030\021\027\022\041\032\uffe2\001\002" +
    "\000\004\030\150\001\002\000\004\032\147\001\002\000" +
    "\004\030\144\001\002\000\004\030\137\001\002\000\022" +
    "\010\025\013\035\014\033\017\036\020\030\021\027\022" +
    "\041\032\uffe2\001\002\000\022\010\025\013\035\014\033" +
    "\017\036\020\030\021\027\022\041\032\uffe2\001\002\000" +
    "\004\030\130\001\002\000\022\010\025\013\035\014\033" +
    "\017\036\020\030\021\027\022\041\032\uffe2\001\002\000" +
    "\004\030\063\001\002\000\004\030\051\001\002\000\022" +
    "\010\025\013\035\014\033\017\036\020\030\021\027\022" +
    "\041\032\uffe2\001\002\000\022\010\025\013\035\014\033" +
    "\017\036\020\030\021\027\022\041\032\uffe2\001\002\000" +
    "\004\030\044\001\002\000\022\010\025\013\035\014\033" +
    "\017\036\020\030\021\027\022\041\032\uffe2\001\002\000" +
    "\004\032\uffe9\001\002\000\004\024\045\001\002\000\004" +
    "\027\046\001\002\000\022\010\uffef\013\uffef\014\uffef\017" +
    "\uffef\020\uffef\021\uffef\022\uffef\032\uffef\001\002\000\004" +
    "\032\uffe4\001\002\000\004\032\uffe6\001\002\000\004\035" +
    "\052\001\002\000\004\024\053\001\002\000\006\027\057" +
    "\036\uffdf\001\002\000\004\036\055\001\002\000\004\027" +
    "\056\001\002\000\022\010\ufff2\013\ufff2\014\ufff2\017\ufff2" +
    "\020\ufff2\021\ufff2\022\ufff2\032\ufff2\001\002\000\004\024" +
    "\061\001\002\000\004\036\uffe1\001\002\000\006\027\057" +
    "\036\uffdf\001\002\000\004\036\uffe0\001\002\000\004\035" +
    "\064\001\002\000\004\031\065\001\002\000\010\023\075" +
    "\025\073\033\071\001\002\000\004\036\067\001\002\000" +
    "\004\027\070\001\002\000\026\010\ufff6\011\ufff6\012\ufff6" +
    "\013\ufff6\014\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6\032" +
    "\ufff6\001\002\000\004\034\126\001\002\000\004\032\117" +
    "\001\002\000\022\026\uffd1\027\uffd1\032\uffd1\036\uffd1\037" +
    "\uffd1\040\uffd1\041\uffd1\042\uffd1\001\002\000\010\026\114" +
    "\032\uffd9\036\uffd9\001\002\000\022\026\uffd2\027\uffd2\032" +
    "\uffd2\036\uffd2\037\uffd2\040\uffd2\041\uffd2\042\uffd2\001\002" +
    "\000\020\026\uffd3\032\uffd3\036\uffd3\037\077\040\101\041" +
    "\102\042\100\001\002\000\010\023\075\025\073\033\071" +
    "\001\002\000\010\023\075\025\073\033\071\001\002\000" +
    "\010\023\075\025\073\033\071\001\002\000\010\023\075" +
    "\025\073\033\071\001\002\000\010\026\uffd8\032\uffd8\036" +
    "\uffd8\001\002\000\020\026\uffd3\032\uffd3\036\uffd3\037\077" +
    "\040\101\041\102\042\100\001\002\000\010\026\uffd5\032" +
    "\uffd5\036\uffd5\001\002\000\020\026\uffd3\032\uffd3\036\uffd3" +
    "\037\077\040\101\041\102\042\100\001\002\000\010\026" +
    "\uffd6\032\uffd6\036\uffd6\001\002\000\020\026\uffd3\032\uffd3" +
    "\036\uffd3\037\077\040\101\041\102\042\100\001\002\000" +
    "\010\026\uffd4\032\uffd4\036\uffd4\001\002\000\020\026\uffd3" +
    "\032\uffd3\036\uffd3\037\077\040\101\041\102\042\100\001" +
    "\002\000\010\026\uffd7\032\uffd7\036\uffd7\001\002\000\010" +
    "\026\114\032\uffd9\036\uffd9\001\002\000\006\032\uffdb\036" +
    "\uffdb\001\002\000\006\032\uffda\036\uffda\001\002\000\006" +
    "\027\121\036\uffdc\001\002\000\004\036\uffde\001\002\000" +
    "\004\031\122\001\002\000\010\023\075\025\073\033\071" +
    "\001\002\000\004\032\124\001\002\000\006\027\121\036" +
    "\uffdc\001\002\000\004\036\uffdd\001\002\000\022\026\uffd0" +
    "\027\uffd0\032\uffd0\036\uffd0\037\uffd0\040\uffd0\041\uffd0\042" +
    "\uffd0\001\002\000\004\032\uffe7\001\002\000\006\015\131" +
    "\016\132\001\002\000\004\027\ufff4\001\002\000\004\027" +
    "\ufff3\001\002\000\004\027\134\001\002\000\022\010\ufff5" +
    "\013\ufff5\014\ufff5\017\ufff5\020\ufff5\021\ufff5\022\ufff5\032" +
    "\ufff5\001\002\000\004\032\uffe3\001\002\000\004\032\uffe5" +
    "\001\002\000\004\035\140\001\002\000\010\023\075\025" +
    "\073\033\071\001\002\000\004\036\142\001\002\000\004" +
    "\027\143\001\002\000\022\010\ufff1\013\ufff1\014\ufff1\017" +
    "\ufff1\020\ufff1\021\ufff1\022\ufff1\032\ufff1\001\002\000\010" +
    "\023\075\025\073\033\071\001\002\000\004\027\146\001" +
    "\002\000\022\010\ufff0\013\ufff0\014\ufff0\017\ufff0\020\ufff0" +
    "\021\ufff0\022\ufff0\032\ufff0\001\002\000\010\002\ufffa\004" +
    "\ufffa\007\ufffa\001\002\000\004\024\151\001\002\000\004" +
    "\027\152\001\002\000\026\010\ufff9\011\ufff9\012\ufff9\013" +
    "\ufff9\014\ufff9\017\ufff9\020\ufff9\021\ufff9\022\ufff9\032\ufff9" +
    "\001\002\000\004\032\uffe8\001\002\000\004\002\ufffd\001" +
    "\002\000\014\010\025\011\157\012\156\013\035\032\uffea" +
    "\001\002\000\004\030\177\001\002\000\004\030\172\001" +
    "\002\000\014\010\025\011\157\012\156\013\035\032\uffea" +
    "\001\002\000\014\010\025\011\157\012\156\013\035\032" +
    "\uffea\001\002\000\014\010\025\011\157\012\156\013\035" +
    "\032\uffea\001\002\000\014\010\025\011\157\012\156\013" +
    "\035\032\uffea\001\002\000\004\032\165\001\002\000\010" +
    "\002\ufffb\004\ufffb\007\ufffb\001\002\000\004\032\uffee\001" +
    "\002\000\004\032\uffeb\001\002\000\004\032\uffed\001\002" +
    "\000\004\032\uffec\001\002\000\004\035\173\001\002\000" +
    "\004\024\053\001\002\000\004\036\175\001\002\000\004" +
    "\027\176\001\002\000\014\010\ufff8\011\ufff8\012\ufff8\013" +
    "\ufff8\032\ufff8\001\002\000\004\035\200\001\002\000\010" +
    "\023\075\025\073\033\071\001\002\000\004\036\202\001" +
    "\002\000\004\027\203\001\002\000\014\010\ufff7\011\ufff7" +
    "\012\ufff7\013\ufff7\032\ufff7\001\002\000\004\002\ufffe\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\202\000\006\002\004\033\006\001\001\000\010\003" +
    "\017\004\015\005\020\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\033\013\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\002\203\033\006\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\002\153" +
    "\033\006\001\001\000\002\001\001\000\022\006\041\011" +
    "\037\012\023\014\033\015\036\016\030\017\031\021\025" +
    "\001\001\000\022\006\041\011\037\012\023\014\033\015" +
    "\036\016\030\017\031\021\152\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\022\006\041\011\037\012\023\014\033\015\036\016\030" +
    "\017\031\021\135\001\001\000\022\006\041\011\037\012" +
    "\023\014\033\015\036\016\030\017\031\021\134\001\001" +
    "\000\002\001\001\000\022\006\041\011\037\012\023\014" +
    "\033\015\036\016\030\017\031\021\126\001\001\000\002" +
    "\001\001\000\002\001\001\000\022\006\041\011\037\012" +
    "\023\014\033\015\036\016\030\017\031\021\047\001\001" +
    "\000\022\006\041\011\037\012\023\014\033\015\036\016" +
    "\030\017\031\021\046\001\001\000\002\001\001\000\022" +
    "\006\041\011\037\012\023\014\033\015\036\016\030\017" +
    "\031\021\042\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\022\053\001\001" +
    "\000\004\023\057\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\023\061\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\024\065\001\001\000\010\026\071\030\073" +
    "\032\075\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\027\114\001\001\000\002\001\001\000" +
    "\004\031\102\001\001\000\004\032\111\001\001\000\004" +
    "\032\107\001\001\000\004\032\105\001\001\000\004\032" +
    "\103\001\001\000\002\001\001\000\004\031\104\001\001" +
    "\000\002\001\001\000\004\031\106\001\001\000\002\001" +
    "\001\000\004\031\110\001\001\000\002\001\001\000\004" +
    "\031\112\001\001\000\002\001\001\000\004\027\115\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\025\117" +
    "\001\001\000\002\001\001\000\002\001\001\000\010\026" +
    "\122\030\073\032\075\001\001\000\002\001\001\000\004" +
    "\025\124\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\013\132\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\026\140\030\073\032\075\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\032\144\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\014\006\162\007\160\010" +
    "\157\011\161\020\163\001\001\000\002\001\001\000\002" +
    "\001\001\000\014\006\162\007\160\010\157\011\161\020" +
    "\170\001\001\000\014\006\162\007\160\010\157\011\161" +
    "\020\167\001\001\000\014\006\162\007\160\010\157\011" +
    "\161\020\166\001\001\000\014\006\162\007\160\010\157" +
    "\011\161\020\165\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\022\173\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\026\200\030\073\032\075\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserGraphics$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserGraphics$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserGraphics$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    int aaa;


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserGraphics$actions {
  private final ParserGraphics parser;

  /** Constructor */
  CUP$ParserGraphics$actions(ParserGraphics parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserGraphics$do_action_part00000000(
    int                        CUP$ParserGraphics$act_num,
    java_cup.runtime.lr_parser CUP$ParserGraphics$parser,
    java.util.Stack            CUP$ParserGraphics$stack,
    int                        CUP$ParserGraphics$top)
    throws Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserGraphics$result;

      /* select the action based on the action number */
      switch (CUP$ParserGraphics$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)).value;
		RESULT = start_val;
              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserGraphics$parser.done_parsing();
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s ::= DEF g 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // s ::= e 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // g ::= b s 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("g",1, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // g ::= p s 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("g",1, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // g ::= 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("g",1, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // b ::= BARRAS LLAVE_INI ab LLAVE_FIN 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("b",2, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-3)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // p ::= PIE LLAVE_INI ap LLAVE_FIN 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("p",3, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-3)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // t ::= TITULO DOS_PUNTOS LITERAL PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("t",4, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-3)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // x ::= EJEX DOS_PUNTOS CORCHETE_INI i CORCHETE_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("x",5, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-5)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // y ::= EJEY DOS_PUNTOS CORCHETE_INI k CORCHETE_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("y",6, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-5)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // u ::= UNIR DOS_PUNTOS CORCHETE_INI q CORCHETE_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("u",7, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-5)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // ti ::= TIPO DOS_PUNTOS cp PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ti",8, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-3)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // cp ::= CANTIDAD 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("cp",9, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // cp ::= PORCENTAJE 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("cp",9, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // et ::= ETIQUETAS DOS_PUNTOS CORCHETE_INI i CORCHETE_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("et",10, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-5)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // v ::= VALORES DOS_PUNTOS CORCHETE_INI k CORCHETE_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("v",11, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-5)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // tt ::= TOTAL DOS_PUNTOS n PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("tt",12, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-3)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ex ::= EXTRA DOS_PUNTOS LITERAL PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ex",13, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-3)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ab ::= t ab 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ab",14, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ab ::= x ab 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ab",14, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ab ::= y ab 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ab",14, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ab ::= u ab 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ab",14, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // ab ::= 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ab",14, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // ap ::= t ap 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ap",15, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // ap ::= ti ap 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ap",15, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // ap ::= et ap 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ap",15, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // ap ::= v ap 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ap",15, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // ap ::= tt ap 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ap",15, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ap ::= u ap 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ap",15, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // ap ::= ex ap 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ap",15, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // ap ::= 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ap",15, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // i ::= LITERAL ip 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("i",16, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // ip ::= PUNTO_COMA LITERAL ip 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ip",17, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-2)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // ip ::= 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("ip",17, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // q ::= LLAVE_INI k LLAVE_FIN qp 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("q",18, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-3)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // qp ::= PUNTO_COMA LLAVE_INI k LLAVE_FIN qp 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("qp",19, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-4)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // qp ::= 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("qp",19, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // k ::= o kp 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("k",20, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // kp ::= COMA kp 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("kp",21, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // kp ::= 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("kp",21, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // o ::= n op 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("o",22, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // op ::= MAS n op 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("op",23, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-2)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // op ::= MENOS n op 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("op",23, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-2)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // op ::= POR n op 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("op",23, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-2)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // op ::= ENTRE n op 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("op",23, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-2)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // op ::= 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("op",23, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // n ::= ENTERO 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("n",24, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // n ::= DECIMAL 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("n",24, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // n ::= PARENTESIS_INI PARENTESIS_FIN 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("n",24, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-1)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // e ::= EJECUTAR PARENTESIS_INI LITERAL PARENTESIS_FIN PUNTO_COMA e 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("e",25, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.elementAt(CUP$ParserGraphics$top-5)), ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // e ::= 
            {
              Object RESULT =null;

              CUP$ParserGraphics$result = parser.getSymbolFactory().newSymbol("e",25, ((java_cup.runtime.Symbol)CUP$ParserGraphics$stack.peek()), RESULT);
            }
          return CUP$ParserGraphics$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserGraphics$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserGraphics$do_action(
    int                        CUP$ParserGraphics$act_num,
    java_cup.runtime.lr_parser CUP$ParserGraphics$parser,
    java.util.Stack            CUP$ParserGraphics$stack,
    int                        CUP$ParserGraphics$top)
    throws Exception
    {
              return CUP$ParserGraphics$do_action_part00000000(
                               CUP$ParserGraphics$act_num,
                               CUP$ParserGraphics$parser,
                               CUP$ParserGraphics$stack,
                               CUP$ParserGraphics$top);
    }
}

}
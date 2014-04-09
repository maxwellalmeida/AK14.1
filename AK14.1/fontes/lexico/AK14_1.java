/* Generated By:JavaCC: Do not edit this line. AK14_1.java */
package lexico;

import java.io.*;


public class AK14_1 implements AK14_1Constants {
final static String versao = "AK14.1 Compiler - versao 1.0 - 2014";
boolean flagSaida = false; // saída resumida = falso


// Define o método "main" da classe AK14_1.  
  public  static void main(String args[]) throws ParseException
  {
    String nomeDoAnalisado = ""; // nome do arquivo a ser analisado
    AK14_1 lexer;     // analisador léxico
    int i;
    boolean parametroCmd = false;

    System.out.println(versao);

    // lę os parâmetros passados para o compilador
    for (i = 0; i < args.length - 1; i++)
    {
    if ( args[i].toLowerCase().equals("-short") )
      parametroCmd = true;
    else
        {
           System.out.println("Utilizacao: java AK14.1 [-short] arquivoEntrada");
           System.exit(0);
        }
    }

    if (args[i].equals("-"))
    {       // lę da entrada padr�?o      
        System.out.println("Lendo da entrada padr\u00c4\ufffdo . . .");
        lexer = new AK14_1(System.in);
     }
     else
    {       // lę do arquivo
        nomeDoAnalisado = args[args.length-1];
        System.out.println("Lendo do arquivo " + nomeDoAnalisado + " . . .");
        try {
            lexer = new AK14_1(new java.io.FileInputStream(nomeDoAnalisado));
        }
    catch (java.io.FileNotFoundException e) {
               System.out.println("Arquivo " + nomeDoAnalisado + " nao encontrado!!");
        return;
        }
    }
    lexer.flagSaida = parametroCmd;
    lexer.program();   // chama o método que faz a análise
    if ( lexer.token_source.contadorErrosLexicos() != 0 ) // verifica se houve erro léxico
        System.out.println(lexer.token_source.contadorErrosLexicos() + " Erros LEXICOS encontrados!");
    else
        System.out.println("Codigo analisado com sucesso!");
}  // main

static public String imagem(int x)
{
int k;
String s;
   s = tokenImage[x];
   k = s.lastIndexOf("\u005c"");
   try {s = s.substring(1,k);}
   catch (StringIndexOutOfBoundsException e)
   {}
   return s;
}

  void program() throws ParseException {
    trace_call("program");
    try {
Token t;
    do
    {
    t = getNextToken();
    Token proximoToken = t;
        while ( proximoToken.specialToken != null)
        proximoToken = proximoToken.specialToken;
        do {
           if ( flagSaida )
          System.out.println(proximoToken.image + "  " +
                                 imagem(proximoToken.kind) + " " +
                                 proximoToken.kind);
           else
              System.out.println("Linha: " + proximoToken.beginLine +
                                 " Coluna: " + proximoToken.beginColumn +
                                 " " + proximoToken.image +
                                 "  " + imagem(proximoToken.kind) + "  "+t.kind);
          proximoToken = proximoToken.next;
        } while (proximoToken != t.next);
    } while (t.kind != AK14_1Constants.EOF);
    } finally {
      trace_return("program");
    }
  }

  /** Generated Token Manager. */
  public AK14_1TokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[0];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {};
   }

  /** Constructor with InputStream. */
  public AK14_1(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public AK14_1(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new AK14_1TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public AK14_1(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new AK14_1TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public AK14_1(AK14_1TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(AK14_1TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 0; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[85];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 0; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 85; i++) {
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

  private int trace_indent = 0;
  private boolean trace_enabled = true;

/** Enable tracing. */
  final public void enable_tracing() {
    trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
    trace_enabled = false;
  }

  private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

}

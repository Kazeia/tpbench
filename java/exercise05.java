import java.math.*;
class exercise05 {
  public static void main(String[] args) {
    BigInteger i = BigInteger.ONE;
    for(int z=2; z<599999 ; ++z) {
      i = i.multiply(BigInteger.valueOf(z));
    }
    System.out.println( i );
    System.out.println(i.toString().length())	;
  }
}

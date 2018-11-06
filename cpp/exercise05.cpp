#include <iostream>
#include <gmpxx.h>
using namespace std;
int main() {
  mpz_class r;
  r = 1;
  for(int z=2;z<599999;++z) {
    r *= mpz_class(z);
  }
  cout << r << endl;
}
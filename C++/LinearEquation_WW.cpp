#include <iostream>
using namespace std;
int main()
{
	int a(0),b(0);
	double wynik(0);

    cout<<"Podaj wspolczynnik a: \n";
    cin>>a;
    cout<<"Podaj wspolczynnik b: \n";
    cin>>b;

    (a==0)?
    ((b==0)? (cout<<"Rownanie jest tozsamosciowe")
    :
    cout<<"Rownanie jest sprzeczne")
    :
    (wynik=-b/a,cout<<"x wynosi: "<<wynik);

	return 0;
}

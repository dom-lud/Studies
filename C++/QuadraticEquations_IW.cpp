#include <bits/stdc++.h>
using namespace std;
int main()
{
	int a(0),b(0),c(0),delta(0);
	double deltaq(0),x1(0),x2(0);

	cout<<"Podaj wspolczynnik a: \n";
	cin>>a;
	cout<<"Podaj wspolczynnik b: \n";
	cin>>b;
	cout<<"Podaj wspolczynnik c: \n";
	cin>>c;

	delta=(b*b)-4*a*c;
	if(delta>0)
    {
        deltaq=sqrt(delta);
        x1=(-b-deltaq)/2*a;
        x2=(-b+deltaq)/2*a;
        cout<<"Pierwistek z delty: "<<deltaq<<endl;
        cout<<"X1: "<<x1<<endl;
        cout<<"X2: "<<x2<<endl;
    }
    if(delta==0)
    {
        deltaq=sqrt(deltaq);
        x1=(-b-delta)/2*a;
        cout<<"Pierwistek z delty: "<<deltaq<<endl;
        cout<<"X1: "<<x1<<endl;
    }
    if(delta<0)
    {
        cout<<"Brak miejsc zerowych";
    }
	return 0;
}

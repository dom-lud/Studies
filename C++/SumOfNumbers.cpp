#include <bits/stdc++.h>
using namespace std;
int suma(long long int a)
{
	long long int pom,suma=0;

	while(a!=0)
	{
	pom=a%10;
	suma+=pom;
	a/=10;
	}
	return suma;
}
void wypisanie()
{
    long long int a;

    cout<<"Podaj liczbe: ";
    cin>>a;

    if(a>0 and a<=9223372036854775806) cout<<"Suma cyfr liczby "<<a<<" wynosi "<<suma(a)<<endl;
	else if (a<=0) cout<<"Liczba musi byc wieksza od zera"<<endl;
	else if(a>9223372036854775806) cout<<"Za duza liczba"<<endl;
}
int main()
{
    wypisanie();

	return 0;
}

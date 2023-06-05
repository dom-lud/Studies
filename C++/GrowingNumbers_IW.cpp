#include <bits/stdc++.h>
using namespace std;
int main()
{
	int a(0),b(0),c(0),d(0),e(0);
	
	cout<<"Podaj pierwsza liczbe: \n";
	cin>>a;
	
	cout<<"Podaj druga liczbe: \n";
	cin>>b;
	if(b<=a)
	{
	cout<<"Nieprawidlowa liczba";
	return 0;	
	}
	
	cout<<"Podaj trzecia liczbe: \n";
	cin>>c;
	if(c<=b)
	{
	cout<<"Nieprawidlowa liczba";
	return 0;	
	}
	
	cout<<"Podaj czwarta liczbe: \n";
	cin>>d;
	if(d<=c)
	{
	cout<<"Nieprawidlowa liczba";
	return 0;	
	}
	
	cout<<"Podaj piata liczbe: \n";
	cin>>e;
	if(e<=d)
	{
	cout<<"Nieprawidlowa liczba";
	return 0;	
	}
	
	return 0;
}
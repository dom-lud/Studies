#include <bits/stdc++.h>
using namespace std;
int x=0;
bool szescian(int a)
{
    if(a==0)return false;
    else if(a>0)
    {
	for(int i=0;i<a;i++)
	{
		if((i*i*i)==a)
		{
			x=i;
			return true;
		}
	}
	return false;
    }
    else if (a<0)
    {
    for(int i=0;i>a;i--)
	{
		if((i*i*i)==a)
		{
			x=i;
			return true;
		}
	}
	return false;
    }
    return false;
}

int main()
{
	int a;
	cin>>a;

	if(a==0) cout<<"Nieprawidlowa liczba"<<endl;
	else if(szescian(a)==true) cout<<"Liczba "<<x<<" jest szescianem liczby "<<a<<endl;
	else if(szescian(a)==false)cout<<"Liczba nie jest szescianem zadnej liczby "<<endl;
	return 0;
}

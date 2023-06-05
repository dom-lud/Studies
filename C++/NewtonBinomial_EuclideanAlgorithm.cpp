#include <iostream>
#include <chrono>
#include <bits/stdc++.h>
using namespace std;
using std::cout;
using std::endl;
using namespace std::chrono;

//Największy wspólny dzielnik

unsigned long long NWD_IT(unsigned long long a, unsigned long long b)
{
    while(a!=b)
       if(a>b)
           a-=b;
       else
           b-=a;
    return a;
}

unsigned long long NWD_REK(unsigned long long a, unsigned long long b)
{
   if(a!=b)
     return NWD_REK(a>b?a-b:a,b>a?b-a:b);
   return a;
}

//Dumian Newtona

unsigned long long NewtonREK(unsigned int n, unsigned int k) {
  if (k == n || k == 0)
    return 1;
  return NewtonREK(n-1, k-1) + NewtonREK(n-1, k);
}


unsigned long long  NewtonIT( unsigned int n, unsigned int k)
{
double Wynik = 1;
if (k == n || k == 0)
return 1;
for( unsigned int i = 1; i <= k; i++)
{
Wynik = Wynik * ( n - i + 1 ) / i;
}

return (unsigned long long) Wynik;
}

int main()
{
	//liczby do wczytania
    unsigned long long a,b;

    //NWD

//    unsigned long long nwdrek = 0;
//    unsigned long long nwdit = 0;
//
//    cout<<"Podaj dwie liczby: "<<endl;
//    cin>>a>>b;
//
//    auto begin = std::chrono::high_resolution_clock::now();
//    nwdrek=NWD_REK(a,b);
//    auto end = std::chrono::high_resolution_clock::now();
//    auto elapsed = std::chrono::duration_cast<std::chrono::nanoseconds>(end - begin);
//    cout << "NWD Rekurencyjnie = " << nwdrek << " & time: " << elapsed.count();
//
//    begin = std::chrono::high_resolution_clock::now();
//    nwdit = NWD_IT(a,b);
//    end = std::chrono::high_resolution_clock::now();
//    elapsed = std::chrono::duration_cast<std::chrono::nanoseconds>(end - begin);
//    cout << " || NWD Iteracyjnie = " << nwdit << " & time: " << elapsed.count() << endl;

    //Newton

    unsigned long long newit = 0;
    unsigned long long newrek = 0;

    //wczytywanie
    cout<<"Podaj n: "<<endl;
    cin>>a;
    cout<<"Podaj k: "<<endl;
    cin>>b;

    //sprawdzenie poprawności liczb !Dla Dwumianu Newtona maksymalna liczba to 150!
    if(a>b)
    {
    	while(a<=b)
    	{
    		cout<<"n musi byc wieksze od k"<<endl;
    		cout<<"Podaj k: "<<endl;
    		cin>>b;
		}
	}


    auto begin = std::chrono::high_resolution_clock::now();
    newrek=NewtonREK(a,b);
    auto end = std::chrono::high_resolution_clock::now();
    auto elapsed = std::chrono::duration_cast<std::chrono::nanoseconds>(end - begin);
    cout << "Newton Rekurentucjnie = " << newrek << " & time: " << elapsed.count();

    begin = std::chrono::high_resolution_clock::now();
    newit = NewtonIT(a,b);
    end = std::chrono::high_resolution_clock::now();
    elapsed = std::chrono::duration_cast<std::chrono::nanoseconds>(end - begin);
    cout << " || Newton Iteracyjnie = " << newit << " & time: " << elapsed.count() << endl;


    return 0;
    }

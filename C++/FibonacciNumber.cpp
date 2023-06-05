#include <bits/stdc++.h>
using namespace std;
int main()
{
    long long int a0(0),a1(0),cnt(0);
    int n(0);

    cout<<"Podaj ktora liczbe ciagu Fibonacciego chcesz obliczyc: ";
    cin>>n;

    if(n==1 or n==2)
    {
        cout<<1<<endl;
        return 0;
    }

    for(int i=2;i<n;i++)
    {
        a0=0;
        a1=1;
        cnt=0;
        for(int x=1; x<=i;x++)
        {
            cnt=a1+a0;
            a0=a1;
            a1=cnt;
        }
    }
    cout<<n<<" liczba ciagu Fibonacciego wynosi: "<<a1<<endl;
    return 0;
}

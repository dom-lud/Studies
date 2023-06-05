#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a=0,b=0;
    int cnt=0;
    cout<<"Podaj zakres liczb: ";
    cin>>a>>b;

    for(int i=a; i<=b;i++)
    {
        for(int x=1;x<=sqrt(i);x++)
        {
            if(i%x==0)cnt++;
        }
        if(cnt<2)
        {
            cout << i << " ";
            cnt = 0;
        }
        else
            cnt=0;
    }
    return 0;
}

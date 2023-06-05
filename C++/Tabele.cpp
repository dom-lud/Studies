#include <iostream>
#include <cmath>
using namespace std;

struct Point {
  double x;
  double y;

  Point(double x, double y) : x(x), y(y) {}

  string toString() const {
    return "(" + to_string(x) + ", " + to_string(y) + ")";
  }
};

double distance(Point p1, Point p2)
{
    double dx = p1.x - p2.x;
    double dy = p1.y - p2.y;
    return sqrt(dx * dx + dy * dy);
}

bool isTriangle(Point p1, Point p2, Point p3) {
  	if((p1.x == p2.x && p1.y == p2.y) || (p2.x == p3.x && p2.y == p3.y) || (p3.x == p1.x && p3.y == p1.y))
  	{
  	    return false;
    }
  	else
  	{
         return true;
	}
	}

void findFarthestPoints(Point &p1, Point p2, Point p3) {
    double maxDistance = 0;
    double dist12 = distance(p1, p2);
    double dist13 = distance(p1, p3);
    double dist23 = distance(p2, p3);
    if (dist12 > dist13 && dist12 > dist23) {
        maxDistance = dist12;
        p1 = p1;
        p2 = p2;
    }
    else if (dist13 > dist12 && dist13 > dist23) {
        maxDistance = dist13;
        p1 = p1;
        p2 = p3;
    }
    else {
        maxDistance = dist23;
        p1 = p2;
        p2 = p3;
    }
    cout << "Punkt 1: (" << p1.x << ", " << p1.y << ")" << endl;
    cout << "Punkt 2: (" << p2.x << ", " << p2.y << ")" << endl;
    cout << "Odleglosc: " << maxDistance << endl;
}

int main() {
    string a="-1";
    Point p1(0,0);
    Point p2(0,0);
    Point p3(0,0);

while(a!="0")
    {
    cout<<"Wybierz opcje ktora cie interesuje: "<<endl;
    cout<<"1 - Obliczanie odleglosci dwoch punktow"<<endl;
    cout<<"2 - Sprawdza czy z podanych trzech punktow mozna utworzyc trojkat"<<endl;
    cout<<"3 - Znajduje najbardziej oddalone od siebie punkty"<<endl;
    cout<<"0 - Zakoncz"<<endl;

    cin>>a;

    if(a=="1")
    {
        cout << "Wprowadz wspolrzedne punktu pierwszego: ";
        cin >> p1.x >> p1.y;
        cout << "Wprowadz wspolrzedne punktu drugiego: ";
        cin >> p2.x >> p2.y;

        double d = distance(p1, p2);
        cout << "Odleglosc miedzy punktami wynosi: " << d << endl;
    }
    else if(a=="2")
    {
        cout << "Wprowadz wspolrzedne punktu pierwszego: ";
        cin >> p1.x >> p1.y;
        cout << "Wprowadz wspolrzedne punktu drugiego: ";
        cin >> p2.x >> p2.y;
        cout << "Wprowadz wspolrzedne punktu trzeciego: ";
        cin >> p3.x >> p3.y;

        double eps = 1e-10; // dokładność obliczeń
        if (isTriangle(p1, p2, p3))
            cout << "Punkty tworza trojkat" << endl;
        else
            cout << "Punkty nie tworza trojkata" << endl;
    }
    else if(a=="3")
    {
        // Wprowadzenie punktów
        cout << "Podaj wspolrzedne punktu nr 1: ";
        cin >> p1.x >> p1.y;
        cout << "Podaj wspolrzedne punktu nr 2: ";
        cin >> p2.x >> p2.y;
        cout << "Podaj wspolrzedne punktu nr 3: ";
        cin >> p3.x >> p3.y;

        findFarthestPoints(p1, p2, p3);
    }
}
  return 0;
}

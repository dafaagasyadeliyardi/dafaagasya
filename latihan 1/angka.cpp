#include <iostream>
using namespace std;

int main() {
    int a, b;
    cout << "Masukan angka pertama: ";
    cin >> a;
    cout << "Masukan angka kedua: ";
    cin >> b;

    if (a>b)
    cout << a << "lebih besar dari" << b << endl;
    else if (a<b)
    cout << a << "Lebih kecil dari" << b << endl;
    else 
    cout << "Keduanya sama besar" << endl;

    cout << "Apakah keduanya sama?" << (a == b);
}
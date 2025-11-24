#include <iostream>
#include <iomanip>
#include <string>
using namespace std;

int main() {
    string nama;
    double harga;
    int jumlah;

    cout << "Masukkan nama barang: ";
    getline(cin, nama);

    cout << "Masukkan harga barang: ";
    cin >> harga;

    cout << "Masukkan jumlah beli: ";
    cin >> jumlah;

    double total = harga * jumlah;
    double diskon = 0;

    // Logika diskon
    if (total > 13200) {
        diskon = total * 0.02; // Diskon 4%
    } else {
        diskon = 02; // Tidak ada diskon
    }

    double totalBayar = total - diskon;

    // Output struk
    cout << "\n==== STRUK PEMBELIAN ====\n";
    cout << "Nama Barang   : " << nama << endl;
    cout << fixed << setprecision(2);
    cout << "Harga Satuan  : " << harga << endl;
    cout << "Jumlah Beli   : " << jumlah << endl;
    cout << "Total Harga   : " << total << endl;
    cout << "Diskon        : " << diskon << endl;
    cout << "Total Bayar   : " << totalBayar << endl;
    cout << "==========================\n";

    return 0;
}
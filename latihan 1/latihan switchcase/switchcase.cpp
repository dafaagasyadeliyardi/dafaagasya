#include <iostream>
#include <string>
#include <cstdlib> 

using namespace std;

string formatRupiah(long long n) {
    string s = to_string(n);
    int n_len = s.length();
    string res = "";
    int counter = 0;

    for (int i = n_len - 1; i >= 0; i--) {
        res = s[i] + res;
        counter++;
        if (counter % 3 == 0 && i != 0) {
            res = "." + res;
        }
    }
    return res;
}

int main() {
    string nama, valid, nimStr;
    int pilihan;
    long long saldo = 0;
    long long nominal;


    cout << "Masukkan nama: ";
    getline(cin, nama);

    cout << "Apakah nama sudah benar? (TRUE/FALSE): ";
    getline(cin, valid);

    if (valid != "TRUE" && valid != "true" && valid != "TRUE") {
        cout << "Nama tidak valid. Silakan ulangi." << endl;
        exit(0); 
    }

   
    cout << "Masukkan NIM: ";
    getline(cin, nimStr);

 
    saldo = 2510147; 

    cout << "\nSelamat datang, " << nama << endl;
    cout << "Saldo Anda saat ini: Rp " << formatRupiah(saldo) << "\n" << endl;

    cout << "======== MENU ATM ========" << endl;
    cout << "1. Cek Saldo" << endl;
    cout << "2. Tarik Tunai" << endl;
    cout << "3. Setor Tunai" << endl;
    cout << "4. Transfer" << endl;
    cout << "5. Keluar" << endl;
    cout << "Pilih menu (1-5): ";
    
    cin >> pilihan;

    switch (pilihan) {
        case 1:
            cout << "\nSaldo Anda saat ini adalah: Rp " << formatRupiah(saldo) << endl;
            break;
        case 2:
            cout << "Masukkan nominal Tarik Tunai: Rp ";
            cin >> nominal;
            if (nominal > saldo) {
                cout << "Saldo tidak mencukupi." << endl;
            } else {
                saldo -= nominal;
                cout << "Penarikan berhasil. Saldo sisa: Rp " << formatRupiah(saldo) << endl;
            }
            break;
        case 3:
            cout << "Masukkan nominal Setor Tunai: Rp ";
            cin >> nominal;
            saldo += nominal;
            cout << "Penyetoran berhasil. Saldo saat ini: Rp " << formatRupiah(saldo) << endl;
            break;
        case 4:
            cout << "Masukkan nominal Transfer: Rp ";
            cin >> nominal;
            if (nominal > saldo) {
                cout << "Saldo tidak mencukupi untuk transfer." << endl;
            } else {
                saldo -= nominal;
                cout << "Transfer Rp " << formatRupiah(nominal) << " berhasil. Saldo sisa: Rp " << formatRupiah(saldo) << endl;
            }
            break;
        case 5:
            cout << "Terima kasih, silakan ambil kartu Anda." << endl;
            break;
        default:
            cout << "Pilihan tidak valid." << endl;
    }

    return 0;
}
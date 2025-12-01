<?php
function formatRupiah($n) {
    return number_format($n, 0, '', '.');
}

function main() {
    $saldo = 0;
    
    echo "Masukkan nama: ";
    $nama = trim(fgets(STDIN)); 

    echo "Apakah nama sudah benar? (TRUE/FALSE): ";
    $valid = strtoupper(trim(fgets(STDIN))); 

    if ($valid !== "TRUE") {
        echo "Nama tidak valid. Silakan ulangi.\n";
        exit; 
    }

    echo "Masukkan NIM: ";
    $nimStr = trim(fgets(STDIN));

    $saldo = 2510147; 

    echo "\nSelamat datang, " . $nama . "\n";
    echo "Saldo Anda saat ini: Rp " . formatRupiah($saldo) . "\n\n";

    echo "======== MENU ATM ========\n";
    echo "1. Cek Saldo\n";
    echo "2. Tarik Tunai\n";
    echo "3. Setor Tunai\n";
    echo "4. Transfer\n";
    echo "5. Keluar\n";
    echo "Pilih menu (1-5): ";
    
    $pilihan = (int)trim(fgets(STDIN)); 

    switch ($pilihan) {
        case 1:
            echo "\nSaldo Anda saat ini adalah: Rp " . formatRupiah($saldo) . "\n";
            break;
        case 2:
            echo "Masukkan nominal Tarik Tunai: Rp ";
            $nominal = (int)trim(fgets(STDIN));
            if ($nominal > $saldo) {
                echo "Saldo tidak mencukupi.\n";
            } else {
                $saldo -= $nominal;
                echo "Penarikan berhasil. Saldo sisa: Rp " . formatRupiah($saldo) . "\n";
            }
            break;
        case 3:
            echo "Masukkan nominal Setor Tunai: Rp ";
            $nominal = (int)trim(fgets(STDIN));
            $saldo += $nominal;
            echo "Penyetoran berhasil. Saldo saat ini: Rp " . formatRupiah($saldo) . "\n";
            break;
        case 4:
            echo "Masukkan nominal Transfer: Rp ";
            $nominal = (int)trim(fgets(STDIN));
            if ($nominal > $saldo) {
                echo "Saldo tidak mencukupi untuk transfer.\n";
            } else {
                $saldo -= $nominal;
                echo "Transfer Rp " . formatRupiah($nominal) . " berhasil. Saldo sisa: Rp " . formatRupiah($saldo) . "\n";
            }
            break;
        case 5:
            echo "Terima kasih, silakan ambil kartu Anda.\n";
            break;
        default:
            echo "Pilihan tidak valid.\n";
    }
}

main();
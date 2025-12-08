<?php

$nim = readline("Masukkan NIM: ");

// ubah string menjadi array digit
$digit = str_split($nim);

// ubah ke integer
foreach ($digit as $i => $d) {
    $digit[$i] = intval($d);
}

// Total
$total = 0;
foreach ($digit as $d) {
    $total += $d;
}

// Max
$mak = $digit[0];
foreach ($digit as $d) {
    if ($d > $mak) {
        $mak = $d;
    }
}

// Min
$minim = $digit[0];
foreach ($digit as $d) {
    if ($d < $minim) {
        $minim = $d;
    }
}

// Rata-rata
$rata = $total / count($digit);

// Reverse array
$rev = array_reverse($digit);

// Output
echo "Digit        : [" . implode(", ", $digit) . "]\n";
echo "Total        = $total\n";
echo "Maksimum     = $mak\n";
echo "Minimum      = $minim\n";
echo "Rata-rata    = $rata\n";
echo "Reverse array: [" . implode(", ", $rev) . "]\n";

?>
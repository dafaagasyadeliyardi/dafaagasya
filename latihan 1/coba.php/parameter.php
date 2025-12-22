<?php 
// membuat fungsi 
function perkenalan($nama, $salam){ 
  echo $salam.", ";   echo "Perkenalkan, nama saya ".$nama."<br/>";   echo "Senang berkenalan dengan anda<br/>"; 
} 
 
// memanggil fungsi yang sudah dibuat 
perkenalan("Muhardian", "Hi"); 
 
  echo "<hr>"; 
 
  $saya = "Indry"; 
 
 
 
 $ucapanSalam = "Selamat pagi"; 
 
  // memanggilnya lagi   perkenalan($saya, $ucapanSalam); 
?> 
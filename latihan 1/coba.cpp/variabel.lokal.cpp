#include <iostream> 
using namespace std; 
 
// membuat variabel global 
int nilai = 9; 
 
int main(){     // membuat variabel lokal 
    int nilai = 7; 
 
    // mencetak variabel 
    printf("Nilai: %d\n", nilai); 
 
    return 0; 
} 
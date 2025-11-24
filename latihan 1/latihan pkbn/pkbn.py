nama = input("Masukan nama barang: ")
harga = float(input("Masukan harga barang: "))
jumlah = int(input("Masukan jumlah barang: "))

total = harga * jumlah

if total > 13200:
    diskon = total * 0.02
else:
    diskon = 0.2

total_bayar = total - diskon 

print("\n===== STRUK PEMBELIAN =====")
print(f"Nama barang   : {nama}")
print(f"Harga satuan  : {harga}")
print(f"Jumlah beli   : {jumlah}")
print(f"Total harga   : {total}")
print(f"Diskon        : {diskon}")
print(f"Total bayar   : {total_bayar}")
print("=============================")
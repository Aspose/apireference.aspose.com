---
title: "Kelas System::Collections::BitArray"
linktitle: "BitArray"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::BitArray. Array bit yang dapat diakses melalui indeks. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const bool\&) override | Menambahkan nilai ke akhir kontainer. |
| [And](./and/)(const BitArrayPtr\&) | Menghitung operasi bitwise 'and' antara dua BitSet. |
| [BitArray](./bitarray/)(const bitset\&) | Konstruktor penyalinan. |
| [BitArray](./bitarray/)(const BitArray\&) | Konstruktor penyalinan. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | Konstruktor penyalinan. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | Konstruktor penyalinan. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | Konstruktor penyalinan. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | Konstruktor penyalinan. |
| [BitArray](./bitarray/)(int, bool) | Konstruktor pengisian. |
| [Clear](./clear/)() override | Menghapus semua elemen. |
| [Contains](./contains/)(const bool\&) const override | Memeriksa apakah nilai tertentu ada di dalam kontainer. Tidak diimplementasikan. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | Menyalin data ke elemen array yang ada. |
| [data](./data/)() | Akses struktur data dasar. |
| [data](./data/)() const | Akses struktur data dasar. |
| [Get](./get/)(int) const | Mendapatkan elemen [BitArray](./). |
| [get_Count](./get_count/)() const override | Mendapatkan ukuran kontainer. |
| [get_Length](./get_length/)() const | Mendapatkan ukuran kontainer. |
| [GetEnumerator](./getenumerator/)() override | Membuat objek enumerator. |
| [idx_get](./idx_get/)(int) const | Fungsi getter. |
| [idx_set](./idx_set/)(int, bool) | Fungsi setter. |
| [Not](./not/)() | Membalikkan BitSet. |
| [operator!=](./operator!=/)(const BitArray\&) const | Operator perbandingan bitwise. |
| [operator==](./operator==/)(const BitArray\&) const | Operator perbandingan bitwise. |
| [operator[]](./operator[]/)(int) | Fungsi accessor. |
| [Or](./or/)(const BitArrayPtr\&) | Menghitung bitwise 'or' antara dua BitSet. |
| [Remove](./remove/)(const bool\&) override | Mengembalikan kemunculan pertama nilai yang ditentukan. Tidak diimplementasikan. |
| [Set](./set/)(int, bool) | Mengatur elemen [BitArray](./). |
| [SetAll](./setall/)(bool) | Mengatur semua elemen ke nilai tertentu. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Implementasi formal dari mekanisme argumen templat lemah; tidak berlaku untuk kelas ini. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
| [Xor](./xor/)(const BitArrayPtr\&) | Menghitung bitwise 'xor' antara dua BitSet. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [bitset](./bitset/) | Informasi RTTI. |
## Catatan



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // Membuat instance baru dari kelas BitArray.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // Cetak nilai.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## Lihat Juga

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

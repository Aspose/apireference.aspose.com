---
title: "Kelas System::Random"
linktitle: "Random"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Random. Mewakili generator bilangan pseudo-acak. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 5200
url: /id/cpp/system/random/
---
## Random class


Mewakili generator bilangan pseudo-acak. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Random : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [IsNull](./isnull/)() const | Selalu mengembalikan false. |
| virtual [Next](./next/)() | Mengembalikan bilangan acak non-negatif yang kurang dari nilai maksimum int32. |
| virtual [Next](./next/)(int32_t) | Mengembalikan bilangan acak non-negatif yang kurang dari maksimum yang ditentukan. |
| virtual [Next](./next/)(int32_t, int32_t) | Mengembalikan bilangan acak dalam rentang yang ditentukan. |
| virtual [NextBytes](./nextbytes/)(const ArrayPtr\<uint8_t\>\&) | Mengisi elemen-elemen array byte yang ditentukan dengan bilangan acak. |
| virtual [NextDouble](./nextdouble/)() | Mengembalikan bilangan acak antara 0,0 dan 1,0. |
| [Random](./random/)() | Menginisialisasi instance baru, menggunakan nilai seed default yang bergantung pada waktu. |
| [Random](./random/)(int32_t) | Menginisialisasi instance baru dari kelas [System.Random](./), menggunakan nilai seed yang ditentukan. |
## Catatan



```cpp
#include "system/random.h"
#include "system/smart_ptr.h"
#include <iostream>

int main()
{
  const auto rnd = System::MakeObject<System::Random>();

  // Dapatkan nomor bulan acak dan cetak.
  auto monthNumber = rnd->Next(1, 13);
  std::cout << "Month: " << monthNumber << std::endl;

  // Isi array dengan bilangan acak.
  auto arr = System::MakeObject<System::Array<uint8_t>>(12);
  rnd->NextBytes(arr);

  // Cetak array.
  for (auto i = 0; i < arr->get_Length(); ++i)
  {
    std::cout << static_cast<int>(arr[i]) << ' ';
  }
  std::cout << std::endl;

  return 0;
}
/*
This code example produces the following output:
Month: 4
177 213 89 240 68 182 18 96 109 131 1 78
*/
```

## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

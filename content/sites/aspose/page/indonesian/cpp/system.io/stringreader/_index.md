---
title: "Kelas System::IO::StringReader"
linktitle: "StringReader"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::StringReader. Mewakili pembaca yang membaca karakter dari sebuah string. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2400
url: /id/cpp/system.io/stringreader/
---
## StringReader class


Mewakili pembaca yang membaca karakter dari sebuah string. Objek-objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskan ke fungsi sebagai argumen.

```cpp
class StringReader : public System::IO::TextReader
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Menutup aliran. |
| [Dispose](./dispose/)() override | Tidak melakukan apa-apa. |
| [Dispose](./dispose/)(bool) override | Tidak melakukan apa-apa. |
| [Peek](./peek/)() override | Membaca satu karakter dari aliran tanpa mengubah posisi aliran. |
| [Read](./read/)() override | Membaca satu karakter dari aliran. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Membaca sejumlah karakter yang ditentukan dari aliran ke array karakter yang ditentukan mulai dari posisi yang ditentukan. |
| [ReadLine](./readline/)() override | Membaca karakter dari aliran hingga akhir baris saat ini. |
| [ReadToEnd](./readtoend/)() override | Membaca karakter dari aliran hingga akhir aliran. |
| [StringReader](./stringreader/)(const String\&) | Membuat instance baru dari kelas [StringReader](./) yang membaca karakter dari string yang ditentukan. |
## Lihat Juga

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

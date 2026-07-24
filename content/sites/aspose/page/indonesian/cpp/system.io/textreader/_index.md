---
title: "System::IO::TextReader class"
linktitle: "TextReader"
second_title: "Aspose.Page untuk C++"
description: "System::IO::TextReader class. Kelas dasar untuk kelas-kelas yang mewakili pembaca yang membaca urutan karakter dari berbagai sumber. Objek dari kelas ini hanya boleh dialokasikan menggunakan System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam System::SmartPtr pointer dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.io/textreader/
---
## TextReader class


Kelas dasar untuk kelas-kelas yang mewakili pembaca yang membaca urutan karakter dari berbagai sumber. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class TextReader : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Close](./close/)() | Menutup aliran dan melepaskan sumber daya yang diperoleh. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini dan menutup aliran yang mendasarinya. |
| virtual [Peek](./peek/)() | Membaca satu karakter dari aliran tanpa mengubah kursor baca aliran. |
| virtual [Read](./read/)() | Membaca satu karakter dari aliran. |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | Membaca sejumlah karakter yang ditentukan dari aliran dan menuliskannya ke array karakter yang ditentukan mulai dari posisi yang ditentukan. |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | Membaca jumlah maksimum karakter yang ditentukan dari pembaca teks saat ini dan menuliskan data ke buffer, mulai dari indeks yang ditentukan. |
| virtual [ReadLine](./readline/)() | Membaca karakter dari aliran hingga akhir baris saat ini. |
| virtual [ReadToEnd](./readtoend/)() | Membaca karakter dari aliran hingga akhir aliran. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

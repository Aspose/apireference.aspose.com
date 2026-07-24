---
title: "Kelas System::IO::StreamReader"
linktitle: "StreamReader"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::StreamReader. Mewakili pembaca yang membaca karakter dari aliran byte. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.io/streamreader/
---
## StreamReader class


Mewakili pembaca yang membaca karakter dari aliran byte. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class StreamReader : public System::IO::TextReader
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Menutup aliran saat ini dan aliran dasar. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini dan menutup aliran yang mendasarinya. |
| [get_BaseStream](./get_basestream/)() const | Mengembalikan pointer bersama ke objek yang mewakili aliran dasar. |
| [get_CurrentEncoding](./get_currentencoding/)() | Mengembalikan enkoding yang sedang digunakan. |
| [get_EndOfStream](./get_endofstream/)() | Mengembalikan nilai yang menunjukkan apakah akhir aliran telah tercapai. |
| [Peek](./peek/)() override | Membaca satu karakter dari aliran tanpa mengubah kursor baca aliran. |
| [Read](./read/)() override | Membaca satu karakter dari aliran. |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | Membaca sejumlah karakter yang ditentukan dari aliran, mengonversinya ke enkoding UTF-16, dan menulis karakter UTF-16 yang dihasilkan ke array karakter yang ditentukan mulai dari posisi yang ditentukan. |
| [ReadLine](./readline/)() override | Membaca karakter dari aliran hingga akhir baris saat ini. |
| [ReadToEnd](./readtoend/)() override | Membaca karakter dari aliran hingga akhir aliran. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari aliran dasar yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari aliran dasar yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 1024 byte. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 1024 byte. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan. |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran yang ditentukan. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan. |
| [StreamReader](./streamreader/)(const System::String\&) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari file yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 4096 byte. |
| [StreamReader](./streamreader/)(const System::String\&, bool) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari file yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 4096 byte. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari file yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 4096 byte. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 4096 byte. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan. |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | Membuat sebuah instance objek [StreamReader](./) yang membaca karakter dari file yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran yang ditentukan. Sebuah parameter menentukan apakah deteksi byte order mark harus diaktifkan. |
| [~StreamReader](./~streamreader/)() | Destruktor. |
## Lihat Juga

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::IO::StreamWriter kelas"
linktitle: "StreamWriter"
second_title: "Aspose.Page untuk C++"
description: "System::IO::StreamWriter kelas. Mewakili penulis yang menulis karakter ke aliran byte. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2300
url: /id/cpp/system.io/streamwriter/
---
## StreamWriter class


Mewakili penulis yang menulis karakter ke aliran byte. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class StreamWriter : public System::IO::TextWriter
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Close](./close/)() override | Menutup aliran dan melepaskan sumber daya yang diperoleh. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini dan menutup aliran yang mendasarinya. |
| [Flush](./flush/)() override | Mengosongkan isi buffer ke aliran dasar dan kemudian mengosongkan aliran dasar. |
| [get_AutoFlush](./get_autoflush/)() const | Mengembalikan nilai yang menunjukkan apakah [StreamWriter](./) akan mengosongkan data ke aliran dasar setiap kali metode [StreamWriter::Write](./write/) dipanggil. |
| [get_BaseStream](./get_basestream/)() const | Mengembalikan pointer bersama ke objek yang mewakili aliran dasar. |
| [get_Encoding](./get_encoding/)() override | Mengembalikan enkoding yang sedang digunakan. |
| [set_AutoFlush](./set_autoflush/)(bool) | Mengembalikan nilai yang menentukan apakah [StreamWriter](./) harus mengosongkan data ke aliran dasar setiap kali metode [StreamWriter::Write](./write/) dipanggil. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | Membuat instance objek [StreamWriter](./) yang menulis karakter ke aliran dasar yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | Membuat instance objek [StreamWriter](./) yang menulis karakter ke aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 1024 byte. |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | Membuat instance objek [StreamWriter](./) yang menulis karakter ke aliran dasar yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran yang ditentukan. Sebuah parameter menentukan apakah aliran dasar harus ditutup ketika objek [StreamWriter](./) dibuang. |
| [StreamWriter](./streamwriter/)(const String\&) | Membuat instance objek [StreamWriter](./) yang menulis karakter ke file yang ditentukan menggunakan enkoding UTF-8 dan buffer dengan ukuran default 1024 byte. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | Membuat instance objek [StreamWriter](./) yang menulis karakter ke file yang ditentukan menggunakan enkoding yang ditentukan dan buffer dengan ukuran default 1024 byte. Sebuah parameter menentukan apakah data harus ditambahkan ke file atau file harus ditimpa. |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | Membuat instance objek [StreamWriter](./) yang menulis karakter ke file yang ditentukan menggunakan enkoding yang ditentukan dan ukuran buffer. Sebuah parameter menentukan apakah data harus ditambahkan ke file atau file harus ditimpa. |
| [Write](./write/)(char_t) override | Menulis karakter yang ditentukan ke aliran. |
| [Write](./write/)(const String\&) override | Menulis string yang ditentukan ke aliran. |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | Menulis representasi string dari objek yang ditentukan ke aliran. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | Menulis semua karakter dari array yang ditentukan ke aliran. |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Menulis subrentang karakter UTF-16 yang ditentukan dari array karakter yang ditentukan ke aliran. |
| [Write](./write/)(const char_t *) override | Menulis c-string yang ditentukan ke aliran. |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | Menulis representasi string dari objek yang ditentukan ke aliran. |
| [WriteLine](./writeline/)() override | Menulis karakter penanda akhir baris ke aliran. |
| [WriteLine](./writeline/)(const String\&) override | Menulis string yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | Menulis representasi string dari objek yang ditentukan diikuti oleh karakter penanda akhir baris ke aliran. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | Menulis semua karakter dari array yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | Menulis subrentang UTF-16 karakter yang ditentukan dari array karakter yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| [WriteLine](./writeline/)(const char_t *) override | Menulis c-string yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | Menulis representasi string dari objek yang ditentukan diikuti oleh karakter penanda akhir baris ke aliran. |
| [~StreamWriter](./~streamwriter/)() | Destruktor. |
## Lihat Juga

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

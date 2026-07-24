---
title: "Kelas System::IO::TextWriter"
linktitle: "TextWriter"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::IO::TextWriter. Kelas dasar untuk kelas yang mewakili penulis yang menulis urutan karakter ke tujuan yang berbeda. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2700
url: /id/cpp/system.io/textwriter/
---
## TextWriter class


Kelas dasar untuk kelas yang mewakili penulis yang menulis urutan karakter ke tujuan yang berbeda. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class TextWriter : public System::IDisposable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Close](./close/)() | Menutup aliran dan melepaskan sumber daya yang diperoleh. |
| [Dispose](./dispose/)() override | Melepaskan semua sumber daya yang digunakan oleh objek saat ini dan menutup aliran yang mendasarinya. |
| virtual [Flush](./flush/)() | Menyiram konten buffer ke aliran yang mendasarinya. |
| virtual [get_Encoding](./get_encoding/)() | Mengembalikan enkoding yang sedang digunakan. |
| virtual [get_FormatProvider](./get_formatprovider/)() const | Mengembalikan objek [IFormatProvider](../../system/iformatprovider/) yang sedang digunakan. |
| [get_FormatProvider](./get_formatprovider/)() | Mengembalikan objek [IFormatProvider](../../system/iformatprovider/) yang sedang digunakan. |
| virtual [get_NewLine](./get_newline/)() const | Mengembalikan string penanda akhir baris. |
| [get_NewLine](./get_newline/)() | Mengembalikan string penanda akhir baris. |
| virtual [set_NewLine](./set_newline/)(const System::String\&) | Mengatur string penanda akhir baris. |
| virtual [Write](./write/)(const SharedPtr\<Object\>\&) | Menulis representasi string dari objek yang ditentukan ke aliran. |
| virtual [Write](./write/)(bool) | Menulis representasi string dari nilai boolean yang ditentukan ke aliran. |
| virtual [Write](./write/)(char_t) | Menulis karakter yang ditentukan ke aliran. |
| virtual [Write](./write/)(Decimal) | Menulis representasi string dari objek [Decimal](../../system/decimal/) yang ditentukan ke aliran. |
| virtual [Write](./write/)(double) | Menulis representasi string dari nilai titik mengambang double-precision yang ditentukan ke aliran. |
| virtual [Write](./write/)(int) | Menulis representasi string dari nilai integer 32-bit yang ditentukan ke aliran. |
| virtual [Write](./write/)(int64_t) | Menulis representasi string dari nilai integer 64-bit yang ditentukan ke aliran. |
| virtual [Write](./write/)(float) | Menulis representasi string dari nilai titik mengambang single-precision yang ditentukan ke aliran. |
| virtual [Write](./write/)(const String\&) | Menulis string yang ditentukan ke aliran. |
| virtual [Write](./write/)(uint32_t) | Menulis representasi string dari nilai integer tak bertanda 32-bit yang ditentukan ke aliran. |
| virtual [Write](./write/)(uint64_t) | Menulis representasi string dari nilai integer tak bertanda 64-bit yang ditentukan ke aliran. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&) | Menulis semua karakter dari array yang ditentukan ke aliran. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Menulis subrentang karakter UTF-16 yang ditentukan dari array karakter yang ditentukan ke aliran. |
| virtual [Write](./write/)(const char_t *) | Menulis c-string yang ditentukan ke aliran. |
| virtual [Write](./write/)(const TypeInfo\&) | Menulis representasi string dari objek [TypeInfo](../../system/typeinfo/) yang ditentukan ke aliran. |
| [Write](./write/)(const String\&, const TArgs\&...) | Menulis nilai yang ditentukan yang diformat sesuai format yang ditentukan ke aliran. |
| virtual [WriteLine](./writeline/)() | Menulis karakter penanda akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) | Menulis representasi string dari objek yang ditentukan diikuti oleh karakter penanda akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(bool) | Menulis representasi string dari nilai boolean yang ditentukan diikuti oleh karakter penanda akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(char_t) | Menulis karakter yang ditentukan diikuti oleh karakter penanda akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(Decimal) | Menulis representasi string dari objek [Decimal](../../system/decimal/) yang ditentukan diikuti oleh karakter penanda akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(double) | Menulis representasi string dari nilai titik mengambang double-precision yang ditentukan diikuti oleh karakter penanda akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(int) | Menulis representasi string dari nilai integer 32-bit yang ditentukan diikuti oleh karakter penanda akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(int64_t) | Menulis representasi string dari nilai integer 64-bit yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(float) | Menulis representasi string dari nilai titik mengambang presisi tunggal yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(const String\&) | Menulis string yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(uint32_t) | Menulis representasi string dari nilai integer tak bertanda 32-bit yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(uint64_t) | Menulis representasi string dari nilai integer tak bertanda 64-bit yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) | Menulis semua karakter dari array yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) | Menulis subrentang UTF-16 karakter yang ditentukan dari array karakter yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(const char_t *) | Menulis c-string yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [WriteLine](./writeline/)(const TypeInfo\&) | Menulis representasi string dari objek [TypeInfo](../../system/typeinfo/) yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| [WriteLine](./writeline/)(const String\&, const TArgs\&...) | Menulis nilai yang ditentukan diformat sesuai format yang ditentukan diikuti oleh karakter akhir baris ke aliran. |
| virtual [~TextWriter](./~textwriter/)() | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke kelas ini. |
## Lihat Juga

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)

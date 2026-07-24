---
title: "System::Text::UTF7Encoding kelas"
linktitle: "UTF7Encoding"
second_title: "Aspose.Page untuk C++"
description: "System::Text::UTF7Encoding kelas. Enkoding UTF-7. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2700
url: /id/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


Enkoding UTF-7. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Mengkloning objek encoding. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Membandingkan dengan objek. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode sebuah string. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const String\&) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| [GetDecoder](./getdecoder/)() override | Dapatkan decoder yang meneruskan permintaan ke objek ini. |
| [GetEncoder](./getencoder/)() override | Dapatkan encoder yang meneruskan permintaan ke objek ini. |
| [GetHashCode](./gethashcode/)() const override | Mendapatkan kode hash encoding. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Mendapatkan jumlah maksimum byte yang diperlukan untuk meng-encode sejumlah karakter tertentu. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Mendapatkan jumlah maksimum karakter yang diperlukan untuk mendekode sejumlah byte tertentu. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Mendekode buffer byte menjadi string. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Mendekode buffer byte menjadi string. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Mendekode buffer byte menjadi string. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Mendekode buffer byte menjadi string. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Mendekode buffer byte menjadi string. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Mendekode buffer byte menjadi string. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Mendekode buffer byte menjadi string. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Membandingkan parameter encoding. |
| [UTF7Encoding](./utf7encoding/)() | Konstruktor. |
| [UTF7Encoding](./utf7encoding/)(bool) | Konstruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Nilai kode halaman default. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | Nomor ajaib yang digunakan oleh [Windows](../../system.windows/) untuk ID kode halaman UTF-7. |
## Lihat Juga

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

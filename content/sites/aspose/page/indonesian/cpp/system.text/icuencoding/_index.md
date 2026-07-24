---
title: "System::Text::ICUEncoding class"
linktitle: "ICUEncoding"
second_title: "Aspose.Page untuk C++"
description: "System::Text::ICUEncoding class. Implementasi enkoding berbasis ICU. UNTUK PENGGUNAAN INTERNAL. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2200
url: /id/cpp/system.text/icuencoding/
---
## ICUEncoding class


Implementasi enkoding berbasis ICU. UNTUK PENGGUNAAN INTERNAL. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) function. Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const String\&) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| [GetDecoder](./getdecoder/)() override | Dapatkan decoder yang meneruskan permintaan ke objek ini. |
| [GetEncoder](./getencoder/)() override | Dapatkan encoder yang meneruskan permintaan ke objek ini. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Mendapatkan jumlah maksimum byte yang diperlukan untuk meng-encode sejumlah karakter tertentu. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Mendapatkan jumlah maksimum karakter yang diperlukan untuk mendekode sejumlah byte tertentu. |
| [GetPreamble](./getpreamble/)() override | Mengembalikan urutan byte yang menunjukkan enkoding (mis. BOM). |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | Konstruktor. |
| [operator==](./operator==/)(const ICUEncoding\&) const | Membandingkan enkoding menggunakan codepage. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Nilai kode halaman default. |
## Lihat Juga

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

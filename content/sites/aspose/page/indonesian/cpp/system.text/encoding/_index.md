---
title: "Kelas System::Text::Encoding"
linktitle: "Encoding"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Text::Encoding. Layanan enkoding dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Clone](./clone/)() | Mengkloning objek encoding. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | Mengonversi byte antara dua enkoding. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | Mengonversi byte antara dua enkoding. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Membandingkan enkoding. |
| static [get_ASCII](./get_ascii/)() | Mendapatkan enkoding ASCII. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Mendapatkan objek enkoding Unicode big-endian standar. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Mendapatkan objek enkoding UTF-32 big-endian standar. |
| virtual [get_BodyName](./get_bodyname/)() | Mendapatkan nama enkoding yang kompatibel dengan badan agen surat. |
| virtual [get_CodePage](./get_codepage/)() | Mendapatkan ID halaman kode [Windows](../../system.windows/). |
| [get_DecoderFallback](./get_decoderfallback/)() const | Mendapatkan fallback decoder. |
| static [get_Default](./get_default/)() | Mendapatkan enkoding default. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Mendapatkan fallback enkoder. |
| virtual [get_EncodingName](./get_encodingname/)() | Mendapatkan nama enkoding yang dapat dibaca manusia. |
| virtual [get_HeaderName](./get_headername/)() | Mendapatkan nama enkoding yang kompatibel dengan header agen surat. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Memeriksa apakah enkoding dapat digunakan di peramban untuk menampilkan konten. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Memeriksa apakah enkoding dapat digunakan di peramban untuk menyimpan konten. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Memeriksa apakah enkoding dapat digunakan di klien surat untuk menampilkan konten. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Memeriksa apakah enkoding dapat digunakan di klien surat untuk menyimpan konten. |
| [get_IsReadOnly](./get_isreadonly/)() | Memeriksa apakah enkoding bersifat hanya-baca. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Memeriksa apakah enkoding berukuran satu byte. |
| static [get_Latin1](./get_latin1/)() | Mendapatkan enkoding Latin1. UNTUK PENGGUNAAN INTERNAL. |
| static [get_Unicode](./get_unicode/)() | Mendapatkan objek enkoding Unicode standar. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Mendapatkan objek enkoding UTF-7 standar. |
| static [get_UTF8](./get_utf8/)() | Mendapatkan objek enkoding UTF-8 standar. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Hanya internal, untuk digunakan oleh pustaka kelas: Tidak ditandai dan tidak memvalidasi masukan. |
| virtual [get_WebName](./get_webname/)() | Mendapatkan nama enkoding yang kompatibel dengan IANA. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | Mendapatkan ID halaman kode [Windows](../../system.windows/). |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode sebuah string. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Dapatkan jumlah karakter yang diperlukan untuk mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const String\&) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Dapatkan byte yang dihasilkan dari mengenkode buffer karakter. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Dapatkan jumlah karakter yang diperlukan untuk mendekode buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Dapatkan karakter yang dihasilkan dari mendekode buffer byte. |
| virtual [GetDecoder](./getdecoder/)() | Dapatkan decoder yang meneruskan permintaan ke objek ini. |
| virtual [GetEncoder](./getencoder/)() | Dapatkan encoder yang meneruskan permintaan ke objek ini. |
| static [GetEncoding](./getencoding/)(const String\&) | Mendapatkan enkoding berdasarkan nama. |
| static [GetEncoding](./getencoding/)(int) | Mendapatkan enkoding berdasarkan kode halaman. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Mendapatkan enkoding berdasarkan kode halaman. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Mendapatkan enkoding berdasarkan nama. |
| static [GetEncodings](./getencodings/)() | Mendapatkan daftar enkoding yang dikenal. |
| [GetHashCode](./gethashcode/)() const override | Membuat hash enkoding. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Mendapatkan jumlah maksimum byte yang diperlukan untuk meng-encode sejumlah karakter tertentu. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Mendapatkan jumlah maksimum karakter yang diperlukan untuk mendekode sejumlah byte tertentu. |
| virtual [GetPreamble](./getpreamble/)() | Mengembalikan urutan byte yang menunjukkan enkoding (mis. BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Mendekode buffer byte menjadi string. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Mendekode buffer byte menjadi string. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Mendekode buffer byte menjadi string. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Mendekode buffer byte menjadi string. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Mendekode buffer byte menjadi string. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Mendekode buffer byte menjadi string. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Mendekode buffer byte menjadi string. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Mengatur fallback dekoder. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Mengatur fallback enkoder. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Nilai kode halaman default. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

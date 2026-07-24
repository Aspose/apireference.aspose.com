---
title: "System::Text::Decoder kelas"
linktitle: "Decoder"
second_title: "Aspose.Page untuk C++"
description: "System::Text::Decoder kelas. Mengkapsulkan urutan byte decoding menjadi urutan karakter. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.text/decoder/
---
## Decoder class


Mengkapsulkan urutan byte decoding menjadi urutan karakter. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class Decoder : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Mengonversi byte menjadi karakter. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Mengonversi byte menjadi karakter. |
| [get_Fallback](./get_fallback/)() const | Mendapatkan fallback penanganan kesalahan. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Mendapatkan buffer fallback. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Mendapatkan jumlah karakter yang diperlukan untuk mendekode sebuah buffer. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Mendapatkan jumlah karakter yang diperlukan untuk mendekode sebuah buffer. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Mendapatkan jumlah karakter yang diperlukan untuk mendekode sebuah buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer. |
| virtual [Reset](./reset/)() | Membersihkan keadaan internal decoder. |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | Mengatur fallback penanganan kesalahan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

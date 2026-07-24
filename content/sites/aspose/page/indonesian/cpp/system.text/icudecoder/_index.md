---
title: "kelas System::Text::ICUDecoder"
linktitle: "ICUDecoder"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Text::ICUDecoder. Decoder yang menggunakan ICU untuk decoding. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2000
url: /id/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | Mengonversi byte menjadi karakter. |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | Mengonversi byte menjadi karakter. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Mendapatkan jumlah karakter yang diperlukan untuk mendekode sebuah buffer. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | Mendapatkan jumlah karakter yang diperlukan untuk mendekode sebuah buffer. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | Mendapatkan jumlah karakter yang diperlukan untuk mendekode sebuah buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | Dapatkan karakter yang dihasilkan dari mendekode sebuah buffer. |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | Konstruktor. |
| virtual [Reset](./reset/)() | Mengatur variabel internal ke keadaan awal. |
| virtual [~ICUDecoder](./~icudecoder/)() | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Base](./base/) | [Base](./base/) tipe. |
## Lihat Juga

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

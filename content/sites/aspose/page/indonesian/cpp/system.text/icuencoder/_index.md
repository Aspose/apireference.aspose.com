---
title: "System::Text::ICUEncoder kelas"
linktitle: "ICUEncoder"
second_title: "Aspose.Page untuk C++"
description: "System::Text::ICUEncoder kelas. Encoder yang menggunakan ICU untuk enkoding. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2100
url: /id/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Mengonversi karakter menjadi byte. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Mengonversi karakter menjadi byte. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Mendapatkan jumlah byte yang diperlukan untuk mengenkode sebuah buffer. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Mendapatkan jumlah byte yang diperlukan untuk mengenkode sebuah buffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Dapatkan byte yang dihasilkan dari mengenkode sebuah buffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Dapatkan byte yang dihasilkan dari mengenkode sebuah buffer. |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | Konstruktor. |
| virtual [Reset](./reset/)() | Mengatur variabel internal ke keadaan awal. |
| [~ICUEncoder](./~icuencoder/)() | Destruktor. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Base](./base/) | [Base](./base/) tipe. |
## Lihat Juga

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

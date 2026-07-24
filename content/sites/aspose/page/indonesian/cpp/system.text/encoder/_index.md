---
title: "kelas System::Text::Encoder"
linktitle: "Encoder"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Text::Encoder. Mengenkapsulasi urutan karakter menjadi urutan byte. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 900
url: /id/cpp/system.text/encoder/
---
## Encoder class


Mengenkapsulasi urutan karakter menjadi urutan byte. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class Encoder : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | Mengonversi karakter menjadi byte. |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | Mengonversi karakter menjadi byte. |
| [get_Fallback](./get_fallback/)() const | Mendapatkan fallback penanganan kesalahan. |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | Mendapatkan buffer fallback. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | Mendapatkan jumlah byte yang diperlukan untuk mengenkode sebuah buffer. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | Mendapatkan jumlah byte yang diperlukan untuk mengenkode sebuah buffer. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | Dapatkan byte yang dihasilkan dari mengenkode sebuah buffer. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | Dapatkan byte yang dihasilkan dari mengenkode sebuah buffer. |
| virtual [Reset](./reset/)() | Membersihkan keadaan internal encoder. |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | Mengatur fallback penanganan kesalahan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)

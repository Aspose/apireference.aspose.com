---
title: "Kelas System::Security::Cryptography::RandomNumberGenerator"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Security::Cryptography::RandomNumberGenerator. Kelas abstrak untuk generator angka acak yang dapat diturunkan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen di C++."
type: docs
weight: 2600
url: /id/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


Kelas abstrak untuk generator angka acak yang dapat diturunkan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Create](./create/)() | Membuat instance dari implementasi default generator angka acak kriptografis yang dapat digunakan untuk menghasilkan data acak. Tidak diimplementasikan. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | Mengisi elemen array yang ada dengan byte acak. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | Mengisi potongan array yang ada dengan byte acak. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | Mengisi elemen tampilan array yang ada dengan byte acak. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | Mengisi potongan tampilan array yang ada dengan byte acak. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Mengisi elemen array stack yang ada dengan byte acak. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | Mengisi potongan array stack yang ada dengan byte acak. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | Mengisi elemen array yang ada dengan byte acak non-nol. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | Mengisi elemen tampilan array yang ada dengan byte acak non-nol. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | Mengisi elemen array stack yang ada dengan byte acak non-nol. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

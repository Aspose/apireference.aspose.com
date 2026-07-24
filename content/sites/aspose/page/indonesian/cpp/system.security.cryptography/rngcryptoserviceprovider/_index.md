---
title: "System::Security::Cryptography::RNGCryptoServiceProvider kelas"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RNGCryptoServiceProvider kelas. Generator angka acak yang mengikuti konsep CSP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3300
url: /id/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


Generator angka acak yang mengikuti konsep CSP. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | Mengisi elemen array yang ada dengan byte acak. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | Mengisi elemen tampilan array yang ada dengan byte acak. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | Mengisi elemen array yang ada dengan byte acak non-nol. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | Mengisi elemen tampilan array yang ada dengan byte acak non-nol. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | Konstruktor. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | Destruktor. |
## Lihat Juga

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

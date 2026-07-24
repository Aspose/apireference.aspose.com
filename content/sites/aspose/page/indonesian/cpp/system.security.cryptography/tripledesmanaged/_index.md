---
title: "Kelas System::Security::Cryptography::TripleDESManaged"
linktitle: "TripleDESManaged"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Security::Cryptography::TripleDESManaged. Implementasi TripleDES terkelola. Hanya mendukung mode ECB dan CFB dengan padding None serta mode CBC dengan padding None, Zeros, dan PKCS7. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 5200
url: /id/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Implementasi [TripleDES](../tripledes/) terkelola. Hanya mendukung mode ECB dan CFB dengan padding None serta mode CBC dengan padding None, Zeros, dan PKCS7. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Membuat objek dekripsi dengan parameter eksplisit. |
| virtual [CreateDecryptor](./createdecryptor/)() | Membuat objek dekripsi dengan parameter yang ditentukan oleh objek algoritma. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | Membuat objek enkripsi dengan parameter eksplisit. |
| virtual [CreateEncryptor](./createencryptor/)() | Membuat objek enkripsi dengan parameter yang ditentukan oleh objek algoritma. |
| [GenerateIV](./generateiv/)() override | Membuat nilai awal acak dan menyimpannya dalam internal algoritma. |
| [GenerateKey](./generatekey/)() override | Membuat kunci acak dan menyimpannya dalam internal algoritma. |
## Lihat Juga

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

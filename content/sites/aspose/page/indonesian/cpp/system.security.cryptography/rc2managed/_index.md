---
title: "System::Security::Cryptography::RC2Managed kelas"
linktitle: "RC2Managed"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RC2Managed kelas. Algoritma RC2 terkelola. Hanya mode cipher ECB, CFB, dan CBC yang didukung. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan waktu jalan dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2800
url: /id/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


Algoritma [RC2](../rc2/) terkelola. Hanya mode cipher ECB, CFB, dan CBC yang didukung. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan waktu jalan dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
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

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

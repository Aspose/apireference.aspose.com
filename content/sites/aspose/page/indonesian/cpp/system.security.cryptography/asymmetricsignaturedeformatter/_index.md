---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter class"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter class. Kelas dasar untuk deformatter tanda tangan asimetris. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


Kelas dasar untuk deformatter tanda tangan asimetris. Objek kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | Informasi RTTI. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | Menetapkan kunci yang akan digunakan dengan algoritma. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | Memverifikasi tanda tangan pada data. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | Memverifikasi tanda tangan pada data. Tidak diimplementasikan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

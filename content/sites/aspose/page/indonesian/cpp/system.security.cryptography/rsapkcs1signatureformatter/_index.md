---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter kelas"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter kelas. Menandatangani data dengan tanda tangan RSA PKCS # 1 v1.5. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3800
url: /id/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


Menandatangani data dengan tanda tangan [RSA](../rsa/) PKCS # 1 v1.5. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | Menandatangani data. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | Informasi RTTI. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | Konstruktor. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | Mengatur algoritma hash yang akan digunakan. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | Mengatur nilai kunci. Tidak diimplementasikan. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | Destruktor. |
## Lihat Juga

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

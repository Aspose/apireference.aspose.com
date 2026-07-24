---
title: "System::Security::Cryptography::RSAEncryptionPadding class"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Page untuk C++"
description: "System::Security::Cryptography::RSAEncryptionPadding class. Mode padding dan parameter untuk operasi enkripsi atau dekripsi RSA dalam C++."
type: docs
weight: 3600
url: /id/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


Mode padding dan parameter untuk operasi enkripsi atau dekripsi [RSA](../rsa/).

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Membuat [RSAEncryptionPadding](./) dengan mode OAEP dan algoritma hash yang ditentukan. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Mendapatkan mode padding. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | Mendapatkan algoritma hash yang digunakan dengan OAEP. |
| static [get_OaepSHA1](./get_oaepsha1/)() | Mendapatkan mode OAEP dengan algoritma hash [SHA1](../sha1/). |
| static [get_OaepSHA256](./get_oaepsha256/)() | Mendapatkan mode OAEP dengan algoritma hash [SHA256](../sha256/). |
| static [get_OaepSHA384](./get_oaepsha384/)() | Mendapatkan mode OAEP dengan algoritma hash [SHA384](../sha384/). |
| static [get_OaepSHA512](./get_oaepsha512/)() | Mendapatkan mode OAEP dengan algoritma hash [SHA512](../sha512/). |
| static [get_Pkcs1](./get_pkcs1/)() | Informasi RTTI. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../system/object/gethashcode/). Memungkinkan hashing objek kustom. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../../system/object/tostring/). Memungkinkan mengonversi objek khusus menjadi string. |
## Lihat Juga

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Security::Cryptography::RSAEncryptionPadding klasse"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Page voor C++"
description: "System::Security::Cryptography::RSAEncryptionPadding klasse. Padding-modus en parameters voor RSA-encryptie of decryptieoperaties in C++."
type: docs
weight: 3600
url: /nl/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


Padding-modus en parameters voor [RSA](../rsa/) encryptie of decryptieoperaties.

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Maakt [RSAEncryptionPadding](./) met OAEP-modus en gespecificeerd hash-algoritme. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Haalt de padding-modus op. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | Haalt het hash-algoritme op dat wordt gebruikt met OAEP. |
| static [get_OaepSHA1](./get_oaepsha1/)() | Haalt OAEP-modus op met [SHA1](../sha1/) hash-algoritme. |
| static [get_OaepSHA256](./get_oaepsha256/)() | Haalt OAEP-modus op met de [SHA256](../sha256/) hash-algoritme. |
| static [get_OaepSHA384](./get_oaepsha384/)() | Haalt OAEP-modus op met de [SHA384](../sha384/) hash-algoritme. |
| static [get_OaepSHA512](./get_oaepsha512/)() | Haalt OAEP-modus op met de [SHA512](../sha512/) hash-algoritme. |
| static [get_Pkcs1](./get_pkcs1/)() | RTTI-informatie. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
## Zie ook

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

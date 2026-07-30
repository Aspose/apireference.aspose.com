---
title: "System::Security::Cryptography::RSAEncryptionPadding sınıfı"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Font için C++"
description: "System::Security::Cryptography::RSAEncryptionPadding sınıfı. C++'ta RSA şifreleme veya şifre çözme işlemleri için dolgu modu ve parametreleri."
type: docs
weight: 3600
url: /tr/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


Dolgu modu ve parametreleri [RSA](../rsa/) şifreleme veya şifre çözme işlemleri için.

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Belirtilen hash algoritmasıyla OAEP modunda [RSAEncryptionPadding](./) oluşturur. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Dolgu modunu alır. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | OAEP ile kullanılan hash algoritmasını alır. |
| static [get_OaepSHA1](./get_oaepsha1/)() | OAEP modunu [SHA1](../sha1/) hash algoritmasıyla alır. |
| static [get_OaepSHA256](./get_oaepsha256/)() | OAEP modunu [SHA256](../sha256/) hash algoritmasıyla alır. |
| static [get_OaepSHA384](./get_oaepsha384/)() | OAEP modunu [SHA384](../sha384/) hash algoritmasıyla alır. |
| static [get_OaepSHA512](./get_oaepsha512/)() | OAEP modunu [SHA512](../sha512/) hash algoritmasıyla alır. |
| static [get_Pkcs1](./get_pkcs1/)() | RTTI bilgisi. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hash'lenmesini sağlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)

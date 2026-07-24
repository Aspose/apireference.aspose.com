---
title: "System::Security::Cryptography::RSAEncryptionPadding class"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Page için C++"
description: "System::Security::Cryptography::RSAEncryptionPadding sınıfı. C++'de RSA şifreleme veya şifre çözme işlemleri için dolgu modu ve parametreleri."
type: docs
weight: 3600
url: /tr/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


[RSA](../rsa/) şifreleme veya şifre çözme işlemleri için dolgu modu ve parametreleri.

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | Belirtilen hash algoritması ve OAEP modu ile [RSAEncryptionPadding](./) oluşturur. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | Dolgu modunu alır. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | OAEP ile kullanılan hash algoritmasını alır. |
| static [get_OaepSHA1](./get_oaepsha1/)() | [SHA1](../sha1/) hash algoritmasıyla OAEP modunu alır. |
| static [get_OaepSHA256](./get_oaepsha256/)() | OAEP modunu [SHA256](../sha256/) hash algoritmasıyla alır. |
| static [get_OaepSHA384](./get_oaepsha384/)() | OAEP modunu [SHA384](../sha384/) hash algoritmasıyla alır. |
| static [get_OaepSHA512](./get_oaepsha512/)() | OAEP modunu [SHA512](../sha512/) hash algoritmasıyla alır. |
| static [get_Pkcs1](./get_pkcs1/)() | RTTI bilgisi. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) yönteminin benzeri. Özel nesnelerin hashlenmesini sağlar. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) yönteminin benzeri. Özel nesnelerin dizeye dönüştürülmesini sağlar. |
## Ayrıca Bakınız

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

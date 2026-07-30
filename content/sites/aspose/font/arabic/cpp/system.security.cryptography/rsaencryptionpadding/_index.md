---
title: "System::Security::Cryptography::RSAEncryptionPadding class"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::RSAEncryptionPadding class. وضع الحشو والمعلمات لعمليات تشفير أو فك تشفير RSA في C++."
type: docs
weight: 3600
url: /ar/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


وضع الحشو والمعلمات لعمليات تشفير أو فك تشفير [RSA](../rsa/).

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | ينشئ [RSAEncryptionPadding](./) بوضع OAEP وخوارزمية تجزئة محددة. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | يحصل على وضع الحشو. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | يحصل على خوارزمية التجزئة المستخدمة مع OAEP. |
| static [get_OaepSHA1](./get_oaepsha1/)() | يحصل على وضع OAEP مع خوارزمية التجزئة [SHA1](../sha1/). |
| static [get_OaepSHA256](./get_oaepsha256/)() | يحصل على وضع OAEP مع خوارزمية التجزئة [SHA256](../sha256/). |
| static [get_OaepSHA384](./get_oaepsha384/)() | يحصل على وضع OAEP مع خوارزمية التجزئة [SHA384](../sha384/). |
| static [get_OaepSHA512](./get_oaepsha512/)() | يحصل على وضع OAEP مع خوارزمية التجزئة [SHA512](../sha512/). |
| static [get_Pkcs1](./get_pkcs1/)() | معلومات RTTI. |
| [GetHashCode](./gethashcode/)() const override | نظير طريقة C# [Object.GetHashCode()](../../system/object/gethashcode/). يتيح تجزئة الكائنات المخصصة. |
| [ToString](./tostring/)() const override | تماثل طريقة C# [Object.ToString()](../../system/object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
## انظر أيضًا

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)

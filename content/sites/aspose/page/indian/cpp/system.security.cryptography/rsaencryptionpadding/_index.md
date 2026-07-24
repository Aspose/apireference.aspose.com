---
title: "System::Security::Cryptography::RSAEncryptionPadding class"
linktitle: "RSAEncryptionPadding"
second_title: "Aspose.Page C++ के लिए"
description: "System::Security::Cryptography::RSAEncryptionPadding class. C++ में RSA एन्क्रिप्शन या डिक्रिप्शन ऑपरेशनों के लिए पैडिंग मोड और पैरामीटर।"
type: docs
weight: 3600
url: /hi/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


[RSA](../rsa/) एन्क्रिप्शन या डिक्रिप्शन ऑपरेशनों के लिए पैडिंग मोड और पैरामीटर।

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## विधियाँ

| विधि | विवरण |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | OAEP मोड और निर्दिष्ट हैश एल्गोरिदम के साथ [RSAEncryptionPadding](./) बनाता है। |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | पैडिंग मोड प्राप्त करता है। |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | OAEP के साथ उपयोग किए गए हैश एल्गोरिदम को प्राप्त करता है। |
| static [get_OaepSHA1](./get_oaepsha1/)() | [SHA1](../sha1/) हैश एल्गोरिदम के साथ OAEP मोड प्राप्त करता है। |
| static [get_OaepSHA256](./get_oaepsha256/)() | OAEP मोड को [SHA256](../sha256/) हैश एल्गोरिदम के साथ प्राप्त करता है। |
| static [get_OaepSHA384](./get_oaepsha384/)() | OAEP मोड को [SHA384](../sha384/) हैश एल्गोरिदम के साथ प्राप्त करता है। |
| static [get_OaepSHA512](./get_oaepsha512/)() | OAEP मोड को [SHA512](../sha512/) हैश एल्गोरिदम के साथ प्राप्त करता है। |
| static [get_Pkcs1](./get_pkcs1/)() | RTTI जानकारी। |
| [GetHashCode](./gethashcode/)() const override | C# के [Object.GetHashCode()](../../system/object/gethashcode/) मेथड का समानांतर। कस्टम ऑब्जेक्ट्स की हैशिंग को सक्षम करता है। |
| [ToString](./tostring/)() const override | C# के [Object.ToString()](../../system/object/tostring/) विधि का समानांतर। कस्टम वस्तुओं को स्ट्रिंग में परिवर्तित करने में सक्षम बनाता है। |
## संबंधित देखें

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

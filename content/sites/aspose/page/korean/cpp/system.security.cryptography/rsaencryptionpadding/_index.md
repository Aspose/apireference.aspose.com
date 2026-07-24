---
title: "System::Security::Cryptography::RSAEncryptionPadding 클래스"
linktitle: "RSAEncryptionPadding"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSAEncryptionPadding 클래스. C++에서 RSA 암호화 또는 복호화 작업을 위한 패딩 모드 및 매개변수."
type: docs
weight: 3600
url: /ko/cpp/system.security.cryptography/rsaencryptionpadding/
---
## RSAEncryptionPadding class


[RSA](../rsa/) 암호화 또는 복호화 작업을 위한 패딩 모드 및 매개변수.

```cpp
class RSAEncryptionPadding : public System::IEquatable<SharedPtr<RSAEncryptionPadding>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [CreateOaep](./createoaep/)(const HashAlgorithmName\&) | OAEP 모드와 지정된 해시 알고리즘을 사용하여 [RSAEncryptionPadding](./)을 생성합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(SharedPtr\<RSAEncryptionPadding\>) override |  |
| [get_Mode](./get_mode/)() const | 패딩 모드를 가져옵니다. |
| [get_OaepHashAlgorithm](./get_oaephashalgorithm/)() const | OAEP와 함께 사용되는 해시 알고리즘을 가져옵니다. |
| static [get_OaepSHA1](./get_oaepsha1/)() | [SHA1](../sha1/) 해시 알고리즘을 사용한 OAEP 모드를 가져옵니다. |
| static [get_OaepSHA256](./get_oaepsha256/)() | OAEP 모드를 [SHA256](../sha256/) 해시 알고리즘으로 가져옵니다. |
| static [get_OaepSHA384](./get_oaepsha384/)() | OAEP 모드를 [SHA384](../sha384/) 해시 알고리즘으로 가져옵니다. |
| static [get_OaepSHA512](./get_oaepsha512/)() | OAEP 모드를 [SHA512](../sha512/) 해시 알고리즘으로 가져옵니다. |
| static [get_Pkcs1](./get_pkcs1/)() | RTTI 정보. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

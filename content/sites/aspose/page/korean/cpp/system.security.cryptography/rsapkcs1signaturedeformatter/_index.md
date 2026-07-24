---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter 클래스"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter 클래스. RSA PKCS #1 v1.5 서명을 검증하는 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 3700
url: /ko/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


[RSA](../rsa/) PKCS #1 v1.5 서명을 검증하는 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | RTTI 정보. |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | 생성자. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | 사용할 해시 알고리즘을 설정합니다. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | 키 값을 설정합니다. 구현되지 않음. |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | 데이터 해시의 서명을 검증합니다. |
## 또 보기

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

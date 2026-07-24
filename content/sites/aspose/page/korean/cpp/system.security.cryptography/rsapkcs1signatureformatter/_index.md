---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter 클래스"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter 클래스. RSA PKCS # 1 v1.5 서명을 사용하여 데이터를 서명합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 3800
url: /ko/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


[RSA](../rsa/) PKCS # 1 v1.5 서명을 사용하여 데이터를 서명합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | 데이터에 서명합니다. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | RTTI 정보. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | 생성자. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | 사용할 해시 알고리즘을 설정합니다. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | 키 값을 설정합니다. 구현되지 않음. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | 소멸자. |
## 또 보기

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

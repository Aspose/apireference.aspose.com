---
title: "System::Security::Cryptography::AsymmetricSignatureFormatter 클래스"
linktitle: "AsymmetricSignatureFormatter"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricSignatureFormatter 클래스. 비대칭 서명 포맷터의 기본 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 400
url: /ko/cpp/system.security.cryptography/asymmetricsignatureformatter/
---
## AsymmetricSignatureFormatter class


비대칭 서명 포맷터의 기본 클래스. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class AsymmetricSignatureFormatter : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) | RTTI 정보. |
| virtual [CreateSignature](./createsignature/)(System::SharedPtr\<HashAlgorithm\>) | 지정된 해시 값에 대한 서명을 생성합니다. |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | 사용할 해시 알고리즘을 설정합니다. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | 서명을 계산할 때 사용할 비대칭 알고리즘을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

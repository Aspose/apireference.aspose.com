---
title: "System::Security::Cryptography::ICspAsymmetricAlgorithm 클래스"
linktitle: "ICspAsymmetricAlgorithm"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::ICspAsymmetricAlgorithm 클래스. 비대칭 알고리즘 기본 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 2100
url: /ko/cpp/system.security.cryptography/icspasymmetricalgorithm/
---
## ICspAsymmetricAlgorithm class


비대칭 알고리즘 기본 클래스. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class ICspAsymmetricAlgorithm : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [ExportCspBlob](./exportcspblob/)(bool) | 키 정보를 포함한 블롭을 내보냅니다. |
| virtual [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() | RTTI 정보. |
| virtual [ImportCspBlob](./importcspblob/)(ByteArrayPtr) | 데이터 블롭에서 키 정보를 가져옵니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Security::Cryptography::AsymmetricAlgorithm 클래스"
linktitle: "AsymmetricAlgorithm"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::AsymmetricAlgorithm 클래스. 비대칭 암호화 알고리즘을 위한 추상 기본 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 200
url: /ko/cpp/system.security.cryptography/asymmetricalgorithm/
---
## AsymmetricAlgorithm class


비대칭 암호화 알고리즘을 위한 추상 기본 클래스. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class AsymmetricAlgorithm : public virtual System::Object,
                            public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Clear](./clear/)() | 모든 리소스를 해제합니다. |
| static [Create](./create/)() | 기본 알고리즘을 생성합니다. 구현되지 않음. |
| static [Create](./create/)(const String\&) | 이름으로 알고리즘을 생성합니다. 구현되지 않음. |
| [Dispose](./dispose/)() override | 현재 객체가 소유한 리소스를 해제합니다. |
| virtual [FromXmlString](./fromxmlstring/)(String) | XML 문자열에서 알고리즘 매개변수를 읽습니다. |
| virtual [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() | 사용할 키 교환 알고리즘을 가져옵니다. |
| virtual [get_KeySize](./get_keysize/)() | RTTI 정보. |
| virtual [get_LegalKeySizes](./get_legalkeysizes/)() | 허용된 키 크기 배열을 가져옵니다. |
| virtual [get_SignatureAlgorithm](./get_signaturealgorithm/)() | 사용할 서명 알고리즘을 가져옵니다. |
| virtual [set_KeySize](./set_keysize/)(int32_t) | 키 크기를 설정합니다. |
| virtual [ToXmlString](./toxmlstring/)(bool) | 알고리즘 매개변수를 XML 문자열에 씁니다. |
## 또 보기

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)

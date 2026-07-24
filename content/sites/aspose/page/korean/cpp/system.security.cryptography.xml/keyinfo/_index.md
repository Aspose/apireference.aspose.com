---
title: "System::Security::Cryptography::Xml::KeyInfo 클래스"
linktitle: "KeyInfo"
second_title: "C++용 Aspose.Page"
description: "System::Security::Cryptography::Xml::KeyInfo 클래스. XML 디지털 서명 또는 XML 암호화의 KeyInfo 요소를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 300
url: /ko/cpp/system.security.cryptography.xml/keyinfo/
---
## KeyInfo class


XML 디지털 서명 또는 XML 암호화의 [KeyInfo](./) 요소를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class KeyInfo : public System::Collections::Generic::IEnumerable<SharedPtr<Xml::KeyInfoClause>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddClause](./addclause/)(SharedPtr\<KeyInfoClause\>) |  |
| [get_Count](./get_count/)() |  |
| [GetEnumerator](./getenumerator/)() override | 열거자를 가져옵니다. |
| [KeyInfo](./keyinfo/)() |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
## 또 보기

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Security::Cryptography::Xml](../)
* Library [Aspose.Page for C++](../../)

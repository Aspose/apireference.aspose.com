---
title: "System::Globalization::SortKey 클래스"
linktitle: "SortKey"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::SortKey 클래스. 문자열을 정렬 키로 매핑합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2200
url: /ko/cpp/system.globalization/sortkey/
---
## SortKey class


문자열을 정렬 키로 매핑합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class SortKey : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [Compare](./compare/)(const SortKeyPtr\&, const SortKeyPtr\&) | 두 정렬 키를 비교합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 지정된 객체가 현재 [SortKey](./) 객체와 같은지 확인합니다. |
| virtual [get_KeyData](./get_keydata/)() | 현재 객체를 나타내는 바이트 배열을 가져옵니다. |
| virtual [get_OriginalString](./get_originalstring/)() | 이 객체를 생성하는 데 사용된 원본 문자열을 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | 현재 [SortKey](./) 객체의 해시 코드를 가져옵니다. |
| [operator=](./operator=/)(const SortKey\&) |  |
| [SortKey](./sortkey/)(const SortKey\&) |  |
| [ToString](./tostring/)() const override | 현재 객체를 문자열 표현으로 변환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)

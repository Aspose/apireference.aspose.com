---
title: "System::Globalization::SortVersion 클래스"
linktitle: "SortVersion"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::SortVersion 클래스. 문자열을 비교하고 정렬하는 데 사용되는 Unicode 버전에 대한 정보를 제공합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 2300
url: /ko/cpp/system.globalization/sortversion/
---
## SortVersion class


문자열을 비교하고 정렬하는 데 사용되는 Unicode 버전에 대한 정보를 제공합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class SortVersion : public System::IEquatable<SharedPtr<SortVersion>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(SharedPtr\<SortVersion\>) override | 현재 [SortVersion](./) 인스턴스가 지정된 [SortVersion](./) 객체와 같은지 확인합니다. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 현재 [SortVersion](./) 인스턴스가 지정된 [SortVersion](./) 객체와 같은지 확인합니다. |
| [get_FullVersion](./get_fullversion/)() | 전체 버전 번호를 가져옵니다. |
| [get_SortId](./get_sortid/)() | 이 객체에 대한 고유 식별자를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | 현재 객체에 대한 해시 코드를 가져옵니다. |
| [operator!=](./operator!=/)(const SortVersion\&) | 현재 [SortVersion](./) 인스턴스가 지정된 [SortVersion](./) 객체와 같지 않은지 확인합니다. |
| [operator=](./operator=/)(const SortVersion\&) |  |
| [operator==](./operator==/)(const SortVersion\&) | 현재 [SortVersion](./) 인스턴스가 지정된 [SortVersion](./) 객체와 같은지 확인합니다. |
| [SortVersion](./sortversion/)(int, const Guid\&) | RTTI 정보. |
| [SortVersion](./sortversion/)(const SortVersion\&) |  |
## 또 보기

* Class [IEquatable](../../system/iequatable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)

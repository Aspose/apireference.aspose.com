---
title: "System::Net::CookieComparer 클래스"
linktitle: "CookieComparer"
second_title: "C++용 Aspose.Page"
description: "System::Net::CookieComparer 클래스. Cookie 클래스 인스턴스를 비교하는 데 사용됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수에 인수로 전달하는 데 사용하십시오."
type: docs
weight: 300
url: /ko/cpp/system.net/cookiecomparer/
---
## CookieComparer class


[Cookie](../cookie/) 클래스 인스턴스를 비교하는 데 사용됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수에 인수로 전달하는 데 사용하십시오.

```cpp
class CookieComparer : public System::Collections::Generic::IComparer<System::SharedPtr<System::Net::Cookie>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Compare](./compare/)(args_type, args_type) const override | 지정된 객체를 비교합니다. |
| static [get_Instance](./get_instance/)() | RTTI 정보. |
## 또 보기

* Class [IComparer](../../system.collections.generic/icomparer/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)

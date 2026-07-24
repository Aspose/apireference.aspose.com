---
title: "System::Reflection::MethodBase 클래스"
linktitle: "MethodBase"
second_title: "C++용 Aspose.Page"
description: "System::Reflection::MethodBase 클래스. 메서드에 대한 기본 정보. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 800
url: /ko/cpp/system.reflection/methodbase/
---
## MethodBase class


메서드에 대한 기본 정보. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수에 인수로 전달하십시오.

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | 멤버 유형을 나타냅니다 - 메서드, 생성자, 이벤트 등. |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | 이 메서드는 현재 메서드 이름을 가져올 수 있게 합니다. 번역기는 ASPOSE_CURRENT_FUNCTION을 매개변수로 자동 대체합니다. |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | 새로운 [MethodBase](./) 클래스 인스턴스를 초기화합니다. |
## 또 보기

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)

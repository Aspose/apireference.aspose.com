---
title: "System::Attribute 클래스"
linktitle: "Attribute"
second_title: "C++용 Aspose.Page"
description: "System::Attribute 클래스. 사용자 정의 속성을 위한 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 400
url: /ko/cpp/system/attribute/
---
## Attribute class


사용자 정의 속성을 위한 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 해당 포인터를 사용하십시오.

```cpp
class Attribute : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [GetCustomAttribute](./getcustomattribute/)(const TypeInfo\&, const TypeInfo\&) | 지정된 유형에 적용된 지정된 유형의 사용자 정의 속성을 반환합니다. |
| static [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&) | 지정된 유형에 적용된 모든 사용자 정의 속성을 반환합니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

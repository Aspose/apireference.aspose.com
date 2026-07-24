---
title: "System::ComponentModel::Component 클래스"
linktitle: "Component"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::Component 클래스. 번역된 코드를 Component 클래스를 사용하여 컴파일 가능하도록 만드는 더미 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 이 포인터를 인수로 함수에 전달하십시오."
type: docs
weight: 400
url: /ko/cpp/system.componentmodel/component/
---
## Component class


번역된 코드를 [Component](./) 클래스를 사용하여 컴파일 가능하도록 만드는 더미 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 이 포인터를 인수로 함수에 전달하십시오.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Component](./component/)() | RTTI 정보. |
| [Dispose](./dispose/)(bool) | Disposable 패턴 지원; 아무 작업도 수행하지 않습니다. |
| [get_DesignMode](./get_designmode/)() | 구성 요소가 디자인 모드인지 확인합니다. |
## 또 보기

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)

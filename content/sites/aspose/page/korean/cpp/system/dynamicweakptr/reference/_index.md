---
title: "System::DynamicWeakPtr::Reference class"
linktitle: "Reference"
second_title: "C++용 Aspose.Page"
description: "System::DynamicWeakPtr::Reference 클래스. DynamicWeakPtr::Apply가 호출되도록 보장하는 레퍼런스 클래스입니다. C++에서 DynamicWeakPtr가 SmartPtr 레퍼런스 매개변수로 전달되어 함수가 해당 포인터에 할당할 수 있는 경우에 사용됩니다."
type: docs
weight: 700
url: /ko/cpp/system/dynamicweakptr/reference/
---
## Reference class


[Reference](./) class which ensures that DynamicWeakPtr::Apply is called. Used if [DynamicWeakPtr](../) is passed as [SmartPtr](../../smartptr/) reference parameter to function which may assign to it.

```cpp
class Reference
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [operator DynamicWeakPtr_ &](./operatordynamicweakptr_&/)() const | 변환 연산자. [Reference](./)를 [DynamicWeakPtr_](../dynamicweakptr_/)가 필요한 상황에서 사용할 수 있게 합니다. |
| [Reference](./reference/)(DynamicWeakPtr_\&) | 스마트 포인터 레퍼런스를 생성합니다. |
| [Reference](./reference/)(Reference\&&) | 스마트 포인터 레퍼런스를 이동 생성합니다. |
| [~Reference](./~reference/)() | 레퍼런스를 파괴합니다. 참조된 스마트 포인터에서 Apply() 호출을 보장합니다. |
## 또 보기

* Class [DynamicWeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

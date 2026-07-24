---
title: "System::Collections::IEnumeratorImplValueType 클래스"
linktitle: "IEnumeratorImplValueType"
second_title: "C++용 Aspose.Page"
description: "System::Collections::IEnumeratorImplValueType 클래스. 제네릭 Iterator IEnumeratorImplRefType 위에 비제네릭 IEnumerator 구현을 생성하는 래퍼 - C++에서 값 타입을 위한 래퍼입니다."
type: docs
weight: 800
url: /ko/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


제네릭 Iterator [IEnumeratorImplRefType](../ienumeratorimplreftype/) 위에 비제네릭 [IEnumerator](../ienumerator/) 구현을 생성하는 래퍼 - 값 타입을 위한 래퍼입니다.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Current](./get_current/)() const override | 현재 요소를 가져옵니다. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | 래퍼 생성자 |
| [MoveNext](./movenext/)() override | 열거자를 다음 요소로 이동합니다. 이전에 요소가 참조되지 않은 경우, 사용 가능한 첫 번째 요소를 참조하도록 설정합니다. 컨테이너 끝에 도달하면 아무 작업도 수행하지 않습니다. |

## 또 보기

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

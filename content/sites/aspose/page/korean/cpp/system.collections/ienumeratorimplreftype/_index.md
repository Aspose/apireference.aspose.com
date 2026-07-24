---
title: "System::Collections::IEnumeratorImplRefType 클래스"
linktitle: "IEnumeratorImplRefType"
second_title: "C++용 Aspose.Page"
description: "System::Collections::IEnumeratorImplRefType 클래스. 제네릭이 아닌 IEnumerator 구현을 제네릭 Iterator IEnumeratorImplRefType 위에 생성하는 래퍼 - C++의 레퍼런스 타입용 래퍼."
type: docs
weight: 700
url: /ko/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


제네릭이 아닌 [IEnumerator](../ienumerator/) 구현을 제네릭 Iterator [IEnumeratorImplRefType](./) 위에 생성하는 래퍼 - 레퍼런스 타입용 래퍼.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Current](./get_current/)() const override | 현재 요소를 가져옵니다. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | 래퍼 생성자 |
| [MoveNext](./movenext/)() override | 열거자를 다음 요소로 이동합니다. 이전에 요소가 참조되지 않은 경우, 사용 가능한 첫 번째 요소를 참조하도록 설정합니다. 컨테이너 끝에 도달하면 아무 작업도 수행하지 않습니다. |

## 또 보기

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

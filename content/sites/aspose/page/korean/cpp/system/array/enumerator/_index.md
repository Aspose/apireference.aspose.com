---
title: "System::Array::Enumerator 클래스"
linktitle: "열거자"
second_title: "C++용 Aspose.Page"
description: "System::Array::Enumerator 클래스. Array 객체의 요소를 열거할 수 있게 하는 IEnumerator 인터페이스를 구현합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하도록 사용하십시오."
type: docs
weight: 6800
url: /ko/cpp/system/array/enumerator/
---
## Enumerator class


IEnumerator 인터페이스를 구현하여 [Array](../) 객체의 요소를 열거할 수 있게 합니다. 이 클래스의 객체는 [System::MakeObject()](../../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하도록 사용하십시오.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<Array\<T\>\>\&) | 지정된 배열을 나타내는 새로운 [Enumerator](./) 객체를 생성합니다. |
| [get_Current](./get_current/)() const override | 현재 요소의 복사본을 반환합니다. |
| [MoveNext](./movenext/)() override | 현재 요소의 인덱스가 배열의 마지막 요소를 가리키지 않는지 확인하고, 그렇지 않으면 인덱스를 앞으로 이동합니다. |
| [Reset](./reset/)() override | 현재 요소의 인덱스를 재설정합니다. |
| virtual [~Enumerator](./~enumerator/)() | 소멸자. |
## 또 보기

* Class [Object](../../object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Globalization::TextElementEnumerator 클래스"
linktitle: "TextElementEnumerator"
second_title: "C++용 Aspose.Page"
description: "System::Globalization::TextElementEnumerator 클래스. 문자열 요소(문자)를 반복하는 열거자. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2700
url: /ko/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


문자열 요소(문자)를 반복하는 열거자. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class TextElementEnumerator : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Current](./get_current/)() const | 현재 텍스트 요소를 가져옵니다. |
| [get_ElementIndex](./get_elementindex/)() const | 현재 텍스트 요소의 인덱스를 가져옵니다. |
| [GetTextElement](./gettextelement/)() const | 현재 요소를 가져옵니다. |
| [MoveNext](./movenext/)() | 다음 요소로 이동합니다. |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | 열거자를 초기 위치로 설정합니다. |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)

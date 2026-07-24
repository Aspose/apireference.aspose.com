---
title: "System::Text::RegularExpressions::Capture class"
linktitle: "Capture"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Capture 클래스. 단일 하위 표현식 매칭의 결과입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.text.regularexpressions/capture/
---
## Capture class


단일 하위 표현식 매칭의 결과입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class Capture : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Capture](./capture/)(const UStringPtr\&, int, int) | 생성자. |
| [get_Index](./get_index/)() const | 캡처된 하위 문자열의 인덱스를 가져옵니다. |
| [get_Length](./get_length/)() const | 캡처된 하위 문자열의 길이를 가져옵니다. |
| [get_Value](./get_value/)() const | 캡처된 하위 문자열을 가져옵니다. |
| [ToString](./tostring/)() const override | 캡처된 하위 문자열을 가져옵니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

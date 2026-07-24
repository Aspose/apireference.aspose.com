---
title: "System::Text::RegularExpressions::Group class"
linktitle: "Group"
second_title: "C++용 Aspose.Page"
description: "System::Text::RegularExpressions::Group class. 단일 캡처 그룹에 의해 매칭된 결과입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용하여 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 300
url: /ko/cpp/system.text.regularexpressions/group/
---
## Group class


단일 캡처 그룹에 의해 매칭된 결과입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 사용하여 함수 인자로 전달하십시오.

```cpp
class Group : public System::Text::RegularExpressions::Capture
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddCapture](./addcapture/)(const CapturePtr\&) | 그룹에 캡처를 추가합니다. |
| [get_Captures](./get_captures/)() | 사용 가능한 캡처를 가져옵니다. |
| [get_Success](./get_success/)() | 이 그룹에 대한 캡처가 성공했는지 확인합니다. |
| [Group](./group/)(const UStringPtr\&, int, int) | 생성자. |
| [Group](./group/)() | 빈 그룹의 생성자입니다. |
## 또 보기

* Class [Capture](../capture/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Diagnostics::StackTrace 클래스"
linktitle: "StackTrace"
second_title: "C++용 Aspose.Page"
description: "System::Diagnostics::StackTrace 클래스. 스택 프레임의 컬렉션. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 600
url: /ko/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


스택 프레임의 컬렉션. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 이 포인터를 함수 인수로 전달하십시오.

```cpp
class StackTrace : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | 스택 트레이스의 프레임 수를 가져옵니다. |
| virtual [GetFrame](./getframe/)(uint32_t) | 스택 프레임을 가져옵니다. |
| [operator=](./operator=/)(const StackTrace\&) const | 할당이 없습니다. |
| [StackTrace](./stacktrace/)() | 현재 스택 상태를 설명하는 스택 트레이스를 생성합니다. |
| [StackTrace](./stacktrace/)(bool) | 현재 스택 상태를 설명하는 스택 트레이스를 생성합니다. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | 복사 불가. |
| virtual [~StackTrace](./~stacktrace/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Diagnostics::StackFrame class"
linktitle: "StackFrame"
second_title: "C++용 Aspose.Page"
description: "System::Diagnostics::StackFrame 클래스. 단일 스택 프레임에 대한 정보를 가져옵니다. MSVS 전용. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 500
url: /ko/cpp/system.diagnostics/stackframe/
---
## StackFrame class


단일 스택 프레임에 대한 정보를 가져옵니다. MSVS 전용. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class StackFrame : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetFileColumnNumber](./getfilecolumnnumber/)() | colnum 번호를 가져옵니다. |
| virtual [GetFileLineNumber](./getfilelinenumber/)() | 라인 번호를 가져옵니다. |
| virtual [GetFileName](./getfilename/)() | 파일 이름을 가져옵니다. |
| [GetMethod](./getmethod/)() | 메서드 정보를 가져옵니다. |
| [operator=](./operator=/)(const StackFrame\&) const | 변경 불가. |
| [StackFrame](./stackframe/)(int) | 현재 스택 오프셋에 스택 프레임을 생성합니다. |
| [StackFrame](./stackframe/)(const StackFrame\&) | 복사 불가. |
| virtual [~StackFrame](./~stackframe/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)

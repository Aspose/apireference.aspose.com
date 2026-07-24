---
title: "System::Diagnostics::TraceListener 클래스"
linktitle: "TraceListener"
second_title: "C++용 Aspose.Page"
description: "System::Diagnostics::TraceListener 클래스. 디버그 및 추적 정보를 처리하기 위한 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 800
url: /ko/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


디버그 및 추적 정보를 처리하기 위한 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 사용하여 함수에 인자로 전달하십시오.

```cpp
class TraceListener : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | 디버거에 실패 메시지를 기록합니다. |
| virtual [Fail](./fail/)(System::String, System::String) | 디버거에 실패 메시지를 기록합니다. |
| virtual [Write](./write/)(System::String) | RTTI 정보. |
| virtual [WriteLine](./writeline/)(System::String) | 디버거에 라인을 기록합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Page for C++](../../)

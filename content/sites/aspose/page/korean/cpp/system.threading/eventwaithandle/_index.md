---
title: "System::Threading::EventWaitHandle 클래스"
linktitle: "EventWaitHandle"
second_title: "C++용 Aspose.Page"
description: "System::Threading::EventWaitHandle 클래스. 대기 중인 스레드에 보낼 수 있는 이벤트입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인수로 전달할 때 이 포인터를 사용하십시오."
type: docs
weight: 500
url: /ko/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | RTTI 정보. |
| virtual [Reset](./reset/)() | 이벤트를 비신호 상태로 설정합니다. |
| virtual [Set](./set/)() | 이벤트를 신호 상태로 설정합니다. |
| [~EventWaitHandle](./~eventwaithandle/)() | 소멸자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | 함수가 반환할 특수 값이며, 타임아웃이 초과되고 아무 것도 신호를 보내지 않을 경우 배열에서 신호된 객체의 인덱스를 반환합니다. |
## 또 보기

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

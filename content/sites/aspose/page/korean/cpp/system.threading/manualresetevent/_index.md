---
title: "System::Threading::ManualResetEvent 클래스"
linktitle: "ManualResetEvent"
second_title: "C++용 Aspose.Page"
description: "System::Threading::ManualResetEvent 클래스. 자동으로 재설정되지 않는 대기 중인 스레드에 알리는 이벤트입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 700
url: /ko/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | RTTI 정보. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | 함수가 반환할 특수 값이며, 타임아웃이 초과되고 아무 것도 신호를 보내지 않을 경우 배열에서 신호된 객체의 인덱스를 반환합니다. |
## 또 보기

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

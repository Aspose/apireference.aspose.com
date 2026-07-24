---
title: "System::Threading::Semaphore 클래스"
linktitle: "세마포어"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Semaphore 클래스. 세마포어 구현. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1000
url: /ko/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Release](./release/)() | 세마포어의 잠금을 해제합니다. |
| [Release](./release/)(int) | 세마포어의 여러 잠금을 해제합니다. |
| virtual [Reset](./reset/)() | 세마포어를 비신호 상태로 설정합니다. 지원되지 않습니다. |
| [Semaphore](./semaphore/)(int, int) | RTTI 정보. |
| [Semaphore](./semaphore/)(int, int, const String\&) | 이름이 지정된 세마포어를 생성합니다. |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | 이름이 지정된 세마포어를 생성합니다. |
| virtual [Set](./set/)() | 세마포어를 신호 상태로 설정합니다. 지원되지 않습니다. |
| [WaitOne](./waitone/)() override | 세마포어를 잠급니다. 필요시 무제한 대기를 수행합니다. |
| [WaitOne](./waitone/)(int) override | 세마포어를 잠급니다. 필요시 대기를 수행합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | 함수가 반환할 특수 값이며, 타임아웃이 초과되고 아무 것도 신호를 보내지 않을 경우 배열에서 신호된 객체의 인덱스를 반환합니다. |
## 또 보기

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

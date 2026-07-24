---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "C++용 Aspose.Page"
description: "System::Threading::TimerQueue class. Timer 객체를 관리하는 큐입니다. 이는 단순 구현에 불과합니다. Timer 객체는 스스로 여기 등록되며, 이를 사용하기 위해 직접 등록할 필요는 없습니다 - 대신 Timer 클래스 API를 사용하십시오. 접근 함수에 의해 메모리 관리가 이루어지는 싱글톤 타입이며, C++에서 직접 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1600
url: /ko/cpp/system.threading/timerqueue/
---
## TimerQueue class


[Timer](../timer/) 객체를 처리하는 큐입니다. 이는 단순 구현일 뿐입니다. [Timer](../timer/) 객체는 스스로 여기 등록되며, 사용하기 위해 직접 등록할 필요가 없습니다 - 대신 [Timer](../timer/) 클래스 API를 사용하십시오. 이는 접근 함수에 의해 메모리 관리가 이루어지는 싱글톤 타입입니다. 직접 인스턴스를 생성해서는 안 됩니다.

```cpp
class TimerQueue
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(Timer *) | 큐에 타이머를 등록합니다. |
| [Delete](./delete/)(Timer *) | 큐에서 타이머를 삭제합니다. |
| static [GetInstance](./getinstance/)() | 구현 싱글톤. |
| static [JoinWorkerThread](./joinworkerthread/)() | 워커 스레드에 조인합니다. 필요하면 무한히 대기합니다. |
| [operator=](./operator=/)(const TimerQueue\&) | 복사 불가. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | 복사 불가. |
## 또 보기

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

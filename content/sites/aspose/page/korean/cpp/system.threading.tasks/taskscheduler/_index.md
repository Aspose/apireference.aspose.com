---
title: "System::Threading::Tasks::TaskScheduler 클래스"
linktitle: "TaskScheduler"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::TaskScheduler 클래스. C++에서 작업을 스레드에 대기시키는 저수준 작업을 처리하는 객체를 나타냅니다."
type: docs
weight: 400
url: /ko/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


스레드에 작업을 큐잉하는 저수준 작업을 처리하는 객체를 나타냅니다.

```cpp
class TaskScheduler : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | 현재 스레드와 연결된 [TaskScheduler](./)을 생성합니다. |
| static [get_Current](./get_current/)() | 현재 실행 중인 작업과 연결된 [TaskScheduler](./)을 가져옵니다. |
| static [get_Default](./get_default/)() | 프레임워크에서 제공하는 기본 [TaskScheduler](./) 인스턴스를 가져옵니다. |
| [get_Id](./get_id/)() const | 이 [TaskScheduler](./)의 고유 ID를 가져옵니다. |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | 이 [TaskScheduler](./)가 지원할 수 있는 최대 동시성 수준을 나타냅니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Threading::Tasks::ValueTask::ValueTask 생성자"
linktitle: "ValueTask"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ValueTask::ValueTask 생성자. C++에서 빈, 초기화되지 않은 ValueTask를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


빈, 초기화되지 않은 [ValueTask](../)을 생성합니다.

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## 비고



작업이 완료되지 않았으며 결과가 없습니다. 결과를 가져오려고 하면 예외가 발생합니다.

## 또 보기

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


공유 포인터를 사용하여 [Task](../../task/)에서 [ValueTask](../)을 생성합니다.

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 작업 | const TaskPtr\& | 감싸는 작업입니다. 빈 작업의 경우 null일 수 있습니다. |
## 비고



[ValueTask](../)는 제공된 작업의 상태를 나타냅니다.

## 또 보기

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

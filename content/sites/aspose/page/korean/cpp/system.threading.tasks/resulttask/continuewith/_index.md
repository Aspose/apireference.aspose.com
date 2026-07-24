---
title: "System::Threading::Tasks::ResultTask::ContinueWith 메서드"
linktitle: "ContinueWith"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::ResultTask::ContinueWith 메서드. 결과 작업이 완료될 때 실행되는 연속 작업을 생성합니다 C++에서."
type: docs
weight: 300
url: /ko/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


결과 작업이 완료될 때 실행되는 연속 작업을 생성합니다.

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) 이 작업이 완료될 때 실행되며, 이 결과 작업을 수신합니다. |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## 비고



연속 작업은 이 [ResultTask](../)을 받아 결과 값을 접근합니다.

## 또 보기

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

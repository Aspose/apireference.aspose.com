---
title: "System::Threading::Tasks::Task::ContinueWith method"
linktitle: "ContinueWith"
second_title: "C++용 Aspose.Page"
description: "System::Threading::Tasks::Task::ContinueWith method. C++에서 작업이 완료될 때 실행되는 연속 작업을 생성합니다."
type: docs
weight: 700
url: /ko/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


작업이 완료될 때 실행되는 연속 작업을 생성합니다.

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | 이 작업이 완료될 때 실행할 [Action](../../../system/action/) |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## 또 보기

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

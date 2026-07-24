---
title: "System::Threading::Tasks::Task::ContinueWith メソッド"
linktitle: "ContinueWith"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::Task::ContinueWith メソッド。タスクが完了したときに実行される継続処理を作成します。"
type: docs
weight: 700
url: /ja/cpp/system.threading.tasks/task/continuewith/
---
## Task::ContinueWith method


タスクが完了したときに実行される継続を作成します。

```cpp
TaskPtr System::Threading::Tasks::Task::ContinueWith(const Action<TaskPtr> &continuationAction)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| continuationAction | const Action\<TaskPtr\>\& | [Action](../../../system/action/) このタスクが完了したときに実行する |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation

## 参照

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

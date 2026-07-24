---
title: "System::Threading::Tasks::ResultTask::ContinueWith メソッド"
linktitle: "ContinueWith"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultTask::ContinueWith メソッド。結果タスクが完了したときに実行される継続処理を作成します（C++）。"
type: docs
weight: 300
url: /ja/cpp/system.threading.tasks/resulttask/continuewith/
---
## ResultTask::ContinueWith method


結果タスクが完了したときに実行される継続処理を作成します。

```cpp
TaskPtr System::Threading::Tasks::ResultTask<T>::ContinueWith(const Action<RTaskPtr<T>> &continuationAction)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| continuationAction | const Action\<RTaskPtr\<T\>\>\& | [Action](../../../system/action/) は、このタスクが完了したときに実行され、結果タスクを受け取ります |

### ReturnValue

[TaskPtr](../../../system/taskptr/) A new task representing the continuation
## 備考



継続アクションは、この [ResultTask](../) を受け取り、結果値にアクセスします

## 参照

* Typedef [TaskPtr](../../../system/taskptr/)
* Typedef [Action](../../../system/action/)
* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Threading::Tasks::Delay メソッド"
linktitle: "遅延"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::Delay メソッド。C++ で時間遅延の後に完了するタスクを作成します。"
type: docs
weight: 700
url: /ja/cpp/system.threading.tasks/delay/
---
## System::Threading::Tasks::Delay(int32_t) method


時間遅延の後に完了するタスクを作成します。

```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| millisecondsDelay | int32_t | 返されたタスクが完了するまで待機するミリ秒数、または無期限に待機する場合は -1 を指定します。 |

### ReturnValue

時間遅延を表すタスクです。

## 参照

* Typedef [TaskPtr](../../system/taskptr/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
## System::Threading::Tasks::Delay(int32_t, const CancellationToken\&) method




```cpp
TaskPtr System::Threading::Tasks::Delay(int32_t millisecondsDelay, const CancellationToken &cancellationToken)
```

## 参照

* Typedef [TaskPtr](../../system/taskptr/)
* Class [CancellationToken](../../system.threading/cancellationtoken/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)

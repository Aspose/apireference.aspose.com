---
title: "System::Threading::Tasks::TaskScheduler クラス"
linktitle: "TaskScheduler"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::TaskScheduler クラス。C++ でタスクをスレッドにキューイングする低レベルの作業を処理するオブジェクトを表します。"
type: docs
weight: 400
url: /ja/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


タスクをスレッドにキューイングする低レベルの作業を処理するオブジェクトを表します。

```cpp
class TaskScheduler : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | 現在のスレッドに関連付けられた [TaskScheduler](./) を作成します。 |
| static [get_Current](./get_current/)() | 現在実行中のタスクに関連付けられた [TaskScheduler](./) を取得します。 |
| static [get_Default](./get_default/)() | フレームワークが提供するデフォルトの [TaskScheduler](./) インスタンスを取得します。 |
| [get_Id](./get_id/)() const | この [TaskScheduler](./) の固有 ID を取得します。 |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | この [TaskScheduler](./) がサポートできる最大同時実行レベルを示します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Threading::Tasks::ValueTask::ValueTask コンストラクタ"
linktitle: "ValueTask"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ValueTask::ValueTask コンストラクタ。C++ で空の、初期化されていない ValueTask を構築します。"
type: docs
weight: 100
url: /ja/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


空の、初期化されていない [ValueTask](../) を構築します。

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## 備考



タスクは完了しておらず、結果を持ちません。結果を取得しようとすると例外がスローされます。

## 参照

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


共有ポインタから [Task](../../task/) を使用して [ValueTask](../) を構築します。

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| タスク | const TaskPtr\\& | ラップするタスクです。空のタスクの場合は null にできます。 |
## 備考



提供されたタスクの状態を表すのは [ValueTask](../) です。

## 参照

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

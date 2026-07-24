---
title: "System::Threading::Tasks::ResultValueTask::ResultValueTask コンストラクタ"
linktitle: "ResultValueTask"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultValueTask::ResultValueTask コンストラクタ。C++ で空の、初期化されていない ResultValueTask を構築します。"
type: docs
weight: 100
url: /ja/cpp/system.threading.tasks/resultvaluetask/resultvaluetask/
---
## ResultValueTask::ResultValueTask() constructor


空の、初期化されていない [ResultValueTask](../) を構築します。

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask()
```

## 備考



タスクは完了しておらず、結果を持ちません。結果を取得しようとすると例外がスローされます。

## 参照

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const RTaskPtr\<T\>\&) constructor


[ResultValueTask](../) を、[ResultTask<T>](../../resulttask/) への共有ポインタから構築します。

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const RTaskPtr<T> &task)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| タスク | const RTaskPtr\<T\>\& | ラップするタスクです。空のタスクの場合は null にできます。 |
## 備考



提供されたタスクの状態と結果を表す [ResultValueTask](../) です。

## 参照

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultValueTask::ResultValueTask(const T\&) constructor


指定された結果で完了した [ResultValueTask](../) を構築します。

```cpp
System::Threading::Tasks::ResultValueTask<T>::ResultValueTask(const T &result)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 結果 | const T\& | 完了したタスクにラップする結果値です。 |
## 備考



これは、値を即座に返す正常に完了したタスクを作成します。

## 参照

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

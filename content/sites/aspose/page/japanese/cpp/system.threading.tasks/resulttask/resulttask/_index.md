---
title: "System::Threading::Tasks::ResultTask::ResultTask コンストラクタ"
linktitle: "ResultTask"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultTask::ResultTask コンストラクタ。内部実装です。C++ のユーザーコード向けではありません。"
type: docs
weight: 100
url: /ja/cpp/system.threading.tasks/resulttask/resulttask/
---
## ResultTask::ResultTask() constructor


内部実装です。ユーザーコード用ではありません。

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask()
```

## 備考


初期化されていない結果タスクを作成するための内部コンストラクタ
## 参照

* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultTask::ResultTask(const Func\<T\>\&) constructor


値を返す関数で [ResultTask](../) を構築します。

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask(const Func<T> &function)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 関数 | const Func\<T\>\& | 結果を返す非同期に実行される関数 |

## 参照

* Class [Func](../../../system/func/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ResultTask::ResultTask(const T\&) constructor


指定された結果で結果タスクを作成するための内部コンストラクタ。

```cpp
System::Threading::Tasks::ResultTask<T>::ResultTask(const T &result)
```

## 参照

* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

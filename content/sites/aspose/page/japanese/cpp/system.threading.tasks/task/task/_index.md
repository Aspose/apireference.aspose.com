---
title: "System::Threading::Tasks::Task::Task コンストラクタ"
linktitle: "Task"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::Task::Task コンストラクタ。C++ で未初期化タスクを作成するための内部コンストラクタです。"
type: docs
weight: 100
url: /ja/cpp/system.threading.tasks/task/task/
---
## Task::Task() constructor


初期化されていないタスクを作成するための内部コンストラクタです。

```cpp
System::Threading::Tasks::Task::Task()
```

## 参照

* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) constructor


状態を持つアクションと状態オブジェクトを使用して [Task](../) を構築します。

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | 実行するアクション（状態オブジェクトを受け取ります） |
| 状態 | const SharedPtr\<Object\>\& | アクションに渡されるユーザー定義の状態オブジェクト |

## 参照

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) constructor


状態を持つアクション、状態、およびキャンセルトークンを使用して [Task](../) を構築します。

```cpp
System::Threading::Tasks::Task::Task(const Action<SharedPtr<Object>> &action, const SharedPtr<Object> &state, const CancellationToken &cancellationToken)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| action | const Action\<SharedPtr\<Object\>\>\& | 実行するアクション（状態オブジェクトを受け取ります） |
| 状態 | const SharedPtr\<Object\>\& | アクションに渡されるユーザー定義の状態オブジェクト |
| cancellationToken | const CancellationToken\& | キャンセル要求を監視するトークン |

## 参照

* Typedef [Action](../../../system/action/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&) constructor


実行するアクションを使用して [Task](../) を構築します。

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| action | const Action<>\& | 非同期に実行するアクション |

## 参照

* Typedef [Action](../../../system/action/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## Task::Task(const Action<>\&, const CancellationToken\&) constructor


アクションとキャンセルトークンを使用して [Task](../) を構築します。

```cpp
System::Threading::Tasks::Task::Task(const Action<> &action, const CancellationToken &cancellationToken)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| action | const Action<>\& | 非同期に実行するアクション |
| cancellationToken | const CancellationToken\& | キャンセル要求を監視するトークン |

## 参照

* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../../../system.threading/cancellationtoken/)
* Class [Task](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Threading::ThreadPool::QueueUserWorkItem メソッド"
linktitle: "QueueUserWorkItem"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::ThreadPool::QueueUserWorkItem メソッド。C++ でパラメータなしのコールバックと共に作業項目をキューに入れます。"
type: docs
weight: 600
url: /ja/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


パラメータなしのコールバックを伴う作業項目をキューに入れます。

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | WaitCallback | ジョブとして使用されるコールバック関数。 |

### ReturnValue

常に true を返します。

## 参照

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


パラメータなしのコールバックを伴う作業項目をキューに入れます。

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | WaitCallback | ジョブとして使用されるコールバック関数。 |
| 状態 | const System::SharedPtr\<System::Object\>\& | ジョブ関数のパラメータ。 |

### ReturnValue

常に true を返します。

## 参照

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)

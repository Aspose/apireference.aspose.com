---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem メソッド"
linktitle: "QueueUserWorkItem"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem メソッド。C++ で作業項目をキューに追加します。"
type: docs
weight: 700
url: /ja/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


キューに作業項目を追加します。

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| コールバック | WaitCallback | 実行するコールバック関数。 |
| 状態 | const System::SharedPtr\<System::Object\>\& | コールバック関数の引数。 |

### ReturnValue

常に true を返します。

## 参照

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)

---
title: "System::Threading::SynchronizationContext::SetSynchronizationContext メソッド"
linktitle: "SetSynchronizationContext"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::SynchronizationContext::SetSynchronizationContext メソッド。C++ で現在のスレッドの同期コンテキストを設定します。"
type: docs
weight: 300
url: /ja/cpp/system.threading/synchronizationcontext/setsynchronizationcontext/
---
## SynchronizationContext::SetSynchronizationContext method


現在のスレッドの同期コンテキストを設定します。

```cpp
static void System::Threading::SynchronizationContext::SetSynchronizationContext(const SharedPtr<SynchronizationContext> &syncContext)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| syncContext | const SharedPtr\<SynchronizationContext\>\& | 現在のスレッドに設定する同期コンテキストです。 |
## 備考



nullptr を渡すと、現在のスレッドの同期コンテキストがクリアされます。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SynchronizationContext](../)
* Class [SynchronizationContext](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)

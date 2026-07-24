---
title: "System::Threading::SynchronizationContext クラス"
linktitle: "SynchronizationContext"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::SynchronizationContext クラス。C++ のさまざまな同期操作間で同期コンテキストを伝播させる基本機能を提供します。"
type: docs
weight: 1100
url: /ja/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


さまざまな同期操作間で同期コンテキストを伝播させる基本機能を提供します。

```cpp
class SynchronizationContext : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [get_Current](./get_current/)() | 現在のスレッドの同期コンテキストを取得します。 |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | 現在のスレッドの同期コンテキストを設定します。 |
| [SynchronizationContext](./synchronizationcontext/)() | RTTI 情報。 |
## 備考


このクラスはスレッド間で同期コンテキストの伝播を可能にし、コールバックや呼び出しを適切なスレッドまたは同期コンテキストに転送するために使用されます。
ダミー実装です。

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

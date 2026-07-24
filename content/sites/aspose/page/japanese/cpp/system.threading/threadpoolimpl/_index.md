---
title: "System::Threading::ThreadPoolImpl クラス"
linktitle: "ThreadPoolImpl"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::ThreadPoolImpl クラス。スレッドプールの内部データです。これはアクセス関数によってメモリ管理が行われるシングルトン型です。C++ では直接インスタンスを作成すべきではありません。"
type: docs
weight: 1400
url: /ja/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | 利用可能なスレッド数を取得します。 |
| static [GetInitialized](./getinitialized/)() | 初期化状態のシングルトンを取得します。 |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | 同時実行可能な最大スレッド数を取得します。 |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | プールが作成する最小スレッド数を取得します。 |
| [JoinAll](./joinall/)() | 所有するすべてのスレッドに参加します。無限に待ちます。 |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | キューに作業項目を追加します。 |
| [SetMaxThreads](./setmaxthreads/)(int, int) | プールが所有するスレッド数を設定します。 |
| [SetMinThreads](./setminthreads/)(int, int) | プールが所有する最小スレッド数を設定します。 |
| [ThreadPoolImpl](./threadpoolimpl/)() | コンストラクタ。 |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | デストラクタ。まだ終了していない場合、すべてのスレッドを結合します。 |
## 参照

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Threading::ThreadState enum"
linktitle: "ThreadState"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::ThreadState enum。C++ におけるスレッドの状態。"
type: docs
weight: 2000
url: /ja/cpp/system.threading/threadstate/
---
## ThreadState enum


スレッドの状態。

```cpp
enum class ThreadState
```

### 値

| 名前 | 値 | 説明 |
| --- | --- | --- |
| Running | 0 | [Thread](../thread/) は実行中です。 |
| StopRequested | 1 | [Thread](../thread/) の停止が要求されました。 |
| SuspendRequested | 2 | [Thread](../thread/) のサスペンションが要求されました。 |
| バックグラウンド | 4 | スレッドはバックグラウンドで実行されています。 |
| Unstarted | 8 | [Thread](../thread/) は開始されていません。 |
| Stopped | 16 | [Thread](../thread/) は停止しています。 |
| WaitSleepJoin | 32 | [Thread](../thread/) は結合されるのを待機しています。 |
| Suspended | 64 | [Thread](../thread/) は一時停止しています。 |
| AbortRequested | 128 | [Thread](../thread/) の中止が要求されています。 |
| Aborted | 256 | [Thread](../thread/) は中止されました。 |

## 参照

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

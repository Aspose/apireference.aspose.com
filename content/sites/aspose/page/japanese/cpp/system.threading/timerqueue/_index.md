---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::TimerQueue class。Timer オブジェクトを管理するキューです。これは単なる実装です。Timer オブジェクトは自らここに登録しますので、使用するために自分で登録する必要はありません - 代わりに Timer クラスの API を使用してください。これはアクセス関数によってメモリ管理が行われるシングルトン型です。C++ で直接インスタンスを作成してはいけません。"
type: docs
weight: 1600
url: /ja/cpp/system.threading/timerqueue/
---
## TimerQueue class


[Timer](../timer/) オブジェクトを処理するキューです。これは単なる実装です。[Timer](../timer/) オブジェクトは自動的にそこに登録されるので、使用するために自分で登録する必要はありません - 代わりに [Timer](../timer/) クラス API を使用してください。これはアクセス関数によってメモリ管理が行われるシングルトン型です。直接インスタンスを作成してはいけません。

```cpp
class TimerQueue
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(Timer *) | キューにタイマーを登録します。 |
| [Delete](./delete/)(Timer *) | キューからタイマーを削除します。 |
| static [GetInstance](./getinstance/)() | 実装シングルトンです。 |
| static [JoinWorkerThread](./joinworkerthread/)() | ワーカースレッドに参加します。必要に応じて無限に待機します。 |
| [operator=](./operator=/)(const TimerQueue\&) | コピーはできません。 |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | コピーはできません。 |
## 参照

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

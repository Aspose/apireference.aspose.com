---
title: "System::Threading::Tasks::ResultTask クラス"
linktitle: "ResultTask"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::ResultTask クラス。完了時に結果値を返す Task の特殊化（C++）。"
type: docs
weight: 100
url: /ja/cpp/system.threading.tasks/resulttask/
---
## ResultTask class


完了時に結果値を返す [Task](../task/) の特殊化。

```cpp
template<typename T>class ResultTask : public System::Threading::Tasks::Task
```


| パラメーター | 説明 |
| --- | --- |
| T | タスクが返す結果値の型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [ConfigureAwait](./configureawait/)(bool) const | この結果タスクに対する await のコンテキスト捕捉に関する動作を構成します。 |
| [ContinueWith](./continuewith/)(const Action\<RTaskPtr\<T\>\>\&) | 結果タスクが完了したときに実行される継続処理を作成します。 |
| [get_Result](./get_result/)() const | 非同期操作の結果を取得します。 |
| [GetAwaiter](./getawaiter/)() const | Await と共に使用するための、この結果タスクの awaiter を取得します。 |
| [ResultTask](./resulttask/)(const Func\<T\>\&) | 値を返す関数で [ResultTask](./) を構築します。 |
| [ResultTask](./resulttask/)() | 内部実装です。ユーザーコード用ではありません。 |
| [ResultTask](./resulttask/)(const T\&) | 指定された結果で結果タスクを作成するための内部コンストラクタ。 |
| [set_Result](./set_result/)(const T\&) | タスクの結果値を設定します。 |
## 備考



.NET の [System.Threading.Tasks.Task<TResult>](../task/) に似た、結果を生成する非同期操作を表します。
## 参照

* Class [Task](../task/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)

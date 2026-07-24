---
title: "System::Threading::Tasks::Task クラス"
linktitle: "Task"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Tasks::Task クラス。C++ で待機でき、他のタスクと組み合わせることができる非同期操作を表します。"
type: docs
weight: 300
url: /ja/cpp/system.threading.tasks/task/
---
## Task class


await でき、他のタスクと組み合わせ可能な非同期操作を表します。

```cpp
class Task : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Activate](./activate/)(TaskScheduler *) | スケジューラ上でタスクを実行できるようにアクティブ化します。 |
| [AddContinuation](./addcontinuation/)(const Action<>\&) | 完了時に実行される継続アクションを追加します。 |
| [Complete](./complete/)() | タスクを完了としてマークし、タスクを終了します。 |
| [ConfigureAwait](./configureawait/)(bool) const | このタスクに対する await のコンテキスト捕捉に関する動作を構成します。 |
| [ContinueWith](./continuewith/)(const Action\<TaskPtr\>\&) | タスクが完了したときに実行される継続を作成します。 |
| [Dispose](./dispose/)() override | タスクに関連付けられたリソースを解放します。 |
| [Execute](./execute/)() | タスクの関数を実行します。 |
| [get_AsyncState](./get_asyncstate/)() const | タスクに関連付けられたユーザー定義の状態オブジェクトを取得します。 |
| static [get_CompletedTask](./get_completedtask/)() | 完了したタスク（シングルトン）を取得します |
| static [get_CurrentId](./get_currentid/)() |  |
| [get_Id](./get_id/)() const | タスクの ID を取得します。 |
| [get_IsCanceled](./get_iscanceled/)() const | タスクがキャンセルにより完了したかどうかを取得します。 |
| [get_IsCompleted](./get_iscompleted/)() const | タスクが完了したかどうかを取得します。 |
| [get_IsFaulted](./get_isfaulted/)() const | タスクが未処理例外により完了したかどうかを取得します。 |
| [get_Scheduler](./get_scheduler/)() const | このタスクに関連付けられたスケジューラを取得します。 |
| [get_Status](./get_status/)() const | タスクの現在の状態を取得します。 |
| [GetAwaiter](./getawaiter/)() const | Await と共に使用するためのこのタスクの awaiter を取得します。 |
| [RunSynchronously](./runsynchronously/)() | 現在のスレッドでタスクを同期的に実行します。 |
| [RunSynchronously](./runsynchronously/)(const SharedPtr\<TaskScheduler\>\&) | 指定されたスケジューラを使用してタスクを同期的に実行します。 |
| [set_Function](./set_function/)(const FunctionT\&) | 実行する内部関数を設定します。 |
| [set_Scheduler](./set_scheduler/)(TaskScheduler *) | このタスクに関連付けられたスケジューラを設定します。 |
| [set_Status](./set_status/)(TaskStatus) | タスクのステータスを設定します。 |
| [Start](./start/)() | デフォルトのスケジューラを使用してタスクの実行を開始します。 |
| [Start](./start/)(const SharedPtr\<TaskScheduler\>\&) | 指定されたスケジューラを使用してタスクの実行を開始します。 |
| [Task](./task/)(const Action<>\&) | 実行するアクションを持つ [Task](./) を構築します。 |
| [Task](./task/)(const Action<>\&, const CancellationToken\&) | アクションとキャンセルトークンを持つ [Task](./) を構築します。 |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&) | 状態を保持するアクションと状態オブジェクトを持つ [Task](./) を構築します。 |
| [Task](./task/)(const Action\<SharedPtr\<Object\>\>\&, const SharedPtr\<Object\>\&, const CancellationToken\&) | 状態を保持するアクション、状態、そしてキャンセルトークンを持つ [Task](./) を構築します。 |
| [Task](./task/)() | 初期化されていないタスクを作成するための内部コンストラクタです。 |
| [Wait](./wait/)(const CancellationToken\&) const | キャンセルサポート付きでタスクの完了を待機します。 |
| [Wait](./wait/)() const | タスクの完了を待機します。 |
| [~Task](./~task/)() | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [FunctionT](./functiont/) | 内部実装です。ユーザーコード用ではありません。 |
## 備考


.NET の [System.Threading.Tasks.Task](./) に似た C++ 実装を提供し、キャンセル、継続、async/await パターンをサポートします。
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)

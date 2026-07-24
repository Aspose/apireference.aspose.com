---
title: "System::Timers::Timer クラス"
linktitle: "Timer"
second_title: "C++ 用 Aspose.Page"
description: "System::Timers::Timer クラス。C++ でデリゲートをループで呼び出すタイマーです。"
type: docs
weight: 200
url: /ja/cpp/system.timers/timer/
---
## Timer class


[Timer](./) that calls delegate in a loop.

```cpp
class Timer : public System::ComponentModel::Component
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() | タイマーを停止し、割り当てられたリソースを解放します。 |
| [Dispose](./dispose/)() | タイマーを停止し、割り当てられたリソースを解放します。 |
| [get_AutoReset](./get_autoreset/)() const | タイマーが自動リセットモードかどうかを確認します。 |
| [get_Enabled](./get_enabled/)() const | タイマーがアクティブかどうかを確認します。 |
| [get_Interval](./get_interval/)() const | タイマー間隔を取得します。 |
| [get_IsStopped](./get_isstopped/)() const | タイマーが停止しているかどうかを確認します。 |
| [set_AutoReset](./set_autoreset/)(bool) | タイマーを自動リセットモードに設定するか、解除します。 |
| [set_Enabled](./set_enabled/)(bool) | タイマーを開始または停止します。タイマーがすでに実行中の場合、開始しても時間のカウントは再開されません。 |
| [set_Interval](./set_interval/)(double) | タイマーの間隔を設定します。 |
| [Start](./start/)() | タイマーを開始します。タイマーがすでに実行中の場合、時間のカウントは再開されません。 |
| [Stop](./stop/)() | タイマーを停止します。 |
| [Timer](./timer/)() | RTTI 情報。 |
| [Timer](./timer/)(double) | 指定された間隔で停止したタイマーを作成します。 |
## 参照

* Class [Component](../../system.componentmodel/component/)
* Namespace [System::Timers](../)
* Library [Aspose.Page for C++](../../)

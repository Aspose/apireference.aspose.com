---
title: "System::Threading::Semaphore クラス"
linktitle: "セマフォ"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::Semaphore クラス。セマフォの実装。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1000
url: /ja/cpp/system.threading/semaphore/
---
## Semaphore class


[Semaphore](./) implementation. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Semaphore : public System::Threading::WaitHandle
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Release](./release/)() | セマフォのロックを解除します。 |
| [Release](./release/)(int) | セマフォの複数のロックを解除します。 |
| virtual [Reset](./reset/)() | セマフォを非シグナル状態に設定します。サポートされていません。 |
| [Semaphore](./semaphore/)(int, int) | RTTI 情報。 |
| [Semaphore](./semaphore/)(int, int, const String\&) | 名前付きセマフォを作成します。 |
| [Semaphore](./semaphore/)(int, int, const String\&, bool\&) | 名前付きセマフォを作成します。 |
| virtual [Set](./set/)() | セマフォをシグナル状態に設定します。サポートされていません。 |
| [WaitOne](./waitone/)() override | セマフォをロックします。必要に応じて無制限に待機します。 |
| [WaitOne](./waitone/)(int) override | セマフォをロックします。必要に応じて待機します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | タイムアウトが超過し何もシグナルが来なかった場合、配列中のシグナルオブジェクトのインデックスを返す代わりに関数が返す特別な値。 |
## 参照

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

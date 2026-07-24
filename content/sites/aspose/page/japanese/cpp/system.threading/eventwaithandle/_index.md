---
title: "System::Threading::EventWaitHandle クラス"
linktitle: "EventWaitHandle"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::EventWaitHandle クラス。待機中のスレッドに送信できるイベント。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 500
url: /ja/cpp/system.threading/eventwaithandle/
---
## EventWaitHandle class


[Event](../../system/event/) that can be sent to waiting thread. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EventWaitHandle : public System::Threading::WaitHandle
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [EventWaitHandle](./eventwaithandle/)(bool, EventResetMode) | RTTI 情報。 |
| virtual [Reset](./reset/)() | イベントを非シグナル状態に設定します。 |
| virtual [Set](./set/)() | イベントをシグナル状態に設定します。 |
| [~EventWaitHandle](./~eventwaithandle/)() | デストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | タイムアウトが超過し何もシグナルが来なかった場合、配列中のシグナルオブジェクトのインデックスを返す代わりに関数が返す特別な値。 |
## 参照

* Class [WaitHandle](../waithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

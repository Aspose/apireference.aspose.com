---
title: "System::Threading::ManualResetEvent クラス"
linktitle: "ManualResetEvent"
second_title: "C++ 用 Aspose.Page"
description: "System::Threading::ManualResetEvent クラス。自動的にリセットされない待機スレッドに通知するイベント。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system.threading/manualresetevent/
---
## ManualResetEvent class


[Event](../../system/event/) to notify waiting thread that does not reset automatically. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ManualResetEvent : public System::Threading::EventWaitHandle
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ManualResetEvent](./manualresetevent/)(bool) | RTTI 情報。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [WaitTimeout](../waithandle/waittimeout/) | タイムアウトが超過し何もシグナルが来なかった場合、配列中のシグナルオブジェクトのインデックスを返す代わりに関数が返す特別な値。 |
## 参照

* Class [EventWaitHandle](../eventwaithandle/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)

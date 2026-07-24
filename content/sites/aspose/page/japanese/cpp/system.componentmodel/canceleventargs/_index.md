---
title: "System::ComponentModel::CancelEventArgs クラス"
linktitle: "CancelEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::CancelEventArgs クラス。キャンセル可能なイベントの引数です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


キャンセル可能なイベントの引数です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡すようにしてください。

```cpp
class CancelEventArgs : public System::EventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | RTTI 情報。 |
| [CancelEventArgs](./canceleventargs/)() | コンストラクタ; Cancel プロパティを false に設定します。 |
| [get_Cancel](./get_cancel/)() | イベントをキャンセルすべきかどうかを示す値を取得します。 |
| [set_Cancel](./set_cancel/)(bool) | イベントをキャンセルすべきかどうかを示す値を設定します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## 参照

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::ComponentModel::DoWorkEventArgs クラス"
linktitle: "DoWorkEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::DoWorkEventArgs クラス。DoWork イベント引数。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


DoWork イベント引数。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | RTTI 情報。 |
| [get_Argument](./get_argument/)() | Argument プロパティを取得します; 未実装。 |
| [get_Result](./get_result/)() | Result プロパティを取得します; 未実装。 |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Result プロパティを設定します; 未実装。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## 参照

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)

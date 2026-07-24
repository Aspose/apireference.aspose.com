---
title: "System::ComponentModel::ProgressChangedEventArgs クラス"
linktitle: "ProgressChangedEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::ProgressChangedEventArgs クラス。このクラスのインスタンスは ProgressChangedEventHandler デリゲートへの引数として渡されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡すようにしてください。"
type: docs
weight: 1100
url: /ja/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


このクラスのインスタンスは ProgressChangedEventHandler デリゲートへの引数として渡されます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | 非同期タスクの進捗パーセンテージを取得します。 |
| [get_UserState](./get_userstate/)() const | 一意のユーザー状態を取得します。 |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## 参照

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)

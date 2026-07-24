---
title: "System::ComponentModel::AsyncCompletedEventArgs クラス"
linktitle: "AsyncCompletedEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::AsyncCompletedEventArgs クラス。このクラスのインスタンスは AsyncCompletedEventHandler デリゲートへの引数として渡されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


このクラスのインスタンスは AsyncCompletedEventHandler デリゲートへの引数として渡されます。 このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。 スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。 常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | コンストラクタ。 |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | 新しい [System.ComponentModel.AsyncCompletedEventArgs](./) クラスのインスタンスを初期化します。 |
| [get_Cancelled](./get_cancelled/)() const | 非同期操作がキャンセルされたかどうかを示す値を取得します。バックグラウンド操作がキャンセルされた場合は true、そうでない場合は false。既定値は false です。 |
| [get_Error](./get_error/)() const | 非同期操作中に発生したエラーを示す値を取得します。 |
| [get_UserState](./get_userstate/)() const | 非同期タスクの一意の識別子を取得します。タスクを一意に識別するオブジェクト参照です。値が設定されていない場合は null になります。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## 参照

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)

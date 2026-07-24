---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs クラス"
linktitle: "InvokeCompletedEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs クラス。このクラスのインスタンスは InvokeCompletedEventHandler デリゲートへの引数として渡されます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを引数として関数に渡してください。C++ 用です。"
type: docs
weight: 200
url: /ja/cpp/system.web.services.protocols/invokecompletedeventargs/
---
## InvokeCompletedEventArgs class


このクラスのインスタンスは InvokeCompletedEventHandler デリゲートへの引数として渡されます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを引数として関数に渡してください。

```cpp
class InvokeCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Results](./get_results/)() | 非同期操作結果のコレクションを返します。 |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/)(Exception, bool, System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | 新しいインスタンスを構築します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## 参照

* Class [AsyncCompletedEventArgs](../../system.componentmodel/asynccompletedeventargs/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)

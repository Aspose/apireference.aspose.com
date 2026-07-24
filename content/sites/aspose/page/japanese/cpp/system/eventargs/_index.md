---
title: "System::EventArgs クラス"
linktitle: "EventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::EventArgs クラス。イベントがトリガーされたときにイベント購読者に渡されるコンテキストを表すクラスの基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 2500
url: /ja/cpp/system/eventargs/
---
## EventArgs class


イベントがトリガーされたときにイベント購読者に渡されるコンテキストを表すクラスの基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class EventArgs : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [EventArgs](./eventargs/)() | コンストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](./empty/) | 空の [EventArgs](./) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

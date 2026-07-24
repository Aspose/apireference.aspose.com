---
title: "System::ComponentModel::PropertyChangedEventArgs クラス"
linktitle: "PropertyChangedEventArgs"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::PropertyChangedEventArgs クラス。PropertyChanged イベントの引数です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡してください。"
type: docs
weight: 1200
url: /ja/cpp/system.componentmodel/propertychangedeventargs/
---
## PropertyChangedEventArgs class


PropertyChanged イベントの引数です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class PropertyChangedEventArgs : public System::EventArgs
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_PropertyName](./get_propertyname/)() | RTTI 情報。 |
| [PropertyChangedEventArgs](./propertychangedeventargs/)(const String\&) | PropertyChanged イベントの引数を初期化します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | \"empty\" の [EventArgs](../../system/eventargs/) 共有ポインタ（ヌルポインタ）を表す静的メンバーです。 |
## 参照

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)

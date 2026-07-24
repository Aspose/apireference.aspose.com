---
title: "System::BoxedValueBase クラス"
linktitle: "BoxedValueBase"
second_title: "C++ 用 Aspose.Page"
description: "System::BoxedValueBase クラス。ボックス化された値を表す派生クラスのインターフェイスを定義し、いくつかの基本的なメソッドを実装する基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 900
url: /ja/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


ボックス化された値を表す派生クラスのインターフェイスを定義し、いくつかの基本的なメソッドを実装する基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class BoxedValueBase : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | 現在のオブジェクトが表すボックス化された値の型を表す値を返します。 |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | 現在のオブジェクトが表すボックス化された値を 64 ビット整数値に変換します。 |
| virtual [IsBoxedEnum](./isboxedenum/)() | 現在のオブジェクトが列挙型のボックス化された値を表すかどうかを判定します。 |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | 指定された列挙体の指定された名前を持つ列挙定数の値をボックス化します。パラメータは、列挙定数名を表す文字列を解釈する際に大文字小文字を無視するかどうかを指定します。 |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | 指定された列挙体の指定された名前を持つ列挙定数の値をボックス化します。 |
| [ToString](./tostring/)(const System::String\&) const | 指定された書式文字列を使用してボックス化されたオブジェクトを文字列に変換します。 |
| virtual [ToString](./tostring/)() const | C# の [Object.ToString()](../object/tostring/) メソッドの類似です。カスタムオブジェクトを文字列に変換できるようにします。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

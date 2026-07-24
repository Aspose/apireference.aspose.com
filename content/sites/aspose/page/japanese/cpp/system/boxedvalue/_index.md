---
title: "System::BoxedValue クラス"
linktitle: "BoxedValue"
second_title: "C++ 用 Aspose.Page"
description: "System::BoxedValue クラス。ボックス化された値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 800
url: /ja/cpp/system/boxedvalue/
---
## BoxedValue class


ボックス化された値を表します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| パラメーター | 説明 |
| --- | --- |
| T | クラスが表すボックス化された値の型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | 指定された値をボックス化して表すオブジェクトを構築します。 |
| [Equals](./equals/)(ptr) override | 現在のオブジェクトと指定されたオブジェクトが表すボックス化された値の等価性を判定します。 |
| [GetHashCode](./gethashcode/)() const override | 現在のオブジェクトのハッシュコードを返します。 |
| [GetType](./gettype/)() const override | オブジェクトの実際の型を取得します。 |
| [GetTypeCode](./gettypecode/)() const override | 現在のオブジェクトが表すボックス化された値の型を表す値を返します。 |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | ボックス化されたオブジェクトをキャストできる場合は数値を返し、そうでない場合は 0 を返します。 |
| [is](./is/)() const | 現在のオブジェクトが表すボックス化された値の型が **V** かどうかを判定します。 |
| [IsBoxedEnum](./isboxedenum/)() override | 現在のオブジェクトが列挙型のボックス化された値を表すかどうかを判定します。 |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | 指定された列挙体の指定された名前を持つ列挙定数の値をボックス化します。パラメータは、列挙定数名を表す文字列を解釈する際に大文字小文字を無視するかどうかを指定します。 |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | 指定された列挙体の指定された名前を持つ列挙定数の値をボックス化します。 |
| [ToString](./tostring/)() const override | 現在のオブジェクトが表すボックス化された値を文字列に変換します。 |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | 指定された書式文字列を使用してボックス化されたオブジェクトを文字列に変換します。 |
| [unbox](./unbox/)() const | 現在のオブジェクトが表す値のボックス化を解除します。 |

## 参照

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

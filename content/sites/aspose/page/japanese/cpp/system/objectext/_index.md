---
title: "System::ObjectExt クラス"
linktitle: "ObjectExt"
second_title: "C++ 用 Aspose.Page"
description: "System::ObjectExt クラス。非 Object の C++ 型（文字列、数値など）に対して呼び出される C# の Object メソッドをエミュレートする静的メソッドを提供します。これはインスタンスサービスを持たない静的型です。C++ ではいかなる手段でもインスタンスを作成すべきではありません。"
type: docs
weight: 4900
url: /ja/cpp/system/objectext/
---
## ObjectExt class


非 Object の C++ 型（文字列、数値など）に対して呼び出される C# の [Object](../object/) メソッドをエミュレートする静的メソッドを提供します。これはインスタンスサービスを持たない静的型です。いかなる手段でもインスタンスを作成すべきではありません。

```cpp
class ObjectExt : public System::ObjectType
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | 配列の基本値を変換します（C# では暗黙的に行われますが、C++ では行われないようです）。 |
| static [Box](./box/)(const T\&) | 値型を [Object](../object/) に変換するためにボックス化します。列挙型向けの実装です。 |
| static [Box](./box/)(const T\&) | 値型を [Object](../object/) に変換するためにボックス化します。列挙型以外向けの実装です。 |
| static [Box](./box/)(const T\&) | [Nullable](../nullable/) 型を [Object](../object/) に変換するためにボックス化します。 |
| static [Box](./box/)(const String\&) | 文字列値をボックス化します。 |
| static [BoxEnum](./boxenum/)(T) | 列挙型を [Object](../object/) として伝搬させるためにボックス化します。 |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | 非 nullable 型向けの '??' 演算子変換の実装です。 |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | nullable 型向けの '??' 演算子変換の実装です。 |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | 非 nullable 型向けの '??' 演算子変換の実装です。RT2 が RT1 に変換可能な場合のオーバーロードです。 |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | C# の [Object.Equals](../object/equals/) 呼び出しを C++ の任意の型で動作させる置換です。スマートポインタ型向けのオーバーロードです。 |
| static [Equals](./equals/)(T, const T2\&) | C# の [Object.Equals](../object/equals/) 呼び出しを C++ の任意の型で動作させる置換です。構造体型向けのオーバーロードです。 |
| static [Equals](./equals/)(const T\&, const T2\&) | C# の [Object.Equals](../object/equals/) 呼び出しを C++ の任意の型で動作させる置換です。スカラー型向けのオーバーロードです。 |
| static [Equals](./equals/)(const char_t(&), String) | C# の [Object.Equals](../object/equals/) 呼び出しを C++ の任意の型で動作させる置換です。文字列リテラルの文字列比較向けのオーバーロードです。 |
| static [Equals](./equals/)(const float\&, const float\&) | IEC 60559:1989 によれば NaN は任意の値（NaN を含む）と等しくないにもかかわらず、C# スタイルの浮動小数点比較をエミュレートし、2 つの NaN を等しいとみなします。 |
| static [Equals](./equals/)(const double\&, const double\&) | IEC 60559:1989 によれば NaN は任意の値（NaN を含む）と等しくないにもかかわらず、C# スタイルの浮動小数点比較をエミュレートし、2 つの NaN を等しいとみなします。 |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | [GetHashCode()](./gethashcode/) 呼び出しを実装します；[Object](../object/) のサブクラスと無関係な型の両方で機能します。 |
| static [Is](./is/)(const T\&) | 'is' 演算子の変換を実装します。ボックス可能（値）型向けの特殊化で、正確にはそれらの型です。 |
| static [Is](./is/)(const U\&) | 'is' 演算子の変換を実装します。'final' クラスに最適化されたポインタ型向けの特殊化です。 |
| static [Is](./is/)(const U\&) | 'is' 演算子の変換を実装します。ポインタ型向けの特殊化です。 |
| static [Is](./is/)(const Object\&) | 'is' 演算子の変換を実装します。値型向けの特殊化です。 |
| static [Is](./is/)(const Object\&) | 「is」演算子の実装変換。変換不可能な型の特殊化。 |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 'is' 演算子の変換を実装します。ポインタ型向けの特殊化です。 |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | 「is」演算子の実装変換。例外ラッパー型の特殊化。 |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 「is」演算子の実装変換。nullable 型の特殊化。 |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 「is」演算子の実装変換。== 演算子が定義されたボックス可能型の特殊化。 |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 「is」演算子の実装変換。== が定義されていないボックス可能型の特殊化。 |
| static [Is](./is/)(const SmartPtr\<V\>\&) | 「is」演算子の実装変換。インターフェイスにボックスされた値型の特殊化。 |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 「is」演算子の実装変換。列挙型の特殊化。 |
| static [Is](./is/)(const WeakPtr\<U\>\&) | 「is」演算子の実装変換。列挙型と弱ポインタの比較の特殊化。 |
| static [Is](./is/)(const Nullable\<U\>\&) | 「is」演算子の実装変換。[Nullable](../nullable/) 型の特殊化。 |
| static [Is](./is/)(const char16_t *) | 「is」演算子の実装変換。文字列リテラルの特殊化。 |
| static [Is](./is/)(int32_t) | 「is」演算子の実装変換。整数リテラルの特殊化。 |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | オブジェクトがボックスされた値かどうかをチェックします。 |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/) を未知の型に変換し、スマートポインタ型とボックスされた値の両方の状況を処理します。 |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | [Object](../object/) を未知の型に変換し、スマートポインタ型とボックスされた値の両方の状況を処理します。 |
| static [ToString](./tostring/)(const char_t *) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(const T\&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(const T\&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(T\&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(T\&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(T\&&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(T\&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(const T\&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [ToString](./tostring/)(T\&&) | 任意の C++ 型で機能するように C# の ToString メソッドを置き換えます。 |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) に変換した後に値型をアンボックスします。列挙型向けの実装。 |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) に変換した後に値型をアンボックスします。列挙型以外および nullable 以外の型向けの実装。 |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | [Object](../object/) に変換した後に値型をアンボックスします。列挙型以外および nullable 以外の型向けの実装。 |
| static [Unbox](./unbox/)(E) | 列挙型を整数にアンボックスします。 |
| static [Unbox](./unbox/)(E) | 列挙型を変換します。 |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | 文字列値をアンボックスします。 |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | ボックスされた値から文字列をアンボックスします。 |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | オブジェクトを nullable 型にアンボックスします。 |
| static [UnknownIsNull](./unknownisnull/)(T) | 未知の型オブジェクトが nullptr かどうかをチェックします。非スカラー型向けのオーバーロード。 |
| static [UnknownIsNull](./unknownisnull/)(T) | 未知の型オブジェクトが nullptr かどうかをチェックします。スカラー型向けのオーバーロード。 |
| static [UnknownToObject](./unknowntoobject/)(T) | 未知の型を [Object](../object/) に変換し、スマートポインタ型と値型の両方の状況を処理します。 |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | 未知の型を [Object](../object/) に変換し、スマートポインタ型と値型の両方の状況を処理します。 |
## 参照

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Nullable クラス"
linktitle: "Nullable"
second_title: "C++ 用 Aspose.Page"
description: "System::Nullable クラス。C++ の前方宣言です。"
type: docs
weight: 4600
url: /ja/cpp/system/nullable/
---
## Nullable class


前方宣言です。

```cpp
template<typename T>class Nullable
```


| パラメーター | 説明 |
| --- | --- |
| T | [Nullable](./) クラスによって拡張される基底値型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | 現在のオブジェクトが表す値が、指定された [Nullable](./) オブジェクトが表す値と等しいかどうかを判断します。 |
| [get_HasValue](./get_hasvalue/)() const | 現在のオブジェクトが何らかの値を表すかどうかを判断します。 |
| [get_Value](./get_value/)() const | 現在のオブジェクトが表す値のコピーを返します。 |
| [GetHashCode](./gethashcode/)() const | 現在のオブジェクトのハッシュコードを返します。 |
| [GetValueOrDefault](./getvalueordefault/)(T) | 現在のオブジェクトが表す値、または現在のオブジェクトが null の場合は指定された値を返します。 |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | 現在のオブジェクトが null 値を表すかどうかを判断します。 |
| [Nullable](./nullable/)() | null 値を表すインスタンスを構築します。 |
| [Nullable](./nullable/)(std::nullptr_t) | null を表すインスタンスを構築します。 |
| [Nullable](./nullable/)(const T1\&) | [Nullable](./) クラスのインスタンスを構築し、指定された値を（必要に応じて）基底型 T の値に変換して表します。 |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | 指定された[Nullable](./)オブジェクトが表す値を表すインスタンスを構築します。指定されたnullableオブジェクトは、構築されたインスタンスの基底型とは異なる型の値を表す場合があり、その場合、表された値は型Tの値に変換されます。 |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | このオブジェクトと**other**が両方ともnullでないかをチェックし、そうであればラムダを呼び出すヘルパー関数です。実装で使用されます。 |
| [operator const T &](./operatorconstt&/)() const | 現在のオブジェクトが表す値への定数参照を返します。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 現在のオブジェクトが表す値がnullでないかどうかを判定します。 |
| [operator!=](./operator!=/)(const T1\&) const | 現在のオブジェクトが表す値が指定された値と等しくないかどうかを判定します。 |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | 現在のオブジェクトが表す値が、指定された[Nullable](./)オブジェクトが表す値と等しくないかどうかを判定します。 |
| [operator&=](./operator&=/)(bool) | 指定された値を右側引数として、現在のオブジェクトが表す値に[operator&=()](./operator&=/)を適用します。 |
| [operator+](./operator+/)(std::nullptr_t) const | Nullable<T>クラスのデフォルト構築インスタンスを返します。 |
| [operator+](./operator+/)(const T1\&) const | nullable値と非nullable値を加算します。 |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | nullable値を加算します。 |
| [operator+=](./operator+=/)(std::nullptr_t) | 現在のオブジェクトをリセットし、null値を表すようにします。 |
| [operator+=](./operator+=/)(const T1\&) | 指定された値を右側引数として、現在のオブジェクトが表す値に[operator+=()](./operator+=/)を適用します。 |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | 指定された[Nullable](./)オブジェクトが表す値を右側引数として、現在のオブジェクトが表す値に[operator+=()](./operator+=/)を適用します。 |
| [operator-](./operator-/)(T1) const | nullable値とnull参照の値を減算します。 |
| [operator-](./operator-/)(const T1\&) const | nullable値と非nullable値を減算します。 |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | nullable値を減算します。 |
| [operator-=](./operator-=/)(T1) | null値を表す[Nullable](./)クラスのインスタンスを返します。 |
| [operator-=](./operator-=/)(const T1\&) | 指定された値を右側引数として、現在のオブジェクトが表す値に[operator-=()](./operator-=/)を適用します。 |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | 指定された[Nullable](./)オブジェクトが表す値を右側引数として、現在のオブジェクトが表す値に[operator-=()](./operator-=/)を適用します。 |
| [operator<](./operator_/)(std::nullptr_t) const | 常に false を返します。 |
| [operator<](./operator_/)(const T1\&) const | これらの値に[operator<()](./operator_/)を適用して、現在のオブジェクトが表す値が指定された値より小さいかどうかを判定します。 |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | これらの値に[operator<()](./operator_/)を適用して、現在のオブジェクトが表す値が指定された[Nullable](./)オブジェクトが表す値より小さいかどうかを判定します。 |
| [operator<=](./operator_=/)(std::nullptr_t) const | 常に false を返します。 |
| [operator<=](./operator_=/)(const T1\&) const | これらの値に[operator<=()](./operator_=/)を適用して、現在のオブジェクトが表す値が指定された値以下かどうかを判定します。 |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | これらの値に[operator<=()](./operator_=/)を適用して、現在のオブジェクトが表す値が指定された[Nullable](./)オブジェクトが表す値以下かどうかを判定します。 |
| [operator=](./operator=/)(std::nullptr_t) | 現在のオブジェクトにnullを代入します。 |
| [operator=](./operator=/)(const T1\&) | オブジェクトが現在表す値を指定された値に置き換えます。 |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | オブジェクトが現在表す値を指定された値に置き換えます。 |
| [operator==](./operator==/)(std::nullptr_t) const | 現在のオブジェクトが表す値が null かどうかを判断します。 |
| [operator==](./operator==/)(const T1\&) const | 現在のオブジェクトが表す値が指定された値と等しいかどうかを判断します。 |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | 現在のオブジェクトが表す値が、指定された [Nullable](./) オブジェクトが表す値と等しいかどうかを判断します。 |
| [operator>](./operator_/)(std::nullptr_t) const | 常に false を返します。 |
| [operator>](./operator_/)(const T1\&) const | 現在のオブジェクトが表す値に対して、[operator>()](./operator_/) を適用してこれらの値が指定された値より大きいかどうかを判断します。 |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | 現在のオブジェクトが表す値が、指定された [Nullable](./) オブジェクトが表す値より大きいかどうかを、[operator>()](./operator_/) を適用して判断します。 |
| [operator>=](./operator_=/)(std::nullptr_t) const | 常に false を返します。 |
| [operator>=](./operator_=/)(const T1\&) const | 現在のオブジェクトが表す値が、指定されたオブジェクトが表す値以上かどうかを、[operator>=()](./operator_=/) を適用して判断します。 |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | 現在のオブジェクトが表す値が、指定された [Nullable](./) オブジェクトが表す値以上かどうかを、[operator>=()](./operator_=/) を適用して判断します。 |
| [operator | =](./operator_=/)(bool) | 適用します [operator | =()](./operator_=/) 現在のオブジェクトが表す値に対して、指定された値を右側引数として使用します。 |
| [reset](./reset/)() | 現在表されている値を null に設定します。 |
| [ToString](./tostring/)() const | 現在のオブジェクトが表す値を文字列に変換します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ValueType](./valuetype/) | このクラスが表す値の型のエイリアスです。 |
## 備考


指定された型の値を表し、null を代入可能です。この型はスタック上に割り当て、値または参照で関数に渡すべきです。この型のオブジェクトを管理するために [System::SmartPtr](../smartptr/) クラスを使用しないでください。

## 参照

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)

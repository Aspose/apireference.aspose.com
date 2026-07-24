---
title: "System::Collections::Generic::IEnumerable クラス"
linktitle: "IEnumerable"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IEnumerable クラス。C++ において、含まれる要素に対して列挙子を提供するオブジェクトのインターフェイスです。"
type: docs
weight: 2200
url: /ja/cpp/system.collections.generic/ienumerable/
---
## IEnumerable class


含まれる要素に対して列挙子を提供するオブジェクトのインターフェイスです。

```cpp
template<typename T>class IEnumerable : public virtual System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [begin](./begin/)() | コレクションの最初の要素（存在する場合）を指すイテレータを取得します。このイテレータは、[GetEnumerator()](./getenumerator/) が T のコピーオブジェクトを返すため、参照されたオブジェクトを変更するために使用できません。 |
| [begin](./begin/)() const | コレクションの const 修飾インスタンスの最初の要素（存在する場合）を指すイテレータを取得します。 |
| [cbegin](./cbegin/)() const | コレクションの最初の const 修飾要素（存在する場合）を指すイテレータを取得します。 |
| [cend](./cend/)() const | コレクションの最後の const 修飾要素（存在する場合）の直後を指すイテレータを取得します。 |
| [end](./end/)() | コレクションの最後の要素の直後（存在する場合）を指すイテレータを取得します。このイテレータは、[GetEnumerator()](./getenumerator/) が T のコピーオブジェクトを返すため、参照されたオブジェクトを変更するために使用できません。 |
| [end](./end/)() const | const 修飾されたコレクションインスタンスの最後の要素（存在する場合）の直後を指すイテレータを取得します。 |
| virtual [GetEnumerator](./getenumerator/)() | 列挙子を取得します。 |
| [LINQ_Aggregate](./linq_aggregate/)(const Func\<T, T, T\>\&) | シーケンスに対してアキュムレータ関数を適用します。 |
| [LINQ_All](./linq_all/)(std::function\<bool(T)>) | シーケンスのすべての要素が条件を満たすかどうかを判定します。 |
| [LINQ_Any](./linq_any/)() | シーケンスに要素が含まれているかどうかを判定します。 |
| [LINQ_Any](./linq_any/)(std::function\<bool(T)>) | シーケンスの任意の要素が存在するか、または条件を満たすかどうかを判定します。 |
| [LINQ_Cast](./linq_cast/)() | 要素を指定された型にキャストします。 |
| [LINQ_Cast](./linq_cast/)() |  |
| [LINQ_Concat](./linq_concat/)(SharedPtr\<IEnumerable\<T\>\>) | 2 つのシーケンスを連結します。 |
| [LINQ_Contains](./linq_contains/)(T) | シーケンスが指定された値を含むかどうかを判定します。 |
| [LINQ_Count](./linq_count/)() | シーケンス内の要素数を返します（直接カウントにより計算）。 |
| [LINQ_Count](./linq_count/)(const Func\<T, bool\>\&) | シーケンス内で指定された条件を満たす要素数を返します。 |
| [LINQ_ElementAt](./linq_elementat/)(int) | シーケンスの指定インデックスにある要素を返します。 |
| [LINQ_ElementAtOrDefault](./linq_elementatordefault/)(int) | シーケンスの指定インデックスにある要素を返します。 |
| [LINQ_First](./linq_first/)() | シーケンスの最初の要素を返します。 |
| [LINQ_First](./linq_first/)(const Func\<T, bool\>\&) | シーケンスの最初の要素で、指定された条件を満たすものを返します。 |
| [LINQ_FirstOrDefault](./linq_firstordefault/)() | シーケンスの最初の要素を返します。シーケンスが空の場合はデフォルト値を返します。 |
| [LINQ_FirstOrDefault](./linq_firstordefault/)(std::function\<bool(T)>) | 条件を満たすシーケンスの最初の要素を返します。該当する要素が見つからない場合はデフォルト値を返します。 |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<T, Key\>) | シーケンスの要素をグループ化します。 |
| [LINQ_GroupBy](./linq_groupby/)(System::Func\<Source, Key\>) |  |
| [LINQ_Last](./linq_last/)() | シーケンスの最後の要素を返します。 |
| [LINQ_LastOrDefault](./linq_lastordefault/)() | シーケンスの最後の要素を返します。シーケンスが空の場合はデフォルト値を返します。 |
| [LINQ_Max](./linq_max/)(const Func\<T, ResultType\>\&) | ジェネリックシーケンスの各要素に変換関数を適用し、結果として得られる最大値を返します。 |
| [LINQ_Max](./linq_max/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_Min](./linq_min/)(const Func\<T, ResultType\>\&) | ジェネリックシーケンスの各要素に変換関数を適用し、結果として得られる最小値を返します。 |
| [LINQ_Min](./linq_min/)(const Func\<Source, ResultType\>\&) |  |
| [LINQ_OfType](./linq_oftype/)() | 指定された型に基づいてシーケンスの要素をフィルタリングします。 |
| [LINQ_OfType](./linq_oftype/)() |  |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<T, Key\>\&) | keySelectorで選択されたキー値に従って、シーケンスの要素を昇順にソートします。 |
| [LINQ_OrderBy](./linq_orderby/)(const Func\<Source, Key\>\&) |  |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<T, Key\>\&) | keySelectorで選択されたキー値に従って、シーケンスの要素を降順にソートします。 |
| [LINQ_OrderByDescending](./linq_orderbydescending/)(const Func\<Source, Key\>\&) |  |
| [LINQ_Reverse](./linq_reverse/)() | シーケンス内の要素の順序を反転させます。 |
| [LINQ_Select](./linq_select/)(const Func\<T, ResultType\>\&) | シーケンスの要素を変換します。 |
| [LINQ_Select](./linq_select/)(const Func\<T, int32_t, ResultType\>\&) | 要素のインデックスを組み込んで、シーケンスの各要素を新しい形に変換します。 |
| [LINQ_Select](./linq_select/)(const Func\<Source, Result\>\&) |  |
| [LINQ_Select](./linq_select/)(const Func\<Source, int32_t, Result\>\&) |  |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) | シーケンスの各要素を投影し、結果として得られるシーケンスを1つのシーケンスに結合します。 |
| [LINQ_SelectMany](./linq_selectmany/)(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) |  |
| [LINQ_Take](./linq_take/)(int32_t) | シーケンスの先頭から指定された数の連続要素を返します。 |
| [LINQ_ToArray](./linq_toarray/)() | シーケンスから配列を作成します。 |
| [LINQ_ToList](./linq_tolist/)() | シーケンスから[List<T>](../list/)を作成します。 |
| [LINQ_Where](./linq_where/)(std::function\<bool(T)>) | 指定された述語に基づいてシーケンスをフィルタリングします。 |
| virtual [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const | 現在のコンテナの begin const イテレータの実装を取得します。 |
| virtual [virtualizeBeginIterator](./virtualizebeginiterator/)() | 現在のコンテナの begin イテレータの実装を取得します。 |
| virtual [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const | 現在のコンテナの end const イテレータの実装を取得します。 |
| virtual [virtualizeEndIterator](./virtualizeenditerator/)() | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [IEnumeratorType](./ienumeratortype/) | RTTI 情報。 |
| [iterator](./iterator/) | イテレータ型。 |
| [ValueType](./valuetype/) |  |
| [virtualized_iterator](./virtualized_iterator/) | 内部イテレータの基底型です。 |
| [virtualized_iterator_element](./virtualized_iterator_element/) | 内部イテレータの要素型です。 |

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

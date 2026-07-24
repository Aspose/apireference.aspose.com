---
title: "System::Linq::IOrderedEnumerable クラス"
linktitle: "IOrderedEnumerable"
second_title: "C++ 用 Aspose.Page"
description: "System::Linq::IOrderedEnumerable クラス。C++ でソートされたシーケンスを表します。"
type: docs
weight: 300
url: /ja/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


ソートされたシーケンスを表します。

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | シーケンスの要素の型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | 列挙子を取得します。 |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | キーに従ってシーケンス内の要素を昇順で追加的に並べ替えます。 |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Comparator](./comparator/) | RTTI 情報。 |

## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Page for C++](../../)

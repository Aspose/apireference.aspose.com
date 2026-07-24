---
title: "System::Collections::Generic::SortedSet クラス"
linktitle: "SortedSet"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::SortedSet クラス。C++ における SortedSet クラスの前方宣言です。"
type: docs
weight: 4400
url: /ja/cpp/system.collections.generic/sortedset/
---
## SortedSet class


[SortedSet](./) クラスの前方宣言です。

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Max](./get_max/)() const | [SortedSet](./) の最大値を取得します。 |
| [SortedSet](./sortedset/)() | RTTI 情報。 |
| [SortedSet](./sortedset/)(int) | 指定された容量で空のセットを作成します。 |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | 指定された等価比較子を使用する空のセットを作成します。 |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | [SortedSet](./) を列挙可能な値から作成します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | Vase 型。 |
| [ThisPtr](./thisptr/) | ポインタ型。 |
| [ThisType](./thistype/) | 自身の型です。 |
## 備考


順序付けられたオブジェクトの集合を実装します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

## 参照

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::Generic::HashSet クラス"
linktitle: "HashSet"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::HashSet クラス。C++ における HashSet クラスの前方宣言です。"
type: docs
weight: 1700
url: /ja/cpp/system.collections.generic/hashset/
---
## HashSet class


[HashSet](./) クラスの前方宣言です。

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [HashSet](./hashset/)() | RTTI 情報。 |
| [HashSet](./hashset/)(int) | 指定された容量で空のセットを作成します。 |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | 指定された等価比較子を使用する空のセットを作成します。 |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 列挙可能な値に基づく HashSet を作成します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | 基本型です。 |
| [ThisPtr](./thisptr/) | ポインタ型。 |
| [ThisType](./thistype/) | 自身の型です。 |
## 備考


ハッシュに基づくセット実装です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

## 参照

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

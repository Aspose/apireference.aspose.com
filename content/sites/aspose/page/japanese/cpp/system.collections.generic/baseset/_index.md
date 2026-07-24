---
title: "System::Collections::Generic::BaseSet クラス"
linktitle: "BaseSet"
second_title: "C++ 用 Aspose.Page"
description: "C++ で System::Collections::Generic::BaseSet クラスを使用する方法。"
type: docs
weight: 800
url: /ja/cpp/system.collections.generic/baseset/
---
## BaseSet class




```cpp
template<typename T,typename SET_T>class BaseSet : public virtual System::Object,
                                                   public System::Collections::Generic::ICollection<T>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++ 固有。 |
| [Add](./add/)(const T\&) override | 要素をセットに追加します。 |
| [begin](./begin/)() const | const 修飾されたコレクションの最初の要素へのイテレータを取得します。 |
| [cbegin](./cbegin/)() const | コレクションの最初の const 修飾要素へのイテレータを取得します。 |
| [cend](./cend/)() const | コレクションの末尾の後にある存在しない const 修飾要素のイテレータを取得します。 |
| [Clear](./clear/)() override | セット内のすべての要素を削除します。 |
| [Contains](./contains/)(const T\&) const override | セットに要素が存在するかチェックします。 |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | ハッシュの内容を既存の配列要素にコピーします。 |
| [data](./data/)() | 基礎となるデータ構造へのアクセサです。 |
| [data](./data/)() const | 基礎となるデータ構造へのアクセサです。 |
| [end](./end/)() const | const 修飾されたコレクションの末尾の後にある存在しない要素のイテレータを取得します。 |
| [get_Count](./get_count/)() const override | セット内の要素数を取得します。 |
| [GetEnumerator](./getenumerator/)() override | 列挙子を作成します。 |
| [Remove](./remove/)(const T\&) override | セットから要素を削除します。 |
| [TryAdd](./tryadd/)(const T\&) | 要素をセットに追加します。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | 実装されたインターフェイスです。 |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [IEnumerablePtr](./ienumerableptr/) | Enumerable インターフェイスへのポインタ。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) ポインタ。 |
| [iterator](./iterator/) | イテレータ型。 |
| [set_t](./set_t/) | 基礎となるデータ型。 |
| [ThisPtr](./thisptr/) | ポインタ型。 |
| [ThisType](./thistype/) | 自身の型です。 |
| [ValueType](./valuetype/) | 値型です。 |
## 参照

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

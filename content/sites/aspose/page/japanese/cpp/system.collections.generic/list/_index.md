---
title: "System::Collections::Generic::List クラス"
linktitle: "リスト"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::List クラス。C++ における List の前方宣言です。"
type: docs
weight: 3300
url: /ja/cpp/system.collections.generic/list/
---
## List class


[List](./) forward declaration.

```cpp
template<typename T>class List : public virtual System::Object,
                                 public System::Collections::Generic::IList<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<T\>) | C++ 固有。 |
| [Add](./add/)(const T\&) override | リストの末尾に要素を追加します。 |
| [AddInitializer](./addinitializer/)(int, const T *) | リストに要素を追加します。初期化子の変換時に使用されます。 |
| [AddRange](./addrange/)(IEnumerablePtr) | コレクション（または自身）からすべての要素を現在のリストの末尾に追加します。 |
| [AsReadOnly](./asreadonly/)() | このコレクションへの読み取り専用参照を取得します。 |
| [begin](./begin/)() | コレクションの最初の要素へのイテレータを取得します。 |
| [begin](./begin/)() const | const 修飾されたコレクションの最初の要素へのイテレータを取得します。 |
| [BinarySearch](./binarysearch/)(const T\&) const | ソート済みリスト内で項目を検索します。 |
| [BinarySearch](./binarysearch/)(const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | ソート済みリスト内で項目を検索します。 |
| [BinarySearch](./binarysearch/)(int, int, const T\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) const | ソート済みリスト内で項目を検索します。 |
| [cbegin](./cbegin/)() const | コレクションの最初の const 修飾要素へのイテレータを取得します。 |
| [cend](./cend/)() const | コレクションの末尾の後にある存在しない const 修飾要素のイテレータを取得します。 |
| [Clear](./clear/)() override | すべての要素を削除します。 |
| [Contains](./contains/)(const T\&) const override | リストに項目が存在するか確認します。 |
| [ConvertAll](./convertall/)(Converter\<T, OutputType\>) | 要素を別の型に変換したリストを作成します。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | リスト要素を既存の配列要素にコピーします。 |
| [CopyTo](./copyto/)(const System::ArrayPtr\<T\>\&) | すべての要素を既存の配列要素にコピーします。 |
| [CopyTo](./copyto/)(int, const System::ArrayPtr\<T\>\&, int, int) | 指定されたインデックスから始まる要素を既存の配列要素にコピーします。 |
| [crbegin](./crbegin/)() const | コレクションの最後の const 修飾要素（逆順で最初）の逆イテレータを取得します。 |
| [crend](./crend/)() const | コレクションの開始前にある存在しない const 修飾要素の逆イテレータを取得します。 |
| [data](./data/)() | 基礎となるデータ構造へのアクセス関数です。 |
| [data](./data/)() const | 基礎となるデータ構造へのアクセス関数です。 |
| [end](./end/)() | コレクションの末尾の後にある存在しない要素のイテレータを取得します。 |
| [end](./end/)() const | const 修飾されたコレクションの末尾の後にある存在しない要素のイテレータを取得します。 |
| [Exists](./exists/)(System::Predicate\<T\>) | リストに特定の述語を満たす要素が存在するかチェックします。 |
| [Find](./find/)(System::Predicate\<T\>) | 特定の述語を満たす要素を検索します。 |
| [FindAll](./findall/)(System::Predicate\<T\>) | 特定の述語を満たす要素を検索します。 |
| [FindIndex](./findindex/)(System::Predicate\<T\>) | 特定の述語を満たす要素を検索します。 |
| [FindIndex](./findindex/)(int, System::Predicate\<T\>) | 特定の述語を満たす要素を検索します。 |
| [FindIndex](./findindex/)(int, int, System::Predicate\<T\>) | 特定の述語を満たす要素を検索します。 |
| [FindLast](./findlast/)(System::Predicate\<T\>) | 特定の述語を満たす最後の要素を検索します。 |
| [ForEach](./foreach/)(System::Action\<T\>) | リスト内のすべての要素にアクションを適用します。 |
| [get_Capacity](./get_capacity/)() const | 現在のリスト容量を取得します。 |
| [get_Count](./get_count/)() const override | 現在のリストの要素数を取得します。 |
| [GetEnumerator](./getenumerator/)() override | リスト要素を反復する列挙子を取得します。 |
| [GetRange](./getrange/)(int, int) | リストのスライスを作成します。 |
| [idx_get](./idx_get/)(int) const override | 特定の位置にある要素を取得します。 |
| [idx_set](./idx_set/)(int, T) override | 特定の位置に要素を設定します。 |
| [IndexOf](./indexof/)(const T\&) const override | 特定の項目の最初のインデックスを取得します。 |
| [IndexOf](./indexof/)(const T\&, int) const | リスト内の特定の項目を検索します。 |
| [Insert](./insert/)(int, const T\&) override | 指定された位置に項目を挿入します。 |
| [InsertRange](./insertrange/)(int, IEnumerablePtr) | 特定の位置にデータ範囲を挿入します。 |
| [LastIndexOf](./lastindexof/)(const T\&) const | 指定されたオブジェクトを検索し、リスト全体で最後に出現した位置のゼロベースインデックスを返します。 |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t) const | 指定されたオブジェクトを検索し、最初の要素から指定されたインデックスまで拡張する [List](./) の要素範囲内で最後に出現した位置のゼロベースインデックスを返します。 |
| [LastIndexOf](./lastindexof/)(const T\&, int32_t, int32_t) const | 指定されたオブジェクトを検索し、指定された要素数を含み、指定されたインデックスで終了する [List](./) の要素範囲内で最後に出現した位置のゼロベースインデックスを返します。 |
| [List](./list/)() | 空のリストを作成します。 |
| [List](./list/)(int) | 事前定義された容量でリストを作成します。 |
| [List](./list/)(IEnumerablePtr) | コピーコンストラクタ。 |
| [operator[]](./operator[]/)(int) | アクセサ関数。 |
| [operator[]](./operator[]/)(int) const | アクセサ関数。 |
| [rbegin](./rbegin/)() | コレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [rbegin](./rbegin/)() const | const 修飾されたコレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [Remove](./remove/)(const T\&) override | リストから特定の項目の最初のインスタンスを削除します。 |
| [RemoveAll](./removeall/)(Predicate\<T\>) | 特定の述語に一致するすべての要素を削除します。 |
| [RemoveAt](./removeat/)(int) override | 指定された位置の項目を削除します。 |
| [RemoveRange](./removerange/)(int, int) | リストのスライスを削除します。 |
| [rend](./rend/)() | コレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [rend](./rend/)() const | const 修飾されたコレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [Reverse](./reverse/)() | リスト全体の要素順序を逆にします。 |
| [Reverse](./reverse/)(int, int) | リストスライスの要素順序を逆にします。 |
| [set_Capacity](./set_capacity/)(int) | リストの容量を設定します。 |
| [Sort](./sort/)(const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) | リスト内の要素をソートします。 |
| [Sort](./sort/)() | デフォルトの比較子を使用してリスト内の要素をソートします。 |
| [Sort](./sort/)(int, int, SharedPtr\<System::Collections::Generic::IComparer\<T\>\>) | リストスライス内の要素をソートします。 |
| [Sort](./sort/)(Comparison\<T\>, bool) | リスト内の要素をソートします。 |
| [ToArray](./toarray/)() const | リストを配列に変換します。 |
| [TrimExcess](./trimexcess/)() | リストの容量をサイズに合わせます。 |
| [TrueForAll](./trueforall/)(System::Predicate\<T\>) | コレクション内のすべての要素が指定された述語で定義された条件と一致するかどうかを判断します。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | インターフェース型です。 |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | const 逆イテレータ型。 |
| [IEnumerablePtr](./ienumerableptr/) | 同じ型の要素を保持するコンテナです。 |
| [IEnumeratorPtr](./ienumeratorptr/) | [Enumerator](./enumerator/) 型。 |
| [iterator](./iterator/) | イテレータ型。 |
| [reverse_iterator](./reverse_iterator/) | 逆イテレータ型。 |
| [ValueType](./valuetype/) | このタイプ。 |
| [vector_t](./vector_t/) | RTTI 情報。 |
## 備考


[List](./) - wrapper around std::vector to be used in translated code. Requires operator == to be impemented for element type. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // 最初のリストを作成します。
  auto list1 = MakeObject<List<int>>();

  // 最初のリストを埋めます。
  list1->Add(3);
  list1->Add(1);
  list1->Add(-5);
  list1->Add(8);

  // 最初のリストをソートします。
  // 最初のリストの項目は次のようになります: {-5, 1, 3, 8}
  list1->Sort();

  // インデックス2の項目を削除します。
  // 最初のリストの項目は次のようになります: {-5, 1, 8}
  list1->RemoveAt(2);

  // インデックス1に項目を挿入します。
  // 最初のリストの項目は次のようになります: {-5, 15, 1, 8}
  list1->Insert(1, 15);

  // 2番目のリストを作成します。
  auto list2 = MakeObject<List<int>>();

  // 2番目のリストを埋めます。
  list2->Add(10);
  list2->Add(20);
  list2->Add(30);

  // 2番目のリストから要素を最初のリストに追加します。
  list1->AddRange(list2);

  // 最初のリストの項目を出力します。
  for (const auto item: list1)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
-5 15 1 8 10 20 30
*/
```

## 参照

* Class [Object](../../system/object/)
* Class [IList](../ilist/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

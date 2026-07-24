---
title: "System::Collections::Generic::LinkedList クラス"
linktitle: "LinkedList"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::LinkedList クラス。C++ における LinkedList の前方宣言です。"
type: docs
weight: 3100
url: /ja/cpp/system.collections.generic/linkedlist/
---
## LinkedList class


[LinkedList](./) forward declaration.

```cpp
template<typename T>class LinkedList : public virtual System::Object,
                                       public System::Collections::Generic::ICollection<T>,
                                       private System::Collections::Invalidatable
```


| パラメーター | 説明 |
| --- | --- |
| T | 含まれる値の型です。 |
## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const T\&) override | リストの末尾に **element** を追加します。 |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | リストの **node** の後に **element** を追加します。 |
| [AddAfter](./addafter/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | リストの **node** の後に **newNode** を追加します。 |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const T\&) | リストの **node** の前に **element** を追加します。 |
| [AddBefore](./addbefore/)(const SharedPtr\<LinkedListNode\<T\>\>\&, const SharedPtr\<LinkedListNode\<T\>\>\&) | リストの **node** の前に **newNode** を追加します。 |
| [AddFirst](./addfirst/)(const T\&) | リストの先頭に **element** を追加します。 |
| [AddFirst](./addfirst/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | リストの先頭に **newNode** を追加します。 |
| [AddLast](./addlast/)(const T\&) | リストの末尾に **element** を追加します。 |
| [AddLast](./addlast/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | リストの末尾に **newNode** を追加します。 |
| [begin](./begin/)() | コレクションの最初の要素へのイテレータを取得します。 |
| [begin](./begin/)() const | const 修飾されたコレクションの最初の要素へのイテレータを取得します。 |
| [cbegin](./cbegin/)() const | コレクションの最初の const 修飾要素へのイテレータを取得します。 |
| [cend](./cend/)() const | コレクションの末尾の後にある存在しない const 修飾要素のイテレータを取得します。 |
| [Clear](./clear/)() override | リスト内のすべての要素を削除します。 |
| [Contains](./contains/)(const T\&) const override | リストに **element** が存在するか確認します。 |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | コンテナのデータを既存の配列要素にコピーします。 |
| [crbegin](./crbegin/)() const | コレクションの最後の const 修飾要素（逆順で最初）の逆イテレータを取得します。 |
| [crend](./crend/)() const | コレクションの開始前にある存在しない const 修飾要素の逆イテレータを取得します。 |
| [end](./end/)() | コレクションの末尾の後にある存在しない要素のイテレータを取得します。 |
| [end](./end/)() const | const 修飾されたコレクションの末尾の後にある存在しない要素のイテレータを取得します。 |
| [Find](./find/)(const T\&) const | リスト内で **element** を前方方向に検索します。 |
| [FindLast](./findlast/)(const T\&) const | リスト内で **element** を逆方向に検索します。 |
| [get_Count](./get_count/)() const override | リストの要素数を取得します。 |
| [get_First](./get_first/)() const | リストの最初の要素へのポインタを取得します。 |
| [get_Last](./get_last/)() const | リストの最後の要素へのポインタを取得します。 |
| [GetEnumerator](./getenumerator/)() override | 現在の [LinkedList](./) を反復処理する列挙子を取得します。 |
| [LinkedList](./linkedlist/)() | 空の [LinkedList](./) を作成します。 |
| [LinkedList](./linkedlist/)(const SharedPtr\<IEnumerable\<T\>\>\&) | コピーコンストラクタ。 |
| [rbegin](./rbegin/)() | コレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [rbegin](./rbegin/)() const | const 修飾されたコレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [Remove](./remove/)(const T\&) override | リストから指定された **element** の最初の出現を削除します。 |
| [Remove](./remove/)(const SharedPtr\<LinkedListNode\<T\>\>\&) | リストからノードを削除します。 |
| [RemoveFirst](./removefirst/)() | リストから最初のノードを削除します。 |
| [RemoveLast](./removelast/)() | リストから最後のノードを削除します。 |
| [rend](./rend/)() | コレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [rend](./rend/)() const | const 修飾されたコレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [const_reverse_iterator](./const_reverse_iterator/) | const 逆イテレータ型。 |
| [iterator](./iterator/) | イテレータ型。 |
| [list_t](./list_t/) | 基礎となるデータ型。 |
| [reverse_iterator](./reverse_iterator/) | 逆イテレータ型。 |
## 備考


リンクリストコンテナ。std::list のラッパーを実装しています。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。


```cpp
#include <system/collections/linkedlist.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // LinkedList クラスのインスタンスを作成します。
  auto list = MakeObject<LinkedList<int>>();

  // リンクリストにデータを入力します。
  list->AddFirst(1);
  list->AddLast(30);
  list->AddAfter(list->get_First(), 15);
  list->AddBefore(list->get_Last(), 25);

  // リンクリストの項目を出力します。
  for (const auto item: list)
  {
    std::cout << item << ' ';
  }

  return 0;
}
/*
This code example produces the following output:
1 15 25 30
*/
```

## 参照

* Class [Object](../../system/object/)
* Class [ICollection](../icollection/)
* Class [Invalidatable](../../system.collections/invalidatable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::ObjectModel::Collection クラス"
linktitle: "コレクション"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::ObjectModel::Collection クラス。ジェネリックコレクションの基本型。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.collections.objectmodel/collection/
---
## Collection class


ジェネリックコレクションの基本型。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
template<class T>class Collection : public System::Collections::Generic::IList<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## Nested classes

* Class [reverse_iterator_prototype](./reverse_iterator_prototype/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const T\&) override | コンテナに値を追加します。 |
| [Clear](./clear/)() override | すべての要素を削除します。 |
| [Collection](./collection/)() | 空のコレクションを作成します。 |
| [Collection](./collection/)(SharedPtr\<Generic::IList\<T\>\>) |  |
| [Contains](./contains/)(const T\&) const override | アイテムがコレクションに存在するか確認します。 |
| [CopyTo](./copyto/)(ArrayPtr\<T\>, int) override | コレクション要素を既存の配列要素にコピーします。 |
| [crbegin](./crbegin/)() const | コレクションの最後の const 修飾要素（逆順で最初）の逆イテレータを取得します。 |
| [crend](./crend/)() const | コレクションの開始前にある存在しない const 修飾要素の逆イテレータを取得します。 |
| [get_Count](./get_count/)() const override | 要素数を取得します。 |
| [get_Items](./get_items/)() | 内部データ構造アクセサー。 |
| [get_Items](./get_items/)() const | 内部データ構造アクセサー。 |
| [GetEnumerator](./getenumerator/)() override | コレクションを反復処理するための列挙子を取得します。 |
| [idx_get](./idx_get/)(int) const override | 指定されたインデックスの値を取得します。 |
| [idx_set](./idx_set/)(int, T) override | 指定されたインデックスに値を設定します。 |
| [IndexOf](./indexof/)(const T\&) const override | コレクション内の要素を検索します。 |
| [Insert](./insert/)(int, const T\&) override | 指定された位置に項目を挿入します。 |
| [operator[]](./operator[]/)(int) | 指定されたインデックスの値を取得します。 |
| [operator[]](./operator[]/)(int) const | 指定されたインデックスの値を取得します。 |
| [rbegin](./rbegin/)() | コレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [rbegin](./rbegin/)() const | const 修飾されたコレクションの最後の要素（逆順では最初）への逆イテレータを取得します。 |
| [Remove](./remove/)(const T\&) override | 特定の項目を削除します。 |
| [RemoveAt](./removeat/)(int) override | 指定された位置の項目を削除します。 |
| [rend](./rend/)() | コレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [rend](./rend/)() const | const 修飾されたコレクションの開始前に存在しない要素に対する逆イテレータを取得します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 格納されたポインタを弱参照にします（該当する場合）。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [const_reverse_iterator](./const_reverse_iterator/) |  |
| [reverse_iterator](./reverse_iterator/) |  |

## 参照

* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)

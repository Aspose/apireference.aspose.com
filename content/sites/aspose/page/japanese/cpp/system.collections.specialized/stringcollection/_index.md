---
title: "System::Collections::Specialized::StringCollection クラス"
linktitle: "StringCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Specialized::StringCollection クラス。文字列のインデックス付きリスト。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


文字列のインデックス付きリスト。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::String\&) | リストの末尾に値を追加します。 |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | コンテナに要素を追加します。 |
| [begin](./begin/)() | コンテナの最初の要素へのイテレータを返します。コンテナが空の場合、返されるイテレータは [end()](./end/) と等しくなります。 |
| [begin](./begin/)() const | const 修飾されたコンテナの最初の要素へのイテレータを返します。コンテナが空の場合、返されるイテレータは [end()](./end/) と等しくなります。 |
| [cbegin](./cbegin/)() const | コンテナの最初の const 修飾要素へのイテレータを返します。コンテナが空の場合、返されるイテレータは [cend()](./cend/) と等しくなります。 |
| [cend](./cend/)() const | コンテナの最後の要素の次の要素へのイテレータを返します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [Clear](./clear/)() | すべての要素を削除します。 |
| [Contains](./contains/)(const System::String\&) const | 特定の文字列がコンテナに存在するかどうかをチェックします。 |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | 既存の配列要素に要素をコピーします。 |
| [crbegin](./crbegin/)() const | 逆順コンテナの最初の要素への逆イテレータを返します。これは逆順でないコンテナの最後の要素に対応します。コンテナが空の場合、返されるイテレータは [crend()](./crend/) と等しくなります。 |
| [crend](./crend/)() const | 逆順コンテナの最後の要素の次の要素への逆イテレータを返します。これは逆順でないコンテナの最初の要素の前の要素に対応します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [data](./data/)() | 内部データ構造アクセサー。 |
| [data](./data/)() const | 内部データ構造アクセサー。 |
| [end](./end/)() | コンテナの最後の要素の次の要素へのイテレータを返します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [end](./end/)() const | const 修飾されたコンテナの最後の要素の次の要素へのイテレータを返します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [get_Count](./get_count/)() const | コレクション内の要素数を取得します。 |
| [GetEnumerator](./getenumerator/)() override | 現在のコレクションを反復する列挙子を取得します。 |
| [idx_get](./idx_get/)(int) const | 指定された位置の値を取得します。 |
| [idx_set](./idx_set/)(int, const System::String\&) | 指定された位置に値を設定します。 |
| [IndexOf](./indexof/)(const System::String\&) const | コンテナ内の特定の文字列を検索します。 |
| [Insert](./insert/)(int, const System::String\&) | コンテナに特定の値を挿入します。 |
| [operator[]](./operator[]/)(int) | アクセサ関数。 |
| [rbegin](./rbegin/)() | 逆順コンテナの最初の要素への逆イテレータを返します。これは、非逆順コンテナの最後の要素に対応します。コンテナが空の場合、返されるイテレータは [rend()](./rend/) と等しくなります。 |
| [rbegin](./rbegin/)() const | 逆順コンテナの最初の要素への逆イテレータを返します。これは、非逆順コンテナの最後の要素に対応します。コンテナが空の場合、返されるイテレータは [rend()](./rend/) と等しくなります。 |
| [Remove](./remove/)(const System::String\&) | 指定された文字列の最初の出現を削除します。 |
| [RemoveAt](./removeat/)(int) | 指定された位置の要素を削除します。 |
| [rend](./rend/)() | 逆順コンテナの最後の要素の次の要素への逆イテレータを返します。これは逆順でないコンテナの最初の要素の前の要素に対応します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [rend](./rend/)() const | 逆順コンテナの最後の要素の次の要素への逆イテレータを返します。これは逆順でないコンテナの最初の要素の前の要素に対応します。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [StringCollection](./stringcollection/)() | 空の文字列コレクションを構築します。 |
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
| [reverse_iterator](./reverse_iterator/) | 逆イテレータ型。 |
## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::Generic::BaseDictionary クラス"
linktitle: "BaseDictionary"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::BaseDictionary クラス。さまざまな辞書型データ構造（例: Dictionary、SortedDictionary）の共通コードを実装します。直接使用すべきではなく、コンテナを定義する際の継承以外では使用しません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 500
url: /ja/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


さまざまな辞書型データ構造（例: [Dictionary](../dictionary/)、[SortedDictionary](../sorteddictionary/)）の共通コードを実装します。直接使用すべきではなく、コンテナを定義する際の継承以外では使用しません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| パラメーター | 説明 |
| --- | --- |
| Map | 基礎となるマップ型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | C++ 固有。 |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | 辞書にキーと値のペアを追加します。 |
| [BaseDictionary](./basedictionary/)() | 空のデータ構造を作成します。 |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | 基礎となるマップのコンストラクタに引数を転送するフォワーディングコンストラクタです。 |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | コピーコンストラクタです。 |
| [BaseDictionary](./basedictionary/)(BaseType *) | コピーコンストラクタです。 |
| [begin](./begin/)() const | コンテナのキーと値の要素に対する KVPair ラッパーへのイテレータを返します。C# スタイルで実装されており、イテレータは get_Key() と get_Value() インターフェイスを持つ KVPair オブジェクトを返すべきです。コンテナが空の場合、返されるイテレータは [end()](../ienumerable/end/) と同等になります。 |
| [cbegin](./cbegin/)() const | コンテナの最初の要素へのイテレータを返します。STL スタイルで実装されています。コンテナが空の場合、返されるイテレータは [end()](../ienumerable/end/) と同等になります。 |
| [cend](./cend/)() const | コンテナの最後の要素の次の要素へのイテレータを返します。STL スタイルで実装されています。この要素はプレースホルダとして機能し、アクセスしようとすると未定義の動作になります。 |
| [Clear](./clear/)() override | すべての要素を削除します。 |
| [ContainsKey](./containskey/)(const key_t\&) const override | 辞書にキーが存在するかチェックします。 |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | 辞書に値が存在するかチェックします。値の比較には operator == を使用します。 |
| [data](./data/)() | 基礎となるデータストレージへのアクセサです。 |
| [data](./data/)() const | 基礎となるデータストレージへのアクセサです。 |
| [end](./end/)() const | コンテナの最後の要素に続くキーと値の要素の KVPair ラッパーへのイテレータを返します。C# スタイルで実装されており、イテレータは get_Key() と get_Value() インターフェイスを持つ KVPair オブジェクトを返すべきです。この要素はプレースホルダーとして機能し、アクセスしようとすると未定義の動作になります。 |
| [get_Count](./get_count/)() const override | 要素数を取得します。 |
| virtual [GetEnumerator](./getenumerator/)() | 列挙子インスタンスを作成します。サブクラスで実装する必要があります。 |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | 見つかった場合は値を返します。見つからない場合は **Value()** を返します。 |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | 見つかった場合は値を返します。見つからない場合は **defaultValue** を返します。 |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | 見つかった場合は値を返し、そうでない場合は **null** を返します。参照型に対してのみ意味があります。 |
| [idx_get](./idx_get/)(const key_t\&) const override | キー付き取得関数です。 |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | キー付き設定関数です。要素を変更または作成します。 |
| virtual [operator[]](./operator[]/)(const key_t\&) | アクセサ関数。 |
| [Remove](./remove/)(const key_t\&) override | 辞書から特定のキーを削除します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | キー付きの値を検索し、見つかった場合は取得します。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | 実装されたインターフェイスです。 |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [iterator](./iterator/) | イテレータ型。 |
| [KeyCollection](./keycollection/) | 基礎となるストレージ型に対して正しいアロケータを使用していることを確認してください。 |
| [KVPair](./kvpair/) | キーと値のペアの型です。 |
| [map_t](./map_t/) | 内部マップ型です。 |
| [ValueCollection](./valuecollection/) | 値のコレクションです。 |

## 参照

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

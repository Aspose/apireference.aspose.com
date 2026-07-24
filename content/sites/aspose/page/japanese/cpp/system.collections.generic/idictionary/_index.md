---
title: "System::Collections::Generic::IDictionary クラス"
linktitle: "IDictionary"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::IDictionary クラス。辞書型コンテナ用のインターフェイスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2100
url: /ja/cpp/system.collections.generic/idictionary/
---
## IDictionary class


辞書型コンテナ用のインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename TKey,typename TValue>class IDictionary : public System::Collections::Generic::ICollection<KeyValuePair<TKey, TValue>>
```


| パラメーター | 説明 |
| --- | --- |
| TKey | キーの種類です。 |
| TValue | 値型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Add](./add/)(const TKey\&, const TValue\&) | コンテナにキーと値のペアを追加します。 |
| virtual [ContainsKey](./containskey/)(const TKey\&) const | コンテナがキーを含んでいるか確認します。 |
| [CopyTo](./copyto/)(ArrayPtr\<KeyValuePair\<TKey, TValue\>\>, int) override | 辞書の内容を既存の配列要素にコピーします。 |
| virtual [get_Count](./get_count/)() const | get_Count メンバ関数の非表示を解除します。 |
| [get_IsFixedSize](./get_isfixedsize/)() const | コレクションのサイズが固定かどうかを確認します。 |
| [get_IsSynchronized](./get_issynchronized/)() const | コンテナがスレッドセーフかどうかを確認します。 |
| virtual [get_Keys](./get_keys/)() const | キーコレクションにアクセスします。 |
| virtual [get_Values](./get_values/)() const | 値コレクションにアクセスします。 |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&) const | 見つかった場合は値を返します。見つからない場合は **Value()** を返します。 |
| virtual [GetValueOrDefault](./getvalueordefault/)(const TKey\&, const TValue\&) const | 見つかった場合は値を返します。見つからない場合は **defaultValue** を返します。 |
| virtual [GetValueOrNull](./getvalueornull/)(const TKey\&) const | 見つかった場合は値を返します；それ以外は **null** を返します。参照型に対してのみ意味があります。 |
| virtual [idx_get](./idx_get/)(const TKey\&) const | ゲッタ関数。 |
| virtual [idx_set](./idx_set/)(const TKey\&, TValue) | セッタ関数。 |
| virtual [Remove](./remove/)(const TKey\&) | コンテナからキーを削除します。 |
| virtual [TryGetValue](./trygetvalue/)(const TKey\&, TValue\&) const | 値を検索し、見つかった場合は取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | RTTI 情報。 |
| [KeyValuePairType](./keyvaluepairtype/) | キーと値のペア型です。 |

## 参照

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::ObjectModel::KeyedCollection クラス"
linktitle: "KeyedCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::ObjectModel::KeyedCollection クラス。埋め込みキーを持つ要素の抽象コレクション。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.collections.objectmodel/keyedcollection/
---
## KeyedCollection class


埋め込みキーを持つ要素の抽象コレクション。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
template<typename TKey,typename TItem>class KeyedCollection : public System::Collections::ObjectModel::Collection<TItem>
```


| パラメーター | 説明 |
| --- | --- |
| TKey | キーの種類です。 |
| TItem | 値型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const TItem\&) override | コンテナの末尾に項目を追加します。 |
| [Contains](./contains/)(TKey) | キーがコンテナに存在するかチェックします。 |
| [get_Comparer](./get_comparer/)() | 比較子を取得します。 |
| [idx_get](./idx_get/)(TKey) | 特定のインデックスの項目を取得します。 |
| [Remove](./remove/)(TKey) | コンテナからキーを削除します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 特定のテンプレート引数を共有ポインタではなく弱ポインタとして扱うようにします（該当する場合）。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [defaultThreshold](./defaultthreshold/) | ルックアップ辞書作成のしきい値（デフォルト）。 |

## 参照

* Class [Collection](../collection/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)

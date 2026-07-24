---
title: "System::Collections::Generic::BaseKVCollection クラス"
linktitle: "BaseKVCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::BaseKVCollection クラス。キーまたは値のコレクション用の共通コードを保持します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 700
url: /ja/cpp/system.collections.generic/basekvcollection/
---
## BaseKVCollection class


キーまたは値のコレクション用の共通コードを保持します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename Dict,typename KV>class BaseKVCollection : public System::Collections::Generic::IKVCollection<KV>
```


| パラメーター | 説明 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 型。 |
| KV | インターフェイスが使用されるキーまたは値の型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [BaseKVCollection](./basekvcollection/)(const typename Dict::Ptr\&) | コレクションを作成します。 |
| [CopyTo](./copyto/)(ArrayPtr\<KV\>, int) override | 既存の配列要素にデータをコピーします。 |
| [get_Count](./get_count/)() const override | 要素数を取得します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | コンパイルを可能にしますが、この構造体はデータを所有しないため実際には何もしません。 |

## 参照

* Class [IKVCollection](../ikvcollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

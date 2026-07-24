---
title: "System::Collections::ObjectModel::ReadOnlyCollection class"
linktitle: "ReadOnlyCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::ObjectModel::ReadOnlyCollection クラス。特定のコンテナをラップして読み取り専用モードでアクセスできるようにします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.collections.objectmodel/readonlycollection/
---
## ReadOnlyCollection class


特定のコンテナをラップして読み取り専用モードでアクセスできるようにします。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename T>class ReadOnlyCollection : public virtual System::Object,
                                               public System::Collections::Generic::IList<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Contains](./contains/)(const T\&) const override | コンテナが特定の項目を含むかどうかを確認します。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) override | コンテナの要素を既存の配列要素にコピーします。 |
| [get_Count](./get_count/)() const override | コンテナ要素の数を取得します。 |
| [get_IsReadOnly](./get_isreadonly/)() const override | コレクションが読み取り専用かどうかを確認します。 |
| [GetEnumerator](./getenumerator/)() override | コレクションの列挙子を取得します。 |
| [idx_get](./idx_get/)(int) const override | 指定された位置の項目を取得します。 |
| [IndexOf](./indexof/)(const T\&) const override | コレクション内の特定の項目を検索します。 |
| [ReadOnlyCollection](./readonlycollection/)(const SharedPtr\<Generic::IList\<T\>\>\&) | 特定のコレクションを読み取り専用コレクションでラップします。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 読み取り専用コレクションはデータをラップするだけで何も保存しないため、何もしません。 |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 現在のコンテナの begin const イテレータの実装を取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 現在のコンテナの begin イテレータの実装を取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 現在のコンテナの end const イテレータの実装を取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 現在のコンテナの end イテレータの実装を取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) | 実装されたインターフェイスです。 |
| [IEnumeratorPtr](./ienumeratorptr/) | 同じ要素のコンテナです。 |
| [ValueType](./valuetype/) | 値型です。 |

## 参照

* Class [Object](../../system/object/)
* Class [IList](../../system.collections.generic/ilist/)
* Namespace [System::Collections::ObjectModel](../)
* Library [Aspose.Page for C++](../../)

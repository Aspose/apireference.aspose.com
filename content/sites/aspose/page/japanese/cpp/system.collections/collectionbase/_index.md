---
title: "System::Collections::CollectionBase クラス"
linktitle: "CollectionBase"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::CollectionBase クラス。C++ で強く型付けされたコレクションの抽象基底クラスを提供します。"
type: docs
weight: 300
url: /ja/cpp/system.collections/collectionbase/
---
## CollectionBase class


強く型付けされたコレクションの抽象基底クラスを提供します。

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | コレクションの要素の型 |
## Nested classes

* Class [ListImpl](./listimpl/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clear](./clear/)() | コレクションインスタンスからすべてのオブジェクトを削除します。このメソッドはオーバーライドできません。 |
| [get_Capacity](./get_capacity/)() | コレクションが保持できる要素数を返します。 |
| [get_Count](./get_count/)() | コレクションインスタンスに含まれる要素数を返します。このメソッドはオーバーライドできません。 |
| [GetEnumerator](./getenumerator/)() override | コレクションインスタンスを反復する列挙子を返します。 |
| [RemoveAt](./removeat/)(int32_t) | コレクションインスタンスの指定されたインデックスにある要素を削除します。このメソッドはオーバーライドできません。 |
| [set_Capacity](./set_capacity/)(int32_t) | コレクションが保持できる要素数を設定します。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n 番目のテンプレート引数を弱参照ポインタに設定します（共有ではなく）。コンテナ内のポインタを弱モードに切り替えることができます。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスのインスタンスへの共有ポインタのエイリアスです。 |

## 参照

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

---
title: "System::Collections::IListImplRefType クラス"
linktitle: "IListImplRefType"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::IListImplRefType クラス。System::Collections::Generic::List オブジェクト上で System::Collections::IList インターフェイスを実装するスタブで、C++ における参照型向けの実装です。"
type: docs
weight: 1100
url: /ja/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


[System::Collections::IList](../ilist/) インターフェイスを [System::Collections::Generic::List](../../system.collections.generic/list/) オブジェクト上で実装するスタブで、参照型向けの実装です。

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | リストの末尾に要素を追加します。 |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | 型参照をオブジェクトの値に変換します。 |
| [Clear](./clear/)() override | すべての要素を削除します。 |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | リストに項目が存在するか確認します。 |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) メソッドの実装 コレクション内の要素数を取得します。 |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) の実装 コレクションを反復処理する列挙子を返します。 |
| [idx_get](./idx_get/)(int, int) const override | 指定されたインデックスの要素を取得します。 |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | 新しいオブジェクトのインスタンスを作成します。 |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | コンテナ内で項目が最初に現れるインデックスを取得します。 |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | 指定位置に要素を挿入し、他の要素をシフトします。 |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | リストから特定の項目の最初のインスタンスを削除します。 |
| [RemoveAt](./removeat/)(int) override | 指定された位置の項目を削除します。 |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | オブジェクトの値を特定の型参照に変換します。 |
## 参照

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

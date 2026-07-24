---
title: "System::Collections::IListImplValueType クラス"
linktitle: "IListImplValueType"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::IListImplValueType クラス。System::Collections::IList インターフェイスを System::Collections::Generic::List オブジェクト上で実装するスタブ。C++ における値型用の実装。"
type: docs
weight: 1200
url: /ja/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


[System::Collections::IList](../ilist/) インターフェイスを [System::Collections::Generic::List](../../system.collections.generic/list/) オブジェクト上で実装するスタブ。値型用の実装。

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | リストの末尾に要素を追加します。 |
| [Clear](./clear/)() override | すべての要素を削除します。 |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | リストに項目が存在するか確認します。 |
| [get_Count](./get_count/)() const override | [ICollection.get_Count()](../icollection/get_count/) メソッドの実装 コレクション内の要素数を取得します。 |
| [GetEnumerator](./getenumerator/)() override | [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) の実装 コレクションを反復処理する列挙子を返します。 |
| [idx_get](./idx_get/)(int, int) const override | 指定されたインデックスの要素を取得します。 |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | 新しいオブジェクトのインスタンスを作成します。 |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | コンテナ内で項目が最初に現れるインデックスを取得します。 |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | 指定位置に要素を挿入し、他の要素をシフトします。 |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | リストから特定の項目の最初のインスタンスを削除します。 |
| [RemoveAt](./removeat/)(int) override | 指定された位置の項目を削除します。 |
## 参照

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

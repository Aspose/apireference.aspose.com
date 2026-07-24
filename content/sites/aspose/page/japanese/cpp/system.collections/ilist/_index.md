---
title: "System::Collections::IList クラス"
linktitle: "IList"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::IList クラス。IList は、C++ においてインデックスで個別にアクセスできる非ジェネリック オブジェクト コレクションを表します。"
type: docs
weight: 1000
url: /ja/cpp/system.collections/ilist/
---
## IList class


[IList](./) Represents a non-generic collection of objects that can be individually accessed by index.

```cpp
class IList : public virtual System::Collections::ICollection
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Add](./add/)(SharedPtr\<System::Object\>) | リストの末尾に項目を追加します。 |
| virtual [Clear](./clear/)() | リストからすべての項目を削除します。 |
| virtual [Contains](./contains/)(SharedPtr\<System::Object\>) const | 項目がリストに含まれているか確認します。 |
| virtual [get_IsFixedSize](./get_isfixedsize/)() const | リストが固定サイズかどうかを示す値を取得します。 |
| virtual [idx_get](./idx_get/)(int, int) const | RTTI 情報。 |
| virtual [IndexOf](./indexof/)(SharedPtr\<System::Object\>) const | 指定された項目の最初のインデックスを取得します。 |
| virtual [Insert](./insert/)(int, SharedPtr\<System::Object\>) | 指定されたインデックスに項目をリストへ挿入します。 |
| virtual [Remove](./remove/)(SharedPtr\<System::Object\>) | リストから指定された項目の最初のインスタンスを削除します。 |
| virtual [RemoveAt](./removeat/)(int) | 指定されたインデックスの項目をリストから削除します。 |
## 参照

* Class [ICollection](../icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)

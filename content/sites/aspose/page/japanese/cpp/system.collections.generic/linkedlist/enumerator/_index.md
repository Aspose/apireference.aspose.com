---
title: "System::Collections::Generic::LinkedList::Enumerator クラス"
linktitle: "列挙子"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::LinkedList::Enumerator クラス。C++ でリンクリストを反復処理する列挙子です。"
type: docs
weight: 3600
url: /ja/cpp/system.collections.generic/linkedlist/enumerator/
---
## Enumerator class


[Enumerator](./) to iterate through linked list.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<T>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<LinkedList\<T\>\>\&) | 列挙子を作成します。 |
| [get_Current](./get_current/)() const override | 現在の要素を取得します。 |
| [MoveNext](./movenext/)() override | 列挙子を次の要素に移動させます（存在する場合）。 |
## 参照

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../ienumerator/)
* Class [LinkedList](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)

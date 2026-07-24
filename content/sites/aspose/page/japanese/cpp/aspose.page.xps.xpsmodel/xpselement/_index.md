---
title: "Aspose::Page::XPS::XpsModel::XpsElement クラス"
linktitle: "XpsElement"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsElement クラス。C++ における共通の XPS 要素機能をカプセル化するクラス。"
type: docs
weight: 900
url: /ja/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


共通の [XPS](../../aspose.page.xps/) 要素機能をカプセル化するクラス。

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [begin](./begin/)() | コレクションの最初の要素（存在する場合）を指すイテレータを取得します。 |
| [begin](./begin/)() const | コレクションの const 修飾インスタンスの最初の要素（存在する場合）を指すイテレータを取得します。 |
| [cbegin](./cbegin/)() const | コレクションの最初の const 修飾要素（存在する場合）を指すイテレータを取得します。 |
| [cend](./cend/)() const | コレクションの最後の const 修飾要素（存在する場合）の直後を指すイテレータを取得します。 |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | コレクションの最後の要素（存在する場合）の直後を指すイテレータを取得します。 |
| [end](./end/)() const | const 修飾されたコレクションインスタンスの最後の要素（存在する場合）の直後を指すイテレータを取得します。 |
| [get_Count](./get_count/)() | 子要素の数を返します。 |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/) インターフェイスの実装です。 |
| [idx_get](./idx_get/)(int32_t) | インデックス *i* による要素の子へのアクセスを提供します。 |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | const 修飾されたコレクションインスタンスの最初の要素（存在する場合）を指すイテレータを取得します。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | コレクションの最初の要素（存在する場合）を指すイテレータを取得します。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | const 修飾されたコレクションインスタンスの最後の要素（存在する場合）の直後を指すイテレータを取得します。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | コレクションの最後の要素（存在する場合）の直後を指すイテレータを取得します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [const_iterator](./const_iterator/) | const イテレータ型。 |
| [iterator](./iterator/) | イテレータ型。 |
| [iterator_holder_type](./iterator_holder_type/) | 現在のコレクションでイテレータ型として使用されるイテレータ型を持つコレクション型です。 |
| [virtualized_iterator](./virtualized_iterator/) | 仮想化された型です。 |
| [virtualized_iterator_element](./virtualized_iterator_element/) | 仮想化された要素型です。 |
## 参照

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

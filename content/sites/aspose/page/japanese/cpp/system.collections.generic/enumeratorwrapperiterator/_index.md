---
title: "System::Collections::Generic::EnumeratorWrapperIterator クラス"
linktitle: "EnumeratorWrapperIterator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::EnumeratorWrapperIterator クラス。事前に作成された列挙子をラップし、すべての呼び出しを C++ でそれにリダイレクトするイテレータです。"
type: docs
weight: 1500
url: /ja/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


事前に作成された列挙子をラップし、すべての呼び出しをそれに転送するイテレータです。

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| パラメーター | 説明 |
| --- | --- |
| Element | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 現在のイテレータをクローンします。 |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | イテレータを一歩前に進めます。m_is_end と m_pointer を更新する必要があります。 |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | 二つのイテレータが同じ項目を指しているか確認します。 |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | デストラクタ。 |

## 参照

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

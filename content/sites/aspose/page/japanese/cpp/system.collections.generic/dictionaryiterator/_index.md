---
title: "System::Collections::Generic::DictionaryIterator クラス"
linktitle: "DictionaryIterator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::DictionaryIterator クラス。C++ で KeyValuePair 表記を提供するディクショナリイテレータです。"
type: docs
weight: 1200
url: /ja/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| パラメーター | 説明 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) クラス。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 現在のイテレータをクローンします。 |
| [DecrementIterator](./decrementiterator/)() override | イテレータを 1 ステップ後退させます。 |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | コンストラクタ。 |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | コンストラクタ。 |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | ムーブコンストラクタ。 |
| [IncrementIterator](./incrementiterator/)() override | イテレータを 1 ステップ前進させます。 |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | イテレータを指定されたステップ数だけ移動させます。 |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | デストラクタ。 |

## 参照

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

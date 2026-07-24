---
title: "System::Collections::Generic::ValueIterator クラス"
linktitle: "ValueIterator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::ValueIterator クラス。C++ で値へのアクセスを提供する Dictionary イテレータです。"
type: docs
weight: 4800
url: /ja/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
```


| パラメーター | 説明 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) クラス。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 現在のイテレータをクローンします。 |
| [DecrementIterator](./decrementiterator/)() override | イテレータを 1 ステップ後退させます。 |
| [IncrementIterator](./incrementiterator/)() override | イテレータを 1 ステップ前進させます。 |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | イテレータを指定されたステップ数だけ移動させます。 |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | コンストラクタ。 |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | コンストラクタ。 |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | ムーブコンストラクタ。 |
| virtual [~ValueIterator](./~valueiterator/)() | デストラクタ。 |

## 参照

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

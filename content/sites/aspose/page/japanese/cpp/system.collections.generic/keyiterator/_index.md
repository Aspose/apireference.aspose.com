---
title: "System::Collections::Generic::KeyIterator クラス"
linktitle: "KeyIterator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::KeyIterator クラス。C++ でキーアクセスを提供する Dictionary イテレータです。"
type: docs
weight: 2800
url: /ja/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
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
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | コンストラクタ。 |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | コンストラクタ。 |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | ムーブコンストラクタ。 |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | イテレータを指定されたステップ数だけ移動させます。 |
| virtual [~KeyIterator](./~keyiterator/)() | デストラクタ。 |

## 参照

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)

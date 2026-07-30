---
title: "System::Collections::Generic::DictionaryIterator 类"
linktitle: "DictionaryIterator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::DictionaryIterator 类。提供 C++ 中 KeyValuePair 表示法的字典迭代器。"
type: docs
weight: 1200
url: /zh/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| 参数 | 描述 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 类。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 克隆当前迭代器。 |
| [DecrementIterator](./decrementiterator/)() override | 将迭代器向后移动一步。 |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | 构造函数。 |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | 构造函数。 |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | 移动构造函数。 |
| [IncrementIterator](./incrementiterator/)() override | 将迭代器向前移动一步。 |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | 将迭代器按指定的步数移动。 |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | 析构函数。 |

## 另见

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

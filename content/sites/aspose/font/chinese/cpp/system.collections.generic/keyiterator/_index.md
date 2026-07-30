---
title: "System::Collections::Generic::KeyIterator 类"
linktitle: "KeyIterator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::KeyIterator 类。提供键访问的字典迭代器，适用于 C++。"
type: docs
weight: 2800
url: /zh/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
```


| 参数 | 描述 |
| --- | --- |
| Dict | [Dictionary](../dictionary/) 类。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 克隆当前迭代器。 |
| [DecrementIterator](./decrementiterator/)() override | 将迭代器向后移动一步。 |
| [IncrementIterator](./incrementiterator/)() override | 将迭代器向前移动一步。 |
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | 构造函数。 |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | 构造函数。 |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | 移动构造函数。 |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | 将迭代器按指定的步数移动。 |
| virtual [~KeyIterator](./~keyiterator/)() | 析构函数。 |

## 另见

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

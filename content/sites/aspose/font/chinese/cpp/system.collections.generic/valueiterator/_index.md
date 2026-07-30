---
title: "System::Collections::Generic::ValueIterator 类"
linktitle: "ValueIterator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::ValueIterator 类。提供在 C++ 中访问值的字典迭代器。"
type: docs
weight: 4800
url: /zh/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
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
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | 将迭代器按指定的步数移动。 |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | 构造函数。 |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | 构造函数。 |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | 移动构造函数。 |
| virtual [~ValueIterator](./~valueiterator/)() | 析构函数。 |

## 另见

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

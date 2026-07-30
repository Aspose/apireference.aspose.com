---
title: "System::Collections::Generic::EnumeratorWrapperIterator 类"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator 类。该迭代器包装预先创建的枚举器，并在 C++ 中将所有调用重定向到它。"
type: docs
weight: 1500
url: /zh/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


包装预先创建的枚举器并将所有调用重定向到其中的迭代器。

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| 参数 | 描述 |
| --- | --- |
| Element | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 克隆当前迭代器。 |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | 将迭代器向前移动一步。必须更新 m_is_end 和 m_pointer。 |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | 检查两个迭代器是否指向同一项。 |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | 析构函数。 |

## 另见

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)

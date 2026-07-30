---
title: "System::ReadOnlySpan 类"
linktitle: "ReadOnlySpan"
second_title: "Aspose.Font 适用于 C++"
description: "System::ReadOnlySpan 类。用于在 C++ 中的 Span 类内部转发使用。"
type: docs
weight: 5300
url: /zh/cpp/system/readonlyspan/
---
## ReadOnlySpan class


用于在 [Span](../span/) 类内部转发使用。

```cpp
template<typename T>class ReadOnlySpan : public System::Details::SpanCore<const T, ReadOnlySpan<T>, Span<T>>
```


| 参数 | 描述 |
| --- | --- |
| T | span 中元素的类型。此类提供了一种类型安全的方式，以只读方式处理对象的连续序列。它可用于包装数组、栈数组或原始指针，同时保持边界检查。[ReadOnlySpan](./) 并不拥有它指向的内存——它只是对现有内存的视图。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [ReadOnlySpan](./readonlyspan/)(const Span\<T\>\&) | 从常规 span 构造只读 span。 |
| static [to_ReadOnlySpan](./to_readonlyspan/)(const typename BaseType::ArrayPtrT\&) | 将数组转换为 [ReadOnlySpan](./)。 |
## 备注


表示任意内存的只读连续区域。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

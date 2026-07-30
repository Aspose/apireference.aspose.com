---
title: "System::Span 类"
linktitle: "Span"
second_title: "Aspose.Font 适用于 C++"
description: "System::Span 类。表示一段连续的任意内存区域，类似于 C++20 的 std::span。"
type: docs
weight: 5700
url: /zh/cpp/system/span/
---
## Span class


表示类似于 C++20 的 std::span 的任意内存的连续区域。

```cpp
template<typename T>class Span : public System::Details::SpanCore<T, Span<T>, Span<T>>
```


| 参数 | 描述 |
| --- | --- |
| T | span 中元素的类型。此类提供了一种类型安全的方式来处理连续的对象序列。它可用于包装数组、栈数组或原始指针，同时保持边界检查。[Span](./) 并不拥有它指向的内存——它只是对现有内存的视图。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Clear](./clear/)() const | 通过将所有元素设置为默认值来清除 span 的内容。 |
| [Fill](./fill/)(const T\&) const | 使用指定的值填充 span。 |
| static [to_Span](./to_span/)(const typename BaseType::ArrayPtrT\&) | 将数组转换为 [Span](./)。 |

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)

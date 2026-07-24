---
title: "Aspose::Page::XPS::XpsModel::XpsElement 类"
linktitle: "XpsElement"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsElement 类。封装通用 XPS 元素特性的类（C++）。"
type: docs
weight: 900
url: /zh/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


封装通用 [XPS](../../aspose.page.xps/) 元素特性的类。

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [begin](./begin/)() | 获取指向集合中第一个元素（如果有）的迭代器。 |
| [begin](./begin/)() const | 获取指向集合的 const 限定实例中第一个元素（如果有）的迭代器。 |
| [cbegin](./cbegin/)() const | 获取指向集合中第一个 const 限定元素（如果有）的迭代器。 |
| [cend](./cend/)() const | 获取指向集合中最后一个 const 限定元素之后的迭代器（如果有）。 |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | 获取指向集合中最后一个元素（如果有）之后的位置的迭代器。 |
| [end](./end/)() const | 获取指向集合的 const 限定实例中最后一个元素（如果有）之后的位置的迭代器。 |
| [get_Count](./get_count/)() | 返回子元素的数量。 |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | 实现 [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/) 接口。 |
| [idx_get](./idx_get/)(int32_t) | 提供通过索引 *i* 访问元素子项的功能。 |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 获取指向集合的 const 限定实例中第一个元素（如果有）的位置的迭代器。 |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 获取指向集合中第一个元素（如果有）的迭代器。 |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 获取指向集合的 const 限定实例中最后一个元素（如果有）之后的位置的迭代器。 |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 获取指向集合中最后一个元素（如果有）之后的位置的迭代器。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [const_iterator](./const_iterator/) | 常量迭代器类型。 |
| [iterator](./iterator/) | 迭代器类型。 |
| [iterator_holder_type](./iterator_holder_type/) | 一种集合类型，其迭代器类型在当前集合中用作迭代器类型。 |
| [virtualized_iterator](./virtualized_iterator/) | 虚拟化类型。 |
| [virtualized_iterator_element](./virtualized_iterator_element/) | 虚拟化元素类型。 |
## 另见

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

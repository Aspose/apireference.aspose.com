---
title: "Aspose::Page::XPS::XpsModel::XpsArray 类"
linktitle: "XpsArray"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsModel::XpsArray 类。C++ 中封装通用 XPS 模型数组对象特性的类。"
type: docs
weight: 300
url: /zh/cpp/aspose.page.xps.xpsmodel/xpsarray/
---
## XpsArray class


封装通用 [XPS](../../aspose.page.xps/) 模型数组对象特性的类。

```cpp
template<typename T>class XpsArray : public Aspose::Page::XPS::XpsModel::XpsObject
```


| Parameter | 描述 |
| --- | --- |
| T | 数组元素的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(T) | 向数组中添加新对象。 |
| [get_Count](./get_count/)() | 返回元素数量。 |
| [idx_get](./idx_get/)(int32_t) | 通过索引 *i* 提供对数组元素的访问。 |
| [Insert](./insert/)(int32_t, T) | 在指定位置向数组插入新对象。 |
| [Remove](./remove/)(T) | 从数组中移除对象。 |
| [RemoveAt](./removeat/)(int32_t) | 在指定位置从数组中移除对象。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而非共享指针）。允许在容器中将指针切换为弱模式。 |

## 另见

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)

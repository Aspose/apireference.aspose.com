---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class"
linktitle: "BeforeSavingEventArgs"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class. 在 C++ 中，定义了各种保存前事件参数的基类。"
type: docs
weight: 200
url: /zh/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


定义各种保存前事件参数的基类。

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| Parameter | 描述 |
| --- | --- |
| T | 修改 API 类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | 在 [XPS](../../aspose.page.xps/) 包中，所有文档的当前绝对页码。 |
| [get_DocumentNumber](./get_documentnumber/)() const | 在 [XPS](../../aspose.page.xps/) 包中，当前文档的编号。 |
| [get_ElementAPI](./get_elementapi/)() const | 获取即将保存的元素的修改 API。 |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | 当前输出编号。如果指定了 **PageNumbers** 保存选项，则它与 **AbsolutePageNumber** 不同。 |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | 在 [XPS](../../aspose.page.xps/) 包中，相对于当前文档的当前页码。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而非共享指针）。允许在容器中将指针切换为弱模式。 |

## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)

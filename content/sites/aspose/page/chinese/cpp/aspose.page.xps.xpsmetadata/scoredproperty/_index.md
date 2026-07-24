---
title: "Aspose::Page::XPS::XpsMetadata::ScoredProperty 类"
linktitle: "ScoredProperty"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::ScoredProperty 类。实现通用 PrintTicketScoredProperty 的类。所有模式定义的计分属性的基类。ScoredProperty 元素声明了对 Option 定义本质上的属性。在评估请求的 Option 与设备支持的 Option 匹配程度时，应比较此类属性。C++ 中。"
type: docs
weight: 14600
url: /zh/cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


实现通用 [PrintTicket](../printticket/)**[ScoredProperty](./)** 的类。所有模式定义的计分属性的基类。**[ScoredProperty](./)** 元素声明了对 [Option](../option/) 定义本质上的属性。在评估请求的 [Option](../option/) 与设备支持的 [Option](../option/) 匹配程度时，应比较此类属性。[https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty)。

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | 创建一个新实例。 |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)

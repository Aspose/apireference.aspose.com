---
title: "Aspose::Page::XPS::XpsMetadata::Property 类"
linktitle: "属性"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::Property 类。实现通用 PrintTicketProperty 的类。所有模式定义属性的基类。一个 Property 元素声明设备、作业格式或其他相关属性，其名称由 name 属性提供。一个 Value 元素用于为 Property 分配值。Property 可以是复杂的，可能包含多个子属性。子属性也由 Property 元素表示。在 C++ 中。"
type: docs
weight: 14300
url: /zh/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


实现通用 [PrintTicket](../printticket/)**[Property](./)** 的类。所有模式定义属性的基类。一个 **[Property](./)** 元素声明设备、作业格式或其他相关属性，其名称由 name 属性提供。一个 [Value](../value/) 元素用于为 **[Property](./)** 分配值。**[Property](./)** 可以是复杂的，可能包含多个子属性。子属性也由 **[Property](./)** 元素表示。[https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property)。

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | 创建一个新实例。 |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | 创建一个新实例。 |
## 另见

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)

---
title: "Aspose::Page::XPS::XpsMetadata::Option 类"
linktitle: "Option"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::Option 类。实现通用 PrintTicketOption 的类。所有模式定义选项的基类。Option 元素包含与此选项关联的所有 Property 和 ScoredProperty 元素。 在 C++ 中。"
type: docs
weight: 7600
url: /zh/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


实现通用 [PrintTicket](../printticket/)**[Option](./)** 的类。所有模式定义选项的基类。[Option](./) 元素包含与此选项关联的所有 [Property](../property/) 和 [ScoredProperty](../scoredproperty/) 元素。[https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option)。

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | 向此选项的项目列表末尾添加一系列项目。每个项目必须是 [ScoredProperty](../scoredproperty/) 或 [Property](../property/) 实例。 |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | 创建一个新的 [PrintTicket](../printticket/) 选项实例。 |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | 创建一个新的 [PrintTicket](../printticket/) 选项实例。 |
| [Option](./option/)(System::SharedPtr\<Option\>) | 创建一个克隆选项实例。 |
## 另见

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)

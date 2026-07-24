---
title: "Aspose::Page::XPS::XpsMetadata::Feature 类"
linktitle: "特性"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::Feature 类。封装通用打印模式特性的类。所有模式定义特性的基类。Feature 元素包含完整的 Option 和 Property 元素列表，完整描述设备属性、作业格式设置或其他相关特征。C++ 中。"
type: docs
weight: 2900
url: /zh/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


封装通用打印模式特性的类。所有模式定义特性的基类。一个 **[Feature](./)** 元素包含完整的 [Option](../option/) 和 [Property](../property/) 元素列表，这些元素完整描述设备属性、作业格式设置或其他相关特性。[https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature)。

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | 向此特性的项目列表末尾添加一组项目。每个项目必须是 [Feature](./)、[Option](../option/) 或 [Property](../property/) 实例。 |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | 创建一个新的 [PrintTicket](../printticket/) 特性实例。 |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | 创建一个新的 [PrintTicket](../printticket/) 特性实例。 |
## 另见

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)

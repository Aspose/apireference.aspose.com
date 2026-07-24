---
title: "Aspose::Page::AssemblyConstants 类"
linktitle: "AssemblyConstants"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::AssemblyConstants 类。定义参与组件许可证检查的常量。这些常量过去直接定义为程序集属性，但我将它们移到单独的类中，因为在 .NET Compact Framework 中无法访问程序集属性。现在针对 .NET Compact Framework 编译的许可证代码在 C++ 中使用这些常量代替程序集属性。"
type: docs
weight: 100
url: /zh/cpp/aspose.page/assemblyconstants/
---
## AssemblyConstants class


定义参与组件许可证检查的常量。这些常量过去直接定义为程序集属性，但我将它们移入单独的类，因为在 .NET Compact Framework 中无法访问程序集属性。现在，在为 .NET Compact Framework 编译时，许可证代码使用这些常量而不是程序集属性。

```cpp
class AssemblyConstants : public System::Object
```

## 字段

| 字段 | 描述 |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Producer](./producer/) | 输出文档的生成者。 |
| static [PRODUCT](./product/) |  |
| static [Product](./product/) | 这用于 **Aspose** 许可代码来验证许可证是否针对正确的产品。 |
| static [Product2](./product2/) | 这用于 **Aspose** 许可代码来验证许可证是否针对正确的产品。暂时 **Aspose.EPS** 许可证也将对 [Aspose.Page](../) 有效。 |
| static [Product3](./product3/) | 这用于 **Aspose** 许可代码来验证许可证是否针对正确的产品。暂时 Aspose.XPS 许可证也将对 [Aspose.Page](../) 有效。 |
| static [ReleaseDate](./releasedate/) | 这用于 **Aspose** 许可代码检查订阅是否到期。您需要将其设置为发布版本或热修复的日期。 |
| static [Title](./title/) |  |
| static [VERSION](./version/) |  |
| static [Version](./version/) | 程序集的版本。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)

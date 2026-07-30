---
title: "Aspose::Font::AssemblyConstants 类"
linktitle: "AssemblyConstants"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::AssemblyConstants 类。定义了参与组件许可证检查的常量。这些常量以前直接定义为程序集属性，但我将它们移入单独的类，因为在 .NET Compact Framework 中无法访问程序集属性。现在，针对 .NET Compact Framework 编译的授权代码使用这些常量，而不是 C++ 中的程序集属性。"
type: docs
weight: 100
url: /zh/cpp/aspose.font/assemblyconstants/
---
## AssemblyConstants class


定义参与组件许可证检查的常量。这些常量以前直接定义为程序集属性，但我将它们移到单独的类中，因为在 .NET Compact Framework 中无法访问程序集属性。现在，在为 .NET Compact Framework 编译时，许可代码使用这些常量而不是程序集属性。

```cpp
class AssemblyConstants
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [AssemblyConstants](./assemblyconstants/)() |  |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [Family](./family/) |  |
| static [Platform](./platform/) |  |
| static [Product](./product/) | 此用于 **Aspose** 许可代码来验证许可证是否适用于正确的产品。 |
| static [ReleaseDate](./releasedate/) | 此用于 **Aspose** 许可代码来检查订阅是否到期。您需要将其设置为发布版本或热修复的日期。 |
| static [Title](./title/) |  |
| static [Version](./version/) | 程序集的版本。 |
## 另见

* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)

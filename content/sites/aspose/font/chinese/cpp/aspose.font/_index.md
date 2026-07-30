---
title: "Aspose::Font 命名空间"
linktitle: "Aspose::Font"
second_title: "Aspose.Font 适用于 C++"
description: "如何在 C++ 中使用 Aspose::Font 命名空间。"
type: docs
weight: 100
url: /zh/cpp/aspose.font/
---



## 类

| 类 | 描述 |
| --- | --- |
| [AssemblyConstants](./assemblyconstants/) | 定义参与组件许可证检查的常量。这些常量以前直接定义为程序集属性，但我将它们移到单独的类中，因为在 .NET Compact Framework 中无法访问程序集属性。现在，在为 .NET Compact Framework 编译时，许可代码使用这些常量而不是程序集属性。 |
| [BuildVersionInfo](./buildversioninfo/) | 提供有关当前产品名称和版本的信息。 |
| [CryptoProvider](./cryptoprovider/) |  |
| [Font](./font/) | 表示基础 [Font](./font/) 类。 |
| [FontBBox](./fontbbox/) | 表示 [Font](./font/) 边界框 (BBox)。 |
| [FontEnvironment](./fontenvironment/) | 提供有关当前环境和平台的信息。 |
| [FontFactory](./fontfactory/) | 包含打开不同类型字体的功能以及用于创建各种对象的其他方法。 |
| [FontMetrics](./fontmetrics/) | 表示 [Font](./font/) 度量。 |
| [ICallbackOperationParams](./icallbackoperationparams/) | 设计用于在使用 [ICallbackStartEndOperations](./icallbackstartendoperations/) 接口的场景中保存不同的参数。 |
| [ICallbackStartEndOperations](./icallbackstartendoperations/) | 设计用于在需要在方法开始前和结束后执行某些逻辑的场景中使用。需要由必须继承 [ICallbackOperationParams](./icallbackoperationparams/) 接口的类来定义 [StartCallbackOperation(ICallbackOperationParams)](../) 和 [EndCallbackOperation(ICallbackOperationParams)](../) 的参数。 |
| [IEncodingParameters](./iencodingparameters/) | [Common](../aspose.font.common/) 接口用于支持编码参数。某些 [Font](./font/) 类型可以拥有多种编码算法/映射。因此，应使用此接口来创建具体的字体编码参数。 |
| [IFont](./ifont/) | 声明所有字体格式的通用功能。由 [Font](./font/) 类实现。 |
| [IFontDefinitionParser](./ifontdefinitionparser/) | [Common](../aspose.font.common/) 接口用于字体文件解析器。 |
| [IFontEncoding](./ifontencoding/) | 定义用于 [Font](./font/) 编码的接口。 |
| [IFontEnvironmentSettings](./ifontenvironmentsettings/) | 表示与设置相关的功能，这些设置对所有字体通用，由当前会话中 [Aspose.Font](./) 库创建。 |
| [IFontMetrics](./ifontmetrics/) | 定义用于 [Font](./font/) 度量工具的接口。 |
| [IFontRendering](./ifontrendering/) | 表示一个 [Font](./font/)。 |
| [IFontSaver](./ifontsaver/) | 定义用于 [Font](./font/) 保存功能的接口。 |
| [IFontSource](./ifontsource/) | 表示字体来源，通常是字体集合，例如：ttc 文件、文件夹等。 |
| [IFontSubset](./ifontsubset/) | 表示字体子集接口。 |
| [IStreamFontParser](./istreamfontparser/) | 设计用于基于由 Stream 对象提供的流字节解析字体。 |
| [ISupportsNameAddressing](./isupportsnameaddressing/) | 定义特定于支持字形名称寻址的编码的成员。 |
| [IUnicodeList](./iunicodelist/) | 表示 Unicode 列表。 |
| [License](./license/) | 提供对组件授权的方法。 |
| [Metered](./metered/) | 提供设置计量密钥的方法。 |
| [MeteredBillingService](./meteredbillingservice/) | 此内部类用于处理客户的计量状态。 |
| [MeteredCountService](./meteredcountservice/) | 此内部类用于处理客户的消耗数据，单位为 MB。 |
| [MultiLanguageString](./multilanguagestring/) | 表示多语言字符串。 |
| [NameToCodeMap](./nametocodemap/) | 表示名称到代码的映射。 |
| [TransformationMatrix](./transformationmatrix/) | Represents 3x3 transformation matrix | A B 0 |  | C D 0 |  | TX TY 1 | . |
## Enums

| 枚举 | 描述 |
| --- | --- |
| [EditionType](./editiontype/) | 指定许可证的版本类型。 |
| [FontSavingFormats](./fontsavingformats/) | 指定 [Font](./font/) 类型。 |
| [FontStyle](./fontstyle/) | 指定 [Font](./font/) 样式。 |
| [FontType](./fonttype/) | 指定 [Font](./font/) 类型。 |
| [LicenseState](./licensestate/) | 表示可能的许可证状态。 |
| [MeteredState](./meteredstate/) | 表示可能的计量状态。 |
## Functions

| 函数 | 描述 |
| --- | --- |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator!= | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |
| operator== | System.Collections.Generic.List`1[Doxygen2HugoConverter.Markup.SimpleMarkupEntry] |

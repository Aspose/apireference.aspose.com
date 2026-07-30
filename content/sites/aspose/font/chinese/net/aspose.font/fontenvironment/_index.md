---
title: "类 FontEnvironment"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.FontEnvironment 类。提供有关当前环境和平台的信息"
type: docs
weight: 290
url: /zh/net/aspose.font/fontenvironment/
---
## FontEnvironment class

提供有关当前环境和平台的信息。

```csharp
public class FontEnvironment
```

## 属性

| 名称 | 描述 |
| --- | --- |
| static [Current](../../aspose.font/fontenvironment/current/) { get; } | 获取当前环境。 |
| [CurrentPlatformId](../../aspose.font/fontenvironment/currentplatformid/) { get; } | 获取当前平台 ID。 |
| [FontSpecificEncodings](../../aspose.font/fontenvironment/fontspecificencodings/) { get; } | 为面向消费者的字体存储特定编码。例如，PDF 文档使用 Adobe Symbol 和 ZapfDingbats 特定编码。 |
| [Strictness](../../aspose.font/fontenvironment/strictness/) { get; set; } | 某些字体可能包含意外数据、未指定的特性，或可能被粗略裁剪。建议容错设置，以便消费者在不考虑字体可能不足的情况下打开任何字体。字体内部结构不保证一致。建议严格设置，以便消费者打开大多数有效且稳固的字体。 |
| static [CffCommonFontsSettings](../../aspose.font/fontenvironment/cffcommonfontssettings/) { get; } | CFF 字体的通用设置。 |

### 另见

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)



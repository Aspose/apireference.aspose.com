---
title: Class FontEnvironment
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.FontEnvironment class. Provides information about the current environment and platform
type: docs
weight: 270
url: /net/aspose.font/fontenvironment/
---
## FontEnvironment class

Provides information about the current environment and platform.

```csharp
public class FontEnvironment
```

## Properties

| Name | Description |
| --- | --- |
| static [Current](../../aspose.font/fontenvironment/current/) { get; } | Gets current environment. |
| [CurrentPlatformId](../../aspose.font/fontenvironment/currentplatformid/) { get; } | Gets current platform id. |
| [FontSpecificEncodings](../../aspose.font/fontenvironment/fontspecificencodings/) { get; } | Stores specific encodings for consumer-aware Fonts. For example, PDF documents uses Adobe Symbol and ZapfDingbats specific encodings. |
| [Strictness](../../aspose.font/fontenvironment/strictness/) { get; set; } | Some Fonts may contain unexpected data, non-specified features, or may be roughly cropped. Tolerant setting is recommended for consumers who want to open any font regardless possible Font's inadequacy. Font internal structures are not guaranteed to be consistent. Strict setting is recommended for consumers who want to open mostly valid and solid Fonts. |
| static [CffCommonFontsSettings](../../aspose.font/fontenvironment/cffcommonfontssettings/) { get; } | Settings common to CFF fonts. |

### See Also

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)



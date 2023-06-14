---
title: Class Version16Dot16
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.TtfCommon.Version16Dot16 class. Reresents Version16Dot16 datatype
type: docs
weight: 780
url: /net/aspose.font.ttfcommon/version16dot16/
---
## Version16Dot16 class

Reresents Version16Dot16 datatype

```csharp
public class Version16Dot16 : ICloneable
```

## Constructors

| Name | Description |
| --- | --- |
| [Version16Dot16](version16dot16/#constructor)() | Constructor |
| [Version16Dot16](version16dot16/#constructor_1)(ushort, ushort) | Constructor |

## Properties

| Name | Description |
| --- | --- |
| [MajorNumber](../../aspose.font.ttfcommon/version16dot16/majornumber/) { get; set; } | Gets or sets major version number. Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: {0, 0, 80, 0}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object `Version16Dot16` will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000. |
| [MinorNumber](../../aspose.font.ttfcommon/version16dot16/minornumber/) { get; set; } | Gets or sets minor version number Value has sense only in hexademical notation, for example version 0.5 for 'maxp' in actual font files is 4 bytes: {0, 0, 80, 0}, what has hexademical representation 0x00005000. After reading this version from font file, Major and minor numbers for object `Version16Dot16` will be 0 and 20480 respectively. And these values in hexademical form are 0x0000 and 0x5000. |
| [RawBytes](../../aspose.font.ttfcommon/version16dot16/rawbytes/) { get; } | Gets all raw bits for Version16Dot16 version number as byte array with size 4 bytes. |

## Methods

| Name | Description |
| --- | --- |
| virtual [Clone](../../aspose.font.ttfcommon/version16dot16/clone/)() | Create a copy of `Version16Dot16` object. |
| override [ToString](../../aspose.font.ttfcommon/version16dot16/tostring/)() | Return version value as a formated string For example "0.5", "1.1", "3.0" etc. |

### See Also

* namespace [Aspose.Font.TtfCommon](../../aspose.font.ttfcommon/)
* assembly [Aspose.Font](../../)



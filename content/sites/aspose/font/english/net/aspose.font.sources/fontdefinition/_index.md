---
title: Class FontDefinition
second_title: Aspose.Font for .NET API Reference
description: Aspose.Font.Sources.FontDefinition class. Represents Font file set definition. This class contains fields which are not related to font internal data. These fields describe font placement and another data needed to load font from some font sourcefile memory etc
type: docs
weight: 620
url: /net/aspose.font.sources/fontdefinition/
---
## FontDefinition class

Represents Font file set definition. This class contains fields which are not related to font internal data. These fields describe font placement and another data needed to load font from some font source(file, memory, etc).

```csharp
public class FontDefinition
```

## Constructors

| Name | Description |
| --- | --- |
| [FontDefinition](fontdefinition/#constructor)(FontType, FontFileDefinition) | Creates single-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_1)(FontType, FontFileDefinition[]) | Creates multi-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_2)(FontType, StreamSource) | Creates single-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_3)(FontType, string, StreamSource) | Creates single-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_6)(string, FontType, FontFileDefinition) | Creates single-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_4)(MultiLanguageString, MultiLanguageString, FontType, FontFileDefinition) | Creates multi-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_5)(MultiLanguageString, MultiLanguageString, FontType, FontFileDefinition[]) | Creates multi-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_7)(string, FontType, string, StreamSource) | Creates single-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_8)(string, string, FontType, FontFileDefinition) | Creates single-file Font definition. |
| [FontDefinition](fontdefinition/#constructor_9)(string, string, FontType, FontFileDefinition[]) | Creates multi-file Font definition. |

## Properties

| Name | Description |
| --- | --- |
| [FileDefinitions](../../aspose.font.sources/fontdefinition/filedefinitions/) { get; } | Gets file definitions collection. |
| virtual [FontName](../../aspose.font.sources/fontdefinition/fontname/) { get; } | Returns Font name. |
| virtual [FontNames](../../aspose.font.sources/fontdefinition/fontnames/) { get; } | Gets Font names as a [`MultiLanguageString`](../../aspose.font/multilanguagestring/). |
| [FontType](../../aspose.font.sources/fontdefinition/fonttype/) { get; } | Gets Font type. |
| virtual [PostscriptName](../../aspose.font.sources/fontdefinition/postscriptname/) { get; } | Gets postscript Font name. |
| [PostscriptNames](../../aspose.font.sources/fontdefinition/postscriptnames/) { get; } | Gets postscript Font names as a [`MultiLanguageString`](../../aspose.font/multilanguagestring/). |

## Methods

| Name | Description |
| --- | --- |
| static [Open](../../aspose.font.sources/fontdefinition/open/#open)(StreamSource, FontType) | Returns FontDefinition for font stream source and font type. |
| static [Open](../../aspose.font.sources/fontdefinition/open/#open_1)(string, FontType) | Returns FontDefinition for font file and font type. |

### See Also

* namespace [Aspose.Font.Sources](../../aspose.font.sources/)
* assembly [Aspose.Font](../../)



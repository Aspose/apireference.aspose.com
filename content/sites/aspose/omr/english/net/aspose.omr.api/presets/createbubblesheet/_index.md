---
title: CreateBubbleSheet
second_title: Aspose.OMR for .NET API Reference
description: Generates a simple bubble sheet with an optional title.
type: docs
weight: 10
url: /net/aspose.omr.api/presets/createbubblesheet/
---
## Presets.CreateBubbleSheet method

Generates a simple bubble sheet with an optional title.

```csharp
public static void CreateBubbleSheet(string fullPath, int elementsCount, int columns, 
    int answersCount, string title = null, BubbleType bubbleType = BubbleType.Round, 
    BubbleSize bubbleSize = BubbleSize.Normal, GlobalPageSettings settings = null)
```

| Parameter | Type | Description |
| --- | --- | --- |
| fullPath | String | Relative or absolute path to the generated form image. |
| elementsCount | Int32 | The total number of questions in the supplemental assessment. |
| columns | Int32 | The number of columns to arrange questions into. Use multiple columns to make the sheet more compact. |
| answersCount | Int32 | The total number of bubbles (answers) for each question. |
| title | String | Optional title of the bubble sheet. |
| bubbleType | BubbleType | Bubble style (optional). |
| bubbleSize | BubbleSize | Size of bubbles (optional). |
| settings | GlobalPageSettings | Optional page layout settings. |

### Examples

```csharp
var settings = new GlobalPageSettings() { PaperSize = PaperSize.Letter }
Presets.CreateBubbleSheet("bubble_sheet.png", 100, 3, 5, "100 Questions", BubbleType.Square, BubbleSize.ExtraLarge, settings);
```

### See Also

* enum [BubbleType](../../../aspose.omr.generation.config.enums/bubbletype)
* enum [BubbleSize](../../../aspose.omr.generation/bubblesize)
* class [GlobalPageSettings](../../../aspose.omr.generation/globalpagesettings)
* class [Presets](../../presets)
* namespace [Aspose.OMR.Api](../../presets)
* assembly [Aspose.OMR](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.OMR.dll -->

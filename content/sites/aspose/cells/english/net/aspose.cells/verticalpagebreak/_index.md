---
title: Class VerticalPageBreak
second_title: Aspose.Cells for .NET API Reference
description: Aspose.Cells.VerticalPageBreak class. Encapsulates the object that represents a vertical page break
type: docs
url: /net/aspose.cells/verticalpagebreak/
---
## VerticalPageBreak class

Encapsulates the object that represents a vertical page break.

```csharp
public class VerticalPageBreak
```

## Properties

| Name | Description |
| --- | --- |
| [Column](../../aspose.cells/verticalpagebreak/column/) { get; } | Gets the column index of the vertical page break. |
| [EndRow](../../aspose.cells/verticalpagebreak/endrow/) { get; } | Gets the end row index of the vertical page break. |
| [StartRow](../../aspose.cells/verticalpagebreak/startrow/) { get; } | Gets the start row index of the vertical page break. |

### Examples

```csharp
[C#]
Workbook excel = new Workbook();
//Add a pagebreak at G5
excel.Worksheets[0].HorizontalPageBreaks.Add("G5");
excel.Worksheets[0].VerticalPageBreaks.Add("G5");

[VB]
Dim excel as Workbook = new Workbook()
'Add a pagebreak at G5
excel.Worksheets(0).HorizontalPageBreaks.Add("G5")
excel.Worksheets(0).VerticalPageBreaks.Add("G5")
```

### See Also

* namespace [Aspose.Cells](../../aspose.cells/)
* assembly [Aspose.Cells](../../)



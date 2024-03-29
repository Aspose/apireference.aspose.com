---
title: GetFont
second_title: Aspose.Cells för .NET API-referens
description: Hämtar celltypsnitt. När du ändrar teckensnitt bör du anropa SetFont-metoden för att ställa in teckensnitt till cell.
type: docs
weight: 250
url: /sv/net/aspose.cells.griddesktop.data/gridcell/getfont/
---
## GridCell.GetFont method

Hämtar celltypsnitt. När du ändrar teckensnitt bör du anropa "SetFont"-metoden, för att ställa in teckensnitt till cell.

```csharp
public Font GetFont()
```

### Returvärde

returnera kopia av cellteckensnitt.

### Exempel

```csharp
[C#]
GridCell cell = gridDesktop1.GetActiveWorksheet().Cells[0, 0];
Font font = new Font("Courier New", 8, FontStyle.Italic);
cell.SetFont(font);
Color color = cell.GetFontColor();
color = Color.Black;
cell.SetFontColor(color);

[Visual Basic]
Dim cell As GridCell =  gridDesktop1.GetActiveWorksheet().Cells(0, 0) 
Dim font As Font =  New Font("Courier New",8,FontStyle.Italic) 
cell.SetFont(font)
Dim color As Color =  cell.GetFontColor() 
color = Color.Black
cell.SetFontColor(color)

```

### Se även

* class [GridCell](../../gridcell)
* namnutrymme [Aspose.Cells.GridDesktop.Data](../../gridcell)
* hopsättning [Aspose.Cells.GridDesktop](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.GridDesktop.dll -->

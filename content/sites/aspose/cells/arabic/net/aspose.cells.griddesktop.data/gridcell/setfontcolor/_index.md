---
title: SetFontColor
second_title: Aspose.Cells لمرجع .NET API
description: تعيين لون الخط إلى الخلية. لتحسين الأداء  قم بتنفيذ طريقة SetFontColor  لا تنفذ خاصية لون الخط.
type: docs
weight: 390
url: /ar/net/aspose.cells.griddesktop.data/gridcell/setfontcolor/
---
## GridCell.SetFontColor method

تعيين لون الخط إلى الخلية. لتحسين الأداء ، قم بتنفيذ طريقة "SetFontColor" ، لا تنفذ خاصية "لون الخط".

```csharp
public void SetFontColor(Color color)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| color | Color | لون الخط المراد تعيينه. |

### أمثلة

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

### أنظر أيضا

* class [GridCell](../../gridcell)
* مساحة الاسم [Aspose.Cells.GridDesktop.Data](../../gridcell)
* المجسم [Aspose.Cells.GridDesktop](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.GridDesktop.dll -->

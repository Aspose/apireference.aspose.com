---
title: CopyInRange
second_title: Aspose.Cells för .NET API-referens
description: Kopiera former i intervallet till destinationsområdet.
type: docs
weight: 380
url: /sv/net/aspose.cells.drawing/shapecollection/copyinrange/
---
## ShapeCollection.CopyInRange method

Kopiera former i intervallet till destinationsområdet.

```csharp
public void CopyInRange(ShapeCollection sourceShapes, CellArea ca, int destRow, int destColumn, 
    bool isContained)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| sourceShapes | ShapeCollection | Källformer. |
| ca | CellArea | Källomfånget. |
| destRow | Int32 | Dest radindex för målintervallet. |
| destColumn | Int32 | Målkolumnen i målintervallet. |
| isContained | Boolean | Om endast de former som finns i intervallet kopieras. Om sant, kopierar endast formerna i intervallet. Annars fungerar det som MS Office. |

### Exempel

```csharp

[C#]
//lägg till en form
shapes.AddRectangle(2, 0, 2, 0, 130, 130);
CellArea area2 = new CellArea();
area2.StartColumn = 1;
area2.StartRow = 1;
area2.EndColumn = 5;
area2.EndRow = 11;

//kopiera
shapes.CopyInRange(shapes, area2, 12, 1, false);

```

### Se även

* struct [CellArea](../../../aspose.cells/cellarea)
* class [ShapeCollection](../../shapecollection)
* namnutrymme [Aspose.Cells.Drawing](../../shapecollection)
* hopsättning [Aspose.Cells](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->

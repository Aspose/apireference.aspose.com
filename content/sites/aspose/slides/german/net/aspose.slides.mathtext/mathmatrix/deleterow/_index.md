---
title: DeleteRow
second_title: Aspose.Slides für .NET-API-Referenz
description: Löscht die angegebene Zeile
type: docs
weight: 130
url: /de/net/aspose.slides.mathtext/mathmatrix/deleterow/
---
## MathMatrix.DeleteRow method

Löscht die angegebene Zeile

```csharp
public void DeleteRow(int rowIndex)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rowIndex | Int32 | Der nullbasierte Index der zu löschenden Zeile. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| InvalidOperationException | Wenn Sie versuchen, die letzte einzelne Zeile in der Matrix zu löschen |
| ArgumentOutOfRangeException | Wenn rowIndex kleiner als Null oder größer oder gleich RowCount ist |

### Beispiele

Beispiel:

```csharp
[C#]
IMathMatrix matrix = new MathMatrix(2, 3);
matrix.DeleteRow(0);
```

### Siehe auch

* class [MathMatrix](../../mathmatrix)
* namensraum [Aspose.Slides.MathText](../../mathmatrix)
* Montage [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->

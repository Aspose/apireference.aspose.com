---
title: CellArea
second_title: Aspose.Cells für .NET-API-Referenz
description: Repräsentiert einen Bereich von Zellen.
type: docs
weight: 240
url: /de/net/aspose.cells/cellarea/
---
## CellArea structure

Repräsentiert einen Bereich von Zellen.

```csharp
public struct CellArea : IComparable
```

## Methoden

| Name | Beschreibung |
| --- | --- |
| static [CreateCellArea](../../aspose.cells/cellarea/createcellarea#createcellarea_1)(string, string) | Erstellt einen Zellenbereich. |
| static [CreateCellArea](../../aspose.cells/cellarea/createcellarea#createcellarea)(int, int, int, int) | Erstellt einen Zellenbereich. |
| [CompareTo](../../aspose.cells/cellarea/compareto)(object) | Nur für den internen Gebrauch. |
| override [ToString](../../aspose.cells/cellarea/tostring)() | Gibt eine Zeichenfolge zurück, die das aktuelle Worksheet-Objekt darstellt. |

## Felder

| Name | Beschreibung |
| --- | --- |
| [EndColumn](../../aspose.cells/cellarea/endcolumn) | Ruft die Endspalte dieses Bereichs ab oder setzt sie. |
| [EndRow](../../aspose.cells/cellarea/endrow) | Ruft die Endzeile dieses Bereichs ab oder setzt sie. |
| [StartColumn](../../aspose.cells/cellarea/startcolumn) | Liest oder setzt die Startspalte dieses Bereichs. |
| [StartRow](../../aspose.cells/cellarea/startrow) | Ruft die Startzeile dieses Bereichs ab oder setzt sie. |

### Beispiele

```csharp

[C#]

//Zellbereich erstellen
CellArea ca = new CellArea();
ca.StartRow = 0;
ca.EndRow = 0;
ca.StartColumn = 0;
ca.EndColumn = 0;

[VB.NET]

'Zellbereich erstellen
Dim ca As CellArea = New CellArea()
ca.StartRow = 0
ca.EndRow = 0
ca.StartColumn = 0
ca.EndColumn = 0

```

### Siehe auch

* namensraum [Aspose.Cells](../../aspose.cells)
* Montage [Aspose.Cells](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Cells.dll -->

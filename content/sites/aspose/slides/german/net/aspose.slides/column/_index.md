---
title: Column
second_title: Aspose.Slides für .NET-API-Referenz
description: Repräsentiert eine Spalte in einer Tabelle.
type: docs
weight: 2460
url: /de/net/aspose.slides/column/
---
## Column class

Repräsentiert eine Spalte in einer Tabelle.

```csharp
public sealed class Column : CellCollection, IColumn
```

## Eigenschaften

| Name | Beschreibung |
| --- | --- |
| [ColumnFormat](../../aspose.slides/column/columnformat) { get; } | Gibt das ColumnFormat-Objekt zurück, das Formatierungseigenschaften für diese Spalte enthält. Schreibgeschützt[`IColumnFormat`](../icolumnformat) . |
| [Count](../../aspose.slides/cellcollection/count) { get; } | Gibt die Anzahl der Zellen in einer Sammlung zurück. SchreibgeschütztInt32 . |
| [IsSynchronized](../../aspose.slides/cellcollection/issynchronized) { get; } | Gibt einen Wert zurück, der angibt, ob der Zugriff auf die Sammlung synchronisiert (threadsicher) ist. SchreibgeschütztBoolean . |
| [Item](../../aspose.slides/cellcollection/item) { get; } | Gibt eine Zelle anhand ihrer Position zurück. Schreibgeschützt[`Cell`](../cell) . |
| [Presentation](../../aspose.slides/cellcollection/presentation) { get; } | Gibt die übergeordnete Präsentation einer CellCollection zurück. Schreibgeschützt[`IPresentation`](../ipresentation) . |
| [Slide](../../aspose.slides/cellcollection/slide) { get; } | Gibt die übergeordnete Folie einer CellCollection zurück. Schreibgeschützt[`IBaseSlide`](../ibaseslide) . |
| [SyncRoot](../../aspose.slides/cellcollection/syncroot) { get; } | Gibt einen Synchronisationsstamm zurück. SchreibgeschütztObject . |
| [Width](../../aspose.slides/column/width) { get; set; } | Gibt die Breite einer Spalte zurück oder legt sie fest. Lesen/SchreibenDouble . |

## Methoden

| Name | Beschreibung |
| --- | --- |
| [CopyTo](../../aspose.slides/cellcollection/copyto)(Array, int) | Kopiert alle Elemente aus der Sammlung in das angegebene Array. |
| [GetEnumerator](../../aspose.slides/cellcollection/getenumerator)() | Gibt einen Enumerator zurück, der die Sammlung durchläuft. |
| [SetTextFormat](../../aspose.slides/column/settextformat#settextformat)(IParagraphFormat) | Setzt definierte Absatzformateigenschaften auf die Absätze aller Spaltenzellen. |
| [SetTextFormat](../../aspose.slides/column/settextformat#settextformat_1)(IPortionFormat) | Legt definierte Abschnittsformateigenschaften für die Abschnitte aller Spaltenzellen fest. |
| [SetTextFormat](../../aspose.slides/column/settextformat#settextformat_2)(ITextFrameFormat) | Setzt definierte Textrahmenformateigenschaften auf die Textrahmen aller Spaltenzellen. |

### Siehe auch

* class [CellCollection](../cellcollection)
* interface [IColumn](../icolumn)
* namensraum [Aspose.Slides](../../aspose.slides)
* Montage [Aspose.Slides](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->

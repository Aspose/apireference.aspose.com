---
title: Table.Alignment
linktitle: Alignment
articleTitle: Alignment
second_title: Aspose.Words für .NET
description: Table Alignment eigendom. Gibt an wie eine InlineTabelle im Dokument ausgerichtet wird in C#.
type: docs
weight: 40
url: /de/net/aspose.words.tables/table/alignment/
---
## Table.Alignment property

Gibt an, wie eine Inline-Tabelle im Dokument ausgerichtet wird.

```csharp
public TableAlignment Alignment { get; set; }
```

## Bemerkungen

Der Standardwert istLeft.

## Beispiele

Zeigt, wie man einen Umrissrahmen auf eine Tabelle anwendet.

```csharp
Document doc = new Document(MyDir + "Tables.docx");
Table table = doc.FirstSection.Body.Tables[0];

// Richten Sie die Tabelle in der Mitte der Seite aus.
table.Alignment = TableAlignment.Center;

// Alle vorhandenen Ränder und Schattierungen aus der Tabelle löschen.
table.ClearBorders();
table.ClearShading();

// Füge grüne Ränder zum Umriss der Tabelle hinzu.
table.SetBorder(BorderType.Left, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Right, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Top, LineStyle.Single, 1.5, Color.Green, true);
table.SetBorder(BorderType.Bottom, LineStyle.Single, 1.5, Color.Green, true);

// Füllen Sie die Zellen mit einer hellgrünen Volltonfarbe.
table.SetShading(TextureIndex.TextureSolid, Color.LightGreen, Color.Empty);

doc.Save(ArtifactsDir + "Table.SetOutlineBorders.docx");
```

### Siehe auch

* enum [TableAlignment](../../tablealignment/)
* class [Table](../)
* namensraum [Aspose.Words.Tables](../../../aspose.words.tables/)
* Montage [Aspose.Words](../../../)

---
title: CellFormat.ClearFormatting
linktitle: ClearFormatting
articleTitle: ClearFormatting
second_title: Aspose.Words für .NET
description: CellFormat ClearFormatting methode. Setzt die Standardzellenformatierung zurück. Ändert die Breite der Zelle nicht in C#.
type: docs
weight: 150
url: /de/net/aspose.words.tables/cellformat/clearformatting/
---
## CellFormat.ClearFormatting method

Setzt die Standardzellenformatierung zurück. Ändert die Breite der Zelle nicht.

```csharp
public void ClearFormatting()
```

## Beispiele

Zeigt, wie die Zeilen aus zwei Tabellen zu einer kombiniert werden.

```csharp
Document doc = new Document(MyDir + "Tables.docx");

// Nachfolgend finden Sie zwei Möglichkeiten, eine Tabelle aus einem Dokument abzurufen.
// 1 – Aus der „Tables“-Sammlung eines Body-Knotens:
Table firstTable = doc.FirstSection.Body.Tables[0];

// 2 - Verwendung der Methode „GetChild“:
Table secondTable = (Table)doc.GetChild(NodeType.Table, 1, true);

// Alle Zeilen der aktuellen Tabelle an die nächste anhängen.
while (secondTable.HasChildNodes)
    firstTable.Rows.Add(secondTable.FirstRow);

// Den leeren Tabellencontainer entfernen.
secondTable.Remove();

doc.Save(ArtifactsDir + "Table.CombineTables.docx");
```

### Siehe auch

* class [CellFormat](../)
* namensraum [Aspose.Words.Tables](../../../aspose.words.tables/)
* Montage [Aspose.Words](../../../)

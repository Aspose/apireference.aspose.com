---
title: PreferredWidth.Value
linktitle: Value
articleTitle: Value
second_title: Aspose.Words for .NET
description: Discover the PreferredWidth Value property to easily access and customize your preferred width. Enhance your design with precise measurements today!
type: docs
weight: 50
url: /net/aspose.words.tables/preferredwidth/value/
---
## PreferredWidth.Value property

Gets the preferred width value. The unit of measure is specified in the [`Type`](../type/) property.

```csharp
public double Value { get; }
```

## Examples

Shows how to verify the preferred width type and value of a table cell.

```csharp
Document doc = new Document(MyDir + "Tables.docx");

Table table = doc.FirstSection.Body.Tables[0];
Cell firstCell = table.FirstRow.FirstCell;

Assert.That(firstCell.CellFormat.PreferredWidth.Type, Is.EqualTo(PreferredWidthType.Percent));
Assert.That(firstCell.CellFormat.PreferredWidth.Value, Is.EqualTo(11.16d));
```

### See Also

* class [PreferredWidth](../)
* namespace [Aspose.Words.Tables](../../../aspose.words.tables/)
* assembly [Aspose.Words](../../../)

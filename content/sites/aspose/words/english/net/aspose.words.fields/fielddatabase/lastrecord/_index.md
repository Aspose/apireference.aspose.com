---
title: FieldDatabase.LastRecord
linktitle: LastRecord
articleTitle: LastRecord
second_title: Aspose.Words for .NET
description: Discover the FieldDatabase LastRecord property. Easily manage your last data record number for seamless data insertion and enhanced database efficiency.
type: docs
weight: 80
url: /net/aspose.words.fields/fielddatabase/lastrecord/
---
## FieldDatabase.LastRecord property

Gets or sets the integral record number of the last data record to insert.

```csharp
public string LastRecord { get; set; }
```

## Examples

Shows how to extract data from a database and insert it as a field into a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// This DATABASE field will run a query on a database, and display the result in a table.
FieldDatabase field = (FieldDatabase)builder.InsertField(FieldType.FieldDatabase, true);
field.FileName = DatabaseDir + "Northwind.accdb";
field.Connection = "Provider=Microsoft.ACE.OLEDB.12.0";
field.Query = "SELECT * FROM [Products]";

Assert.That(field.GetFieldCode(), Is.EqualTo($" DATABASE  \\d {DatabaseDir.Replace("\\", "\\\\") + "Northwind.accdb"} \\c Provider=Microsoft.ACE.OLEDB.12.0 \\s \"SELECT * FROM [Products]\""));

// Insert another DATABASE field with a more complex query that sorts all products in descending order by gross sales.
field = (FieldDatabase)builder.InsertField(FieldType.FieldDatabase, true);
field.FileName = DatabaseDir + "Northwind.accdb";
field.Connection = "Provider=Microsoft.ACE.OLEDB.12.0";
field.Query =
    "SELECT [Products].ProductName, FORMAT(SUM([Order Details].UnitPrice * (1 - [Order Details].Discount) * [Order Details].Quantity), 'Currency') AS GrossSales " +
    "FROM([Products] " +
    "LEFT JOIN[Order Details] ON[Products].[ProductID] = [Order Details].[ProductID]) " +
    "GROUP BY[Products].ProductName " +
    "ORDER BY SUM([Order Details].UnitPrice* (1 - [Order Details].Discount) * [Order Details].Quantity) DESC";

// These properties have the same function as LIMIT and TOP clauses.
// Configure them to display only rows 1 to 10 of the query result in the field's table.
field.FirstRecord = "1";
field.LastRecord = "10";

// This property is the index of the format we want to use for our table. The list of table formats is in the "Table AutoFormat..." menu
// that shows up when we create a DATABASE field in Microsoft Word. Index #10 corresponds to the "Colorful 3" format.
field.TableFormat = "10";

// The FormatAttribute property is a string representation of an integer which stores multiple flags.
// We can patrially apply the format which the TableFormat property points to by setting different flags in this property.
// The number we use is the sum of a combination of values corresponding to different aspects of the table style.
// 63 represents 1 (borders) + 2 (shading) + 4 (font) + 8 (color) + 16 (autofit) + 32 (heading rows).
field.FormatAttributes = "63";
field.InsertHeadings = true;
field.InsertOnceOnMailMerge = true;

doc.FieldOptions.FieldDatabaseProvider = new OleDbFieldDatabaseProvider();
doc.UpdateFields();

doc.Save(ArtifactsDir + "Field.DATABASE.docx");
```

### See Also

* class [FieldDatabase](../)
* namespace [Aspose.Words.Fields](../../../aspose.words.fields/)
* assembly [Aspose.Words](../../../)

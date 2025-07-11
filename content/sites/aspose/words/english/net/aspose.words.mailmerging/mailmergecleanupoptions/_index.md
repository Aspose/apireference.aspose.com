---
title: MailMergeCleanupOptions Enum
linktitle: MailMergeCleanupOptions
articleTitle: MailMergeCleanupOptions
second_title: Aspose.Words for .NET
description: Discover Aspose.Words.MailMergeCleanupOptions enum to efficiently manage mail merge cleanup. Optimize your documents by controlling item removal seamlessly.
type: docs
weight: 4530
url: /net/aspose.words.mailmerging/mailmergecleanupoptions/
---
## MailMergeCleanupOptions enumeration

Specifies options that determine what items are removed during mail merge.

```csharp
[Flags]
public enum MailMergeCleanupOptions
```

### Values

| Name | Value | Description |
| --- | --- | --- |
| None | `0` | Specifies a default value. |
| RemoveEmptyParagraphs | `1` | Specifies whether paragraphs that contained mail merge fields with no data should be removed from the document. When this option is set, paragraphs which contain region start and end merge fields which are otherwise empty are also removed. |
| RemoveUnusedRegions | `2` | Specifies whether unused mail merge regions should be removed from the document. |
| RemoveUnusedFields | `4` | Specifies whether unused merge fields should be removed from the document. |
| RemoveContainingFields | `8` | Specifies whether fields that contain merge fields (for example, IFs) should be removed from the document if the nested merge fields are removed. |
| RemoveStaticFields | `10` | Specifies whether static fields should be removed from the document. Static fields are fields, which results remain the same upon any document change. Fields, which do not store their results in a document and are calculated on the fly (like FieldListNum, FieldSymbol, etc.) are not considered to be static. |
| RemoveEmptyTableRows | `20` | Specifies whether empty rows that contain mail merge regions should be removed from the document. |
| RemoveEmptyTables | `40` | Specifies whether to remove from the document tables that contain mail merge regions that were removed using either the RemoveUnusedRegions or the RemoveEmptyTableRows option. |

## Examples

Shows how to remove whole empty table during mail merge.

```csharp
DataTable tableCustomers = new DataTable("A");
tableCustomers.Columns.Add("CustomerID");
tableCustomers.Columns.Add("CustomerName");
tableCustomers.Rows.Add(new object[] { 1, "John Doe" });
tableCustomers.Rows.Add(new object[] { 2, "Jane Doe" });

DataSet ds = new DataSet();
ds.Tables.Add(tableCustomers);

Document doc = new Document(MyDir + "Mail merge tables.docx");
Assert.That(doc.GetChildNodes(NodeType.Table, true).Count, Is.EqualTo(2));

doc.MailMerge.MergeDuplicateRegions = false;
doc.MailMerge.CleanupOptions = MailMergeCleanupOptions.RemoveEmptyTables | MailMergeCleanupOptions.RemoveUnusedRegions;
doc.MailMerge.ExecuteWithRegions(ds.Tables["A"]);

doc.Save(ArtifactsDir + "MailMerge.RemoveEmptyTables.docx");

doc = new Document(ArtifactsDir + "MailMerge.RemoveEmptyTables.docx");
Assert.That(doc.GetChildNodes(NodeType.Table, true).Count, Is.EqualTo(1));
```

Shows how to remove empty paragraphs that a mail merge may create from the merge output document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertField(" MERGEFIELD TableStart:MyTable");
builder.InsertField(" MERGEFIELD FirstName ");
builder.Write(" ");
builder.InsertField(" MERGEFIELD LastName ");
builder.InsertField(" MERGEFIELD TableEnd:MyTable");

DataTable dataTable = new DataTable("MyTable");
dataTable.Columns.Add("FirstName");
dataTable.Columns.Add("LastName");
dataTable.Rows.Add(new object[] { "John", "Doe" });
dataTable.Rows.Add(new object[] { "", "" });
dataTable.Rows.Add(new object[] { "Jane", "Doe" });

doc.MailMerge.CleanupOptions = mailMergeCleanupOptions;
doc.MailMerge.ExecuteWithRegions(dataTable);

if (doc.MailMerge.CleanupOptions == MailMergeCleanupOptions.RemoveEmptyParagraphs) 
    Assert.That(doc.GetText().Trim(), Is.EqualTo("John Doe\r" +
        "Jane Doe"));
else
    Assert.That(doc.GetText().Trim(), Is.EqualTo("John Doe\r" +
        " \r" +
        "Jane Doe"));
```

Shows how to automatically remove MERGEFIELDs that go unused during mail merge.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create a document with MERGEFIELDs for three columns of a mail merge data source table,
// and then create a table with only two columns whose names match our MERGEFIELDs.
builder.InsertField(" MERGEFIELD FirstName ");
builder.Write(" ");
builder.InsertField(" MERGEFIELD LastName ");
builder.InsertParagraph();
builder.InsertField(" MERGEFIELD City ");

DataTable dataTable = new DataTable("MyTable");
dataTable.Columns.Add("FirstName");
dataTable.Columns.Add("LastName");
dataTable.Rows.Add(new object[] { "John", "Doe" });
dataTable.Rows.Add(new object[] { "Joe", "Bloggs" });

// Our third MERGEFIELD references a "City" column, which does not exist in our data source.
// The mail merge will leave fields such as this intact in their pre-merge state.
// Setting the "CleanupOptions" property to "RemoveUnusedFields" will remove any MERGEFIELDs
// that go unused during a mail merge to clean up the merge documents.
doc.MailMerge.CleanupOptions = mailMergeCleanupOptions;
doc.MailMerge.Execute(dataTable);

if (mailMergeCleanupOptions == MailMergeCleanupOptions.RemoveUnusedFields || 
    mailMergeCleanupOptions == MailMergeCleanupOptions.RemoveStaticFields)
    Assert.That(doc.Range.Fields.Count, Is.EqualTo(0));
else
    Assert.That(doc.Range.Fields.Count, Is.EqualTo(2));
```

### See Also

* namespace [Aspose.Words.MailMerging](../../aspose.words.mailmerging/)
* assembly [Aspose.Words](../../)

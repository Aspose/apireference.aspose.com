---
title: MailMergeSettings.DataSource
linktitle: DataSource
articleTitle: DataSource
second_title: Aspose.Words for .NET
description: Discover how to set the MailMergeSettings DataSource property for seamless mail merge integration. Easily specify your data source path for optimal results!
type: docs
weight: 60
url: /net/aspose.words.settings/mailmergesettings/datasource/
---
## MailMergeSettings.DataSource property

Specifies the path to the mail-merge data source. The default value is an empty string.

```csharp
public string DataSource { get; set; }
```

## Examples

Shows how to construct a data source for a mail merge from a header source and a data source.

```csharp
// Create a mailing label merge header file, which will consist of a table with one row.
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.StartTable();
builder.InsertCell();
builder.Write("FirstName");
builder.InsertCell();
builder.Write("LastName");
builder.EndTable();

doc.Save(ArtifactsDir + "MailMerge.MailingLabelMerge.Header.docx");

// Create a mailing label merge data file consisting of a table with one row
// and the same number of columns as the header document's table. 
doc = new Document();
builder = new DocumentBuilder(doc);

builder.StartTable();
builder.InsertCell();
builder.Write("John");
builder.InsertCell();
builder.Write("Doe");
builder.EndTable();

doc.Save(ArtifactsDir + "MailMerge.MailingLabelMerge.Data.docx");

// Create a merge destination document with MERGEFIELDS with names that
// match the column names in the merge header file table.
doc = new Document();
builder = new DocumentBuilder(doc);

builder.Write("Dear ");
builder.InsertField("MERGEFIELD FirstName", "<FirstName>");
builder.Write(" ");
builder.InsertField("MERGEFIELD LastName", "<LastName>");

MailMergeSettings settings = doc.MailMergeSettings;

// Construct a data source for our mail merge by specifying two document filenames.
// The header source will name the columns of the data source table.
settings.HeaderSource = ArtifactsDir + "MailMerge.MailingLabelMerge.Header.docx";

// The data source will provide rows of data for all the columns in the header document table.
settings.DataSource = ArtifactsDir + "MailMerge.MailingLabelMerge.Data.docx";

// Configure a mailing label type mail merge, which Microsoft Word will execute
// as soon as we use it to load the output document.
settings.Query = "SELECT * FROM " + settings.DataSource;
settings.MainDocumentType = MailMergeMainDocumentType.MailingLabels;
settings.DataType = MailMergeDataType.TextFile;
settings.LinkToQuery = true;
settings.ViewMergedData = true;

doc.Save(ArtifactsDir + "MailMerge.MailingLabelMerge.docx");
```

### See Also

* class [MailMergeSettings](../)
* namespace [Aspose.Words.Settings](../../../aspose.words.settings/)
* assembly [Aspose.Words](../../../)

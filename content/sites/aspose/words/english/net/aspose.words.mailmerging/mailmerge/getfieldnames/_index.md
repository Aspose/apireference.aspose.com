---
title: MailMerge.GetFieldNames
linktitle: GetFieldNames
articleTitle: GetFieldNames
second_title: Aspose.Words for .NET
description: Discover the MailMerge GetFieldNames method to effortlessly access and utilize all mail merge field names in your document for streamlined document automation.
type: docs
weight: 220
url: /net/aspose.words.mailmerging/mailmerge/getfieldnames/
---
## MailMerge.GetFieldNames method

Returns a collection of mail merge field names available in the document.

```csharp
public string[] GetFieldNames()
```

## Remarks

Returns full merge field names including optional prefix. Does not eliminate duplicate field names.

A new string array is created on every call.

Includes "mustache" field names if [`UseNonMergeFields`](../usenonmergefields/) is `true`.

## Examples

Shows how to get names of all merge fields in a document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.InsertField(" MERGEFIELD FirstName ");
builder.Write(" ");
builder.InsertField(" MERGEFIELD LastName ");
builder.InsertParagraph();
builder.InsertField(" MERGEFIELD City ");

DataTable dataTable = new DataTable("MyTable");
dataTable.Columns.Add("FirstName");
dataTable.Columns.Add("LastName");
dataTable.Columns.Add("City");
dataTable.Rows.Add(new object[] { "John", "Doe", "New York" });
dataTable.Rows.Add(new object[] { "Joe", "Bloggs", "Washington" });

// For every MERGEFIELD name in the document, ensure that the data table contains a column
// with the same name, and then execute the mail merge. 
string[] fieldNames = doc.MailMerge.GetFieldNames();

Assert.That(fieldNames.Length, Is.EqualTo(3));

foreach (string fieldName in fieldNames)
    Assert.That(dataTable.Columns.Contains(fieldName), Is.True);

doc.MailMerge.Execute(dataTable);
```

### See Also

* class [MailMerge](../)
* namespace [Aspose.Words.MailMerging](../../../aspose.words.mailmerging/)
* assembly [Aspose.Words](../../../)

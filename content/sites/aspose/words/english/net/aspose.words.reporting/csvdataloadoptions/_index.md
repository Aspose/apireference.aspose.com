---
title: CsvDataLoadOptions Class
linktitle: CsvDataLoadOptions
articleTitle: CsvDataLoadOptions
second_title: Aspose.Words for .NET
description: Discover Aspose.Words.Reporting.CsvDataLoadOptions for efficient CSV data parsing. Optimize your document processing with customizable options today!
type: docs
weight: 5400
url: /net/aspose.words.reporting/csvdataloadoptions/
---
## CsvDataLoadOptions class

Represents options for parsing CSV data.

To learn more, visit the [LINQ Reporting Engine](https://docs.aspose.com/words/net/linq-reporting-engine/) documentation article.

```csharp
public class CsvDataLoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [CsvDataLoadOptions](csvdataloadoptions/#constructor)() | Initializes a new instance of this class with default options. |
| [CsvDataLoadOptions](csvdataloadoptions/#constructor_1)(*bool*) | Initializes a new instance of this class with specifying whether CSV data contains column names at the first line. |

## Properties

| Name | Description |
| --- | --- |
| [CommentChar](../../aspose.words.reporting/csvdataloadoptions/commentchar/) { get; set; } | Gets or sets the character that is used to comment lines of CSV data. |
| [Delimiter](../../aspose.words.reporting/csvdataloadoptions/delimiter/) { get; set; } | Gets or sets the character to be used as a column delimiter. |
| [HasHeaders](../../aspose.words.reporting/csvdataloadoptions/hasheaders/) { get; set; } | Gets or sets a value indicating whether the first record of CSV data contains column names. |
| [QuoteChar](../../aspose.words.reporting/csvdataloadoptions/quotechar/) { get; set; } | Gets or sets the character that is used to quote field values. |

## Remarks

An instance of this class can be passed into constructors of [`CsvDataSource`](../csvdatasource/).

## Examples

Shows how to use CSV as a data source (string).

```csharp
Document doc = new Document(MyDir + "Reporting engine template - CSV data destination.docx");

CsvDataLoadOptions loadOptions = new CsvDataLoadOptions(true);
loadOptions.Delimiter = ';';
loadOptions.CommentChar = '$';
loadOptions.HasHeaders = true;
loadOptions.QuoteChar = '"';

CsvDataSource dataSource = new CsvDataSource(MyDir + "List of people.csv", loadOptions);
BuildReport(doc, dataSource, "persons");

doc.Save(ArtifactsDir + "ReportingEngine.CsvDataString.docx");
```

### See Also

* namespace [Aspose.Words.Reporting](../../aspose.words.reporting/)
* assembly [Aspose.Words](../../)

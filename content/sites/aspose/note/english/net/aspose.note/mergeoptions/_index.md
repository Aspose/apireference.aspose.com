---
title: Class MergeOptions
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.MergeOptions class. The options for merging a collection of pages
type: docs
weight: 410
url: /net/aspose.note/mergeoptions/
---
## MergeOptions class

The options for merging a collection of pages.

```csharp
public class MergeOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [MergeOptions](mergeoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [ImportAsSinglePage](../../aspose.note/mergeoptions/importassinglepage/) { get; set; } | Gets or sets a value indicating whether to import provided pages as single page. |
| [InsertAsChild](../../aspose.note/mergeoptions/insertaschild/) { get; set; } | Gets or sets a value indicating whether inserted pages should be added as a children of previous page. |
| [InsertAt](../../aspose.note/mergeoptions/insertat/) { get; set; } | Gets or sets the position where imported pages will be inserted. |
| [PageSpacing](../../aspose.note/mergeoptions/pagespacing/) { get; set; } | Gets or sets the spacing between pages when imported as a single page. |

## Examples

Shows how to import all pages from PDF document grouping every 5 pages to a single OneNote page.

```csharp
string dataDir = RunExamples.GetDataDir_Import();

var d = new Document();

var mergeOptions = new MergeOptions() { ImportAsSinglePage = true, PageSpacing = 100 };

IEnumerable<Page> pages = PdfImporter.Import(Path.Combine(dataDir, "SampleGrouping.pdf"));
while (pages.Any())
{
    d.Merge(pages.Take(5), mergeOptions);
    pages = pages.Skip(5);
}

d.Save(Path.Combine(dataDir, "sample_CustomMerge.one"));
```

Shows how to import all pages from a set of PDF documents while inserting pages from every PDF document as children of a top level OneNote page.

```csharp
string dataDir = RunExamples.GetDataDir_Import();

var d = new Document();

foreach (var file in new[] { "sampleText.pdf", "sampleImage.pdf", "sampleTable.pdf" })
{
    d.AppendChildLast(new Page()).Title = new Title() { TitleText = new RichText() { ParagraphStyle = ParagraphStyle.Default }.Append(file) };
    d.Import(Path.Combine(dataDir, file), new PdfImportOptions(), new MergeOptions() { InsertAt = int.MaxValue, InsertAsChild = true });
}

d.Save(Path.Combine(dataDir, "sample_StructuredMerge.one"));
```

Shows how to import all content from a set of PDF documents while merging pages from every PDF document to a single OneNote page.

```csharp
string dataDir = RunExamples.GetDataDir_Import();

var d = new Document();

var importOptions = new PdfImportOptions();
var mergeOptions = new MergeOptions() { ImportAsSinglePage = true, PageSpacing = 100 };

d.Import(Path.Combine(dataDir, "sampleText.pdf"), importOptions, mergeOptions)
 .Import(Path.Combine(dataDir, "sampleImage.pdf"), importOptions, mergeOptions)
 .Import(Path.Combine(dataDir, "sampleTable.pdf"), importOptions, mergeOptions);

d.Save(Path.Combine(dataDir, "sample_SinglePageMerge.one"));
```

### See Also

* namespace [Aspose.Note](../../aspose.note/)
* assembly [Aspose.Note](../../)



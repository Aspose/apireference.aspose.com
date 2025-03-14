---
title: Class KeepPartAndCloneSolidObjectToNextPageAlgorithm
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.Saving.KeepPartAndCloneSolidObjectToNextPageAlgorithm class. Adds objects top part to the bottom of the page and clones full object to the next page in case it doesnt fit in original page
type: docs
weight: 810
url: /net/aspose.note.saving/keeppartandclonesolidobjecttonextpagealgorithm/
---
## KeepPartAndCloneSolidObjectToNextPageAlgorithm class

Adds object's top part to the bottom of the page and clones full object to the next page in case it doesn't fit in original page.

```csharp
public class KeepPartAndCloneSolidObjectToNextPageAlgorithm : PageSplittingAlgorithm
```

## Constructors

| Name | Description |
| --- | --- |
| [KeepPartAndCloneSolidObjectToNextPageAlgorithm](keeppartandclonesolidobjecttonextpagealgorithm/#constructor)() | Initializes a new instance of the `KeepPartAndCloneSolidObjectToNextPageAlgorithm` class, using default height limit of cloned part. |
| [KeepPartAndCloneSolidObjectToNextPageAlgorithm](keeppartandclonesolidobjecttonextpagealgorithm/#constructor_1)(float) | Initializes a new instance of the `KeepPartAndCloneSolidObjectToNextPageAlgorithm` class, using specific height limit of cloned part. |

## Properties

| Name | Description |
| --- | --- |
| [HeightLimitOfClonedPart](../../aspose.note.saving/keeppartandclonesolidobjecttonextpagealgorithm/heightlimitofclonedpart/) { get; } | Gets the height limit of cloned part. |

## Fields

| Name | Description |
| --- | --- |
| const [DefaultHeightLimitOfClonedPart](../../aspose.note.saving/keeppartandclonesolidobjecttonextpagealgorithm/defaultheightlimitofclonedpart/) | The default max size of cloned part. |

## Examples

When long OneNote pages are saved in pdf format they are split across pages. The sample shows how to configure the splitting logic of objects located on page's breaks.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

// Load the document into Aspose.Note.
Document doc = new Document(dataDir + "Aspose.one");

var pdfSaveOptions = new PdfSaveOptions();

pdfSaveOptions.PageSplittingAlgorithm = new KeepPartAndCloneSolidObjectToNextPageAlgorithm(100);
// or
pdfSaveOptions.PageSplittingAlgorithm = new KeepPartAndCloneSolidObjectToNextPageAlgorithm(400);

dataDir = dataDir + "PageSplittUsingKeepPartAndCloneSolidObjectToNextPageAlgorithm_out.pdf";
doc.Save(dataDir);
```

When long OneNote pages are saved in pdf format they are split across pages. The example shows how to configure the splitting logic of objects located on page's breaks.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

// Load the document into Aspose.Note.
Document doc = new Document(dataDir + "Aspose.one");
var pdfSaveOptions = new PdfSaveOptions();
pdfSaveOptions.PageSplittingAlgorithm = new AlwaysSplitObjectsAlgorithm();
// Or
pdfSaveOptions.PageSplittingAlgorithm = new KeepPartAndCloneSolidObjectToNextPageAlgorithm();
// Or
pdfSaveOptions.PageSplittingAlgorithm = new KeepSolidObjectsAlgorithm();

float heightLimitOfClonedPart = 500;
pdfSaveOptions.PageSplittingAlgorithm = new KeepPartAndCloneSolidObjectToNextPageAlgorithm(heightLimitOfClonedPart);
// Or
pdfSaveOptions.PageSplittingAlgorithm = new KeepSolidObjectsAlgorithm(heightLimitOfClonedPart);

pdfSaveOptions.PageSplittingAlgorithm = new KeepSolidObjectsAlgorithm(100);
// Or
pdfSaveOptions.PageSplittingAlgorithm = new KeepSolidObjectsAlgorithm(400);

dataDir = dataDir + "UsingKeepSOlidObjectsAlgorithm_out.pdf";
doc.Save(dataDir);
```

### See Also

* class [PageSplittingAlgorithm](../pagesplittingalgorithm/)
* namespace [Aspose.Note.Saving](../../aspose.note.saving/)
* assembly [Aspose.Note](../../)



---
title: Class PrintOptions
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.Saving.PrintOptions class. Options used to print a document
type: docs
weight: 940
url: /net/aspose.note.saving/printoptions/
---
## PrintOptions class

Options used to print a document.

```csharp
public class PrintOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [PrintOptions](printoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [DocumentName](../../aspose.note.saving/printoptions/documentname/) { get; set; } | Gets or sets the document name to display (for example, in a print status dialog box or printer queue) while printing the document. |
| [PageSplittingAlgorithm](../../aspose.note.saving/printoptions/pagesplittingalgorithm/) { get; set; } | Gets or sets algorithm used for page splitting. |
| [PrinterSettings](../../aspose.note.saving/printoptions/printersettings/) { get; set; } | Gets or sets the printer settings. |
| [Resolution](../../aspose.note.saving/printoptions/resolution/) { get; set; } | Gets or sets the resolution for the generated images, in dots per inch. |

## Examples

Shows how to sent document to a printer using standard Windows dialog with specified options.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();

var document = new Aspose.Note.Document(dataDir + "Aspose.one");

var printerSettings = new PrinterSettings() { FromPage = 0, ToPage = 10 };
printerSettings.DefaultPageSettings.Landscape = true;
printerSettings.DefaultPageSettings.Margins = new System.Drawing.Printing.Margins(50, 50, 150, 50);

document.Print(new PrintOptions()
               {
                   PrinterSettings = printerSettings,
                   Resolution = 1200,
                   PageSplittingAlgorithm = new KeepSolidObjectsAlgorithm(),
                   DocumentName = "Test.one"
               });
```

### See Also

* namespace [Aspose.Note.Saving](../../aspose.note.saving/)
* assembly [Aspose.Note](../../)



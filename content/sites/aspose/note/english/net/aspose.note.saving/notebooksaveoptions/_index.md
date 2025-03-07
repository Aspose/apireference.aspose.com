---
title: Class NotebookSaveOptions
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.Saving.NotebookSaveOptions class. An abstract base class which represents notebook saving options for a particular format
type: docs
weight: 870
url: /net/aspose.note.saving/notebooksaveoptions/
---
## NotebookSaveOptions class

An abstract base class which represents notebook saving options for a particular format.

```csharp
public abstract class NotebookSaveOptions
```

## Properties

| Name | Description |
| --- | --- |
| [DeferredSaving](../../aspose.note.saving/notebooksaveoptions/deferredsaving/) { get; set; } | Gets or sets a value indicating whether children documents should be saved explicitly. |
| [Flatten](../../aspose.note.saving/notebooksaveoptions/flatten/) { get; set; } | Gets or sets a value indicating whether the notebook children hierarchy is saved flattened. |
| abstract [SaveFormat](../../aspose.note.saving/notebooksaveoptions/saveformat/) { get; } | Gets the format in which the notebook is saved. |

## Methods

| Name | Description |
| --- | --- |
| abstract [GetDocumentSaveOptions](../../aspose.note.saving/notebooksaveoptions/getdocumentsaveoptions/)() | Gets the save options for all notebook's child documents. |

## Examples

Shows how to save flattened notebook in pdf format.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_NoteBook();

// Load a OneNote Notebook
var notebook = new Notebook(dataDir + "Notizbuch �ffnen.onetoc2");

// Save the Notebook
dataDir = dataDir + "ConvertToPDFAsFlattened_out.pdf";
notebook.Save(
    dataDir,
    new NotebookPdfSaveOptions
    {
        Flatten = true
    });
```

Shows how to save notebook in pdf format with specified options.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_NoteBook();

// Load a OneNote Notebook
var notebook = new Notebook(dataDir + "Notizbuch �ffnen.onetoc2");

var notebookSaveOptions = new NotebookPdfSaveOptions();

var documentSaveOptions = notebookSaveOptions.DocumentSaveOptions;

documentSaveOptions.PageSplittingAlgorithm = new KeepSolidObjectsAlgorithm();

dataDir = dataDir + "ConvertToPDF_out.pdf";

// Save the Notebook
notebook.Save(dataDir, notebookSaveOptions);
```

Shows how to save flattened notebook as image.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_NoteBook();

// Load a OneNote Notebook
var notebook = new Notebook(dataDir + "Notizbuch öffnen.onetoc2");

var notebookSaveOptions = new NotebookImageSaveOptions(SaveFormat.Png);

var documentSaveOptions = notebookSaveOptions.DocumentSaveOptions;

documentSaveOptions.Resolution = 400;
notebookSaveOptions.Flatten = true;

dataDir = dataDir + "ConvertToImageAsFlattenedNotebook_out.png";

// Save the Notebook
notebook.Save(dataDir, notebookSaveOptions);
```

### See Also

* namespace [Aspose.Note.Saving](../../aspose.note.saving/)
* assembly [Aspose.Note](../../)



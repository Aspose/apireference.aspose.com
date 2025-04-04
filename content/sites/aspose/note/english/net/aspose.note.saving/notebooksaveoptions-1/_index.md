---
title: Class NotebookSaveOptionsTDocumentSaveOptions
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.Saving.NotebookSaveOptions1TDocumentSaveOptions class. An abstract base class which represents notebook saving options for a particular format and provides common saving options for all document child nodes
type: docs
weight: 880
url: /net/aspose.note.saving/notebooksaveoptions-1/
---
## NotebookSaveOptions&lt;TDocumentSaveOptions&gt; class

An abstract base class which represents notebook saving options for a particular format and provides common saving options for all document child nodes.

```csharp
public abstract class NotebookSaveOptions<TDocumentSaveOptions> : NotebookSaveOptions
    where TDocumentSaveOptions : SaveOptions
```

| Parameter | Description |
| --- | --- |
| TDocumentSaveOptions | The save options for all notebook's child documents. |

## Properties

| Name | Description |
| --- | --- |
| [DeferredSaving](../../aspose.note.saving/notebooksaveoptions/deferredsaving/) { get; set; } | Gets or sets a value indicating whether children documents should be saved explicitly. |
| [DocumentSaveOptions](../../aspose.note.saving/notebooksaveoptions-1/documentsaveoptions/) { get; } | Gets or sets the save options for all notebook's child documents. |
| [Flatten](../../aspose.note.saving/notebooksaveoptions/flatten/) { get; set; } | Gets or sets a value indicating whether the notebook children hierarchy is saved flattened. |
| override [SaveFormat](../../aspose.note.saving/notebooksaveoptions-1/saveformat/) { get; } | Gets the format in which the notebook is saved. |

## Methods

| Name | Description |
| --- | --- |
| override [GetDocumentSaveOptions](../../aspose.note.saving/notebooksaveoptions-1/getdocumentsaveoptions/)() | Gets the save options for all notebook's child documents. |

## Examples

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

### See Also

* class [NotebookSaveOptions](../notebooksaveoptions/)
* class [SaveOptions](../saveoptions/)
* namespace [Aspose.Note.Saving](../../aspose.note.saving/)
* assembly [Aspose.Note](../../)



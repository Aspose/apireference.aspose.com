---
title: Class NotebookLoadOptions
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.NotebookLoadOptions class. Options used to load a notebook
type: docs
weight: 490
url: /net/aspose.note/notebookloadoptions/
---
## NotebookLoadOptions class

Options used to load a notebook.

```csharp
public class NotebookLoadOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [NotebookLoadOptions](notebookloadoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [DeferredLoading](../../aspose.note/notebookloadoptions/deferredloading/) { get; set; } | Gets or sets a value indicating whether children documents should be loaded explicitly later. |
| [InstantLoading](../../aspose.note/notebookloadoptions/instantloading/) { get; set; } | Gets or sets a value indicating whether children documents should be loaded while the parent document is loading. |

## Examples

Shows how to an encrypted notebook.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_NoteBook();
var notebook = new Notebook(dataDir + "test.onetoc2", new NotebookLoadOptions() { DeferredLoading = true });

notebook.LoadChildDocument(dataDir + "Aspose.one");  
notebook.LoadChildDocument(dataDir + "Locked Pass1.one", new LoadOptions() { DocumentPassword = "pass" });
notebook.LoadChildDocument(dataDir + "Locked Pass2.one", new LoadOptions() { DocumentPassword = "pass2" });
```

### See Also

* namespace [Aspose.Note](../../aspose.note/)
* assembly [Aspose.Note](../../)



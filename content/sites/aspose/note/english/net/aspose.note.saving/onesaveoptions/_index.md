---
title: Class OneSaveOptions
second_title: Aspose.Note for .NET API Reference
description: Aspose.Note.Saving.OneSaveOptions class. Allows to specify additional options when saving document to OneNote format
type: docs
weight: 890
url: /net/aspose.note.saving/onesaveoptions/
---
## OneSaveOptions class

Allows to specify additional options when saving document to OneNote format.

```csharp
public sealed class OneSaveOptions : SaveOptions
```

## Constructors

| Name | Description |
| --- | --- |
| [OneSaveOptions](onesaveoptions/)() | The default constructor. |

## Properties

| Name | Description |
| --- | --- |
| [DocumentPassword](../../aspose.note.saving/onesaveoptions/documentpassword/) { get; set; } | Gets or sets a password to encrypt the document content. |
| [FontsSubsystem](../../aspose.note.saving/saveoptions/fontssubsystem/) { get; set; } | Gets or sets font's settings to be used while saving |
| [PageCount](../../aspose.note.saving/saveoptions/pagecount/) { get; set; } | Gets or sets the number of pages to save. By default is MaxValue which means all pages of the document will be rendered. |
| [PageIndex](../../aspose.note.saving/saveoptions/pageindex/) { get; set; } | Gets or sets the index of the first page to save. By default is 0. |
| [SaveFormat](../../aspose.note.saving/saveoptions/saveformat/) { get; } | Gets the format in which the document is saved. |

## Examples

Shows how to save document with encryption.

```csharp
// The path to the documents directory.
string dataDir = RunExamples.GetDataDir_NoteBook();

Document document = new Document();
document.Save(dataDir + "CreatingPasswordProtectedDoc_out.one", new OneSaveOptions() { DocumentPassword = "pass" });
```

Shows how to save a document using OneSaveOptions.

```csharp
string inputFile = "Sample1.one";
string dataDir = RunExamples.GetDataDir_LoadingAndSaving();
string outputFile = "SaveDocToOneNoteFormatUsingOneSaveOptions_out.one";

Document document = new Document(dataDir + inputFile);

document.Save(dataDir + outputFile, new OneSaveOptions());
```

### See Also

* class [SaveOptions](../saveoptions/)
* namespace [Aspose.Note.Saving](../../aspose.note.saving/)
* assembly [Aspose.Note](../../)



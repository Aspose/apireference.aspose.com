---
title: TxtSaveOptions.ListIndentation
linktitle: ListIndentation
articleTitle: ListIndentation
second_title: Aspose.Words for .NET
description: Discover the TxtSaveOptions ListIndentation property, which customizes list indentation for enhanced readability. Control characters and levels effortlessly!
type: docs
weight: 30
url: /net/aspose.words.saving/txtsaveoptions/listindentation/
---
## TxtSaveOptions.ListIndentation property

Gets a [`TxtListIndentation`](../../txtlistindentation/) object that specifies how many and which character to use for indentation of list levels. By default it is zero count of character '\0', that means no indentation.

```csharp
public TxtListIndentation ListIndentation { get; }
```

## Examples

Shows how to configure list indenting when saving a document to plaintext.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create a list with three levels of indentation.
builder.ListFormat.ApplyNumberDefault();
builder.Writeln("Item 1");
builder.ListFormat.ListIndent();
builder.Writeln("Item 2");
builder.ListFormat.ListIndent(); 
builder.Write("Item 3");

// Create a "TxtSaveOptions" object, which we can pass to the document's "Save" method
// to modify how we save the document to plaintext.
TxtSaveOptions txtSaveOptions = new TxtSaveOptions();

// Set the "Character" property to assign a character to use
// for padding that simulates list indentation in plaintext.
txtSaveOptions.ListIndentation.Character = ' ';

// Set the "Count" property to specify the number of times
// to place the padding character for each list indent level.
txtSaveOptions.ListIndentation.Count = 3;

doc.Save(ArtifactsDir + "TxtSaveOptions.TxtListIndentation.txt", txtSaveOptions);

string docText = File.ReadAllText(ArtifactsDir + "TxtSaveOptions.TxtListIndentation.txt");
string newLine= Environment.NewLine;

Assert.That(docText, Is.EqualTo($"1. Item 1{newLine}" +
                $"   a. Item 2{newLine}" +
                $"      i. Item 3{newLine}"));
```

### See Also

* class [TxtListIndentation](../../txtlistindentation/)
* class [TxtSaveOptions](../)
* namespace [Aspose.Words.Saving](../../../aspose.words.saving/)
* assembly [Aspose.Words](../../../)

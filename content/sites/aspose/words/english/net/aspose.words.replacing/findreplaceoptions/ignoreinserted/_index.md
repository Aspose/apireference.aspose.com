---
title: FindReplaceOptions.IgnoreInserted
linktitle: IgnoreInserted
articleTitle: IgnoreInserted
second_title: Aspose.Words for .NET
description: Discover the FindReplaceOptions IgnoreInserted property, control text handling in insert revisions with this simple boolean setting. Default is false.
type: docs
weight: 100
url: /net/aspose.words.replacing/findreplaceoptions/ignoreinserted/
---
## FindReplaceOptions.IgnoreInserted property

Gets or sets a boolean value indicating either to ignore text inside insert revisions. The default value is `false`.

```csharp
public bool IgnoreInserted { get; set; }
```

## Examples

Shows how to include or ignore text inside insert revisions during a find-and-replace operation.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Hello world!");

// Start tracking revisions and insert a paragraph. That paragraph will be an insert revision.
doc.StartTrackRevisions("John Doe", DateTime.Now);
builder.Writeln("Hello again!");
doc.StopTrackRevisions();

Assert.That(doc.FirstSection.Body.Paragraphs[1].IsInsertRevision, Is.True);

// We can use a "FindReplaceOptions" object to modify the find-and-replace process.
FindReplaceOptions options = new FindReplaceOptions();

// Set the "IgnoreInserted" flag to "true" to get the find-and-replace
// operation to ignore paragraphs that are insert revisions.
// Set the "IgnoreInserted" flag to "false" to get the find-and-replace
// operation to also search for text inside insert revisions.
options.IgnoreInserted = ignoreTextInsideInsertRevisions;

doc.Range.Replace("Hello", "Greetings", options);

Assert.That(doc.GetText().Trim(), Is.EqualTo(ignoreTextInsideInsertRevisions
        ? "Greetings world!\rHello again!"
        : "Greetings world!\rGreetings again!"));
```

### See Also

* class [FindReplaceOptions](../)
* namespace [Aspose.Words.Replacing](../../../aspose.words.replacing/)
* assembly [Aspose.Words](../../../)

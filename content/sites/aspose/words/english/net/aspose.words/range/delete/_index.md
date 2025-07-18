---
title: Range.Delete
linktitle: Delete
articleTitle: Delete
second_title: Aspose.Words for .NET
description: Efficiently remove all characters within a specified range using the Range Delete method. Simplify your text editing tasks effortlessly!
type: docs
weight: 70
url: /net/aspose.words/range/delete/
---
## Range.Delete method

Deletes all characters of the range.

```csharp
public void Delete()
```

## Examples

Shows how to delete all the nodes from a range.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Add text to the first section in the document, and then add another section.
builder.Write("Section 1. ");
builder.InsertBreak(BreakType.SectionBreakContinuous);
builder.Write("Section 2.");

Assert.That(doc.GetText().Trim(), Is.EqualTo("Section 1. \fSection 2."));

// Remove the first section entirely by removing all the nodes
// within its range, including the section itself.
doc.Sections[0].Range.Delete();

Assert.That(doc.Sections.Count, Is.EqualTo(1));
Assert.That(doc.GetText().Trim(), Is.EqualTo("Section 2."));
```

### See Also

* class [Range](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

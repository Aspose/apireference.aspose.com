---
title: Paragraph.JoinRunsWithSameFormatting
linktitle: JoinRunsWithSameFormatting
articleTitle: JoinRunsWithSameFormatting
second_title: Aspose.Words for .NET
description: Effortlessly join runs with consistent formatting in your paragraphs using the JoinRunsWithSameFormatting method. Enhance your document's style today!
type: docs
weight: 300
url: /net/aspose.words/paragraph/joinrunswithsameformatting/
---
## Paragraph.JoinRunsWithSameFormatting method

Joins runs with the same formatting in the paragraph.

```csharp
public int JoinRunsWithSameFormatting()
```

### Return Value

Number of joins performed. When **N** adjacent runs are being joined they count as **N - 1** joins.

## Examples

Shows how to simplify paragraphs by merging superfluous runs.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert four runs of text into the paragraph.
builder.Write("Run 1. ");
builder.Write("Run 2. ");
builder.Write("Run 3. ");
builder.Write("Run 4. ");

// If we open this document in Microsoft Word, the paragraph will look like one seamless text body.
// However, it will consist of four separate runs with the same formatting. Fragmented paragraphs like this
// may occur when we manually edit parts of one paragraph many times in Microsoft Word.
Paragraph para = builder.CurrentParagraph;

Assert.That(para.Runs.Count, Is.EqualTo(4));

// Change the style of the last run to set it apart from the first three.
para.Runs[3].Font.StyleIdentifier = StyleIdentifier.Emphasis;

// We can run the "JoinRunsWithSameFormatting" method to optimize the document's contents
// by merging similar runs into one, reducing their overall count.
// This method also returns the number of runs that this method merged.
// These two merges occurred to combine Runs #1, #2, and #3,
// while leaving out Run #4 because it has an incompatible style.
Assert.That(para.JoinRunsWithSameFormatting(), Is.EqualTo(2));

// The number of runs left will equal the original count
// minus the number of run merges that the "JoinRunsWithSameFormatting" method carried out.
Assert.That(para.Runs.Count, Is.EqualTo(2));
Assert.That(para.Runs[0].Text, Is.EqualTo("Run 1. Run 2. Run 3. "));
Assert.That(para.Runs[1].Text, Is.EqualTo("Run 4. "));
```

### See Also

* class [Paragraph](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

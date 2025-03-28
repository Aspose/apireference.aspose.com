---
title: Document.RevisionsView
linktitle: RevisionsView
articleTitle: RevisionsView
second_title: Aspose.Words for .NET
description: Effortlessly manage document revisions! Choose between original or updated versions for seamless collaboration and enhanced productivity.
type: docs
weight: 380
url: /net/aspose.words/document/revisionsview/
---
## Document.RevisionsView property

Gets or sets a value indicating whether to work with the original or revised version of a document.

```csharp
public RevisionsView RevisionsView { get; set; }
```

## Remarks

The default value is .

## Examples

Shows how to switch between the revised and the original view of a document.

```csharp
Document doc = new Document(MyDir + "Revisions at list levels.docx");
doc.UpdateListLabels();

ParagraphCollection paragraphs = doc.FirstSection.Body.Paragraphs;
Assert.AreEqual("1.", paragraphs[0].ListLabel.LabelString);
Assert.AreEqual("a.", paragraphs[1].ListLabel.LabelString);
Assert.AreEqual(string.Empty, paragraphs[2].ListLabel.LabelString);

// View the document object as if all the revisions are accepted. Currently supports list labels.
doc.RevisionsView = RevisionsView.Final;

Assert.AreEqual(string.Empty, paragraphs[0].ListLabel.LabelString);
Assert.AreEqual("1.", paragraphs[1].ListLabel.LabelString);
Assert.AreEqual("a.", paragraphs[2].ListLabel.LabelString);
```

### See Also

* enum [RevisionsView](../../revisionsview/)
* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

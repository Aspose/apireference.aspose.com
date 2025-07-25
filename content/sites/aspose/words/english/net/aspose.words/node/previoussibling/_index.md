---
title: Node.PreviousSibling
linktitle: PreviousSibling
articleTitle: PreviousSibling
second_title: Aspose.Words for .NET
description: Discover the Node PreviousSibling property to easily access the node that comes before your current node, enhancing your DOM manipulation skills.
type: docs
weight: 70
url: /net/aspose.words/node/previoussibling/
---
## Node.PreviousSibling property

Gets the node immediately preceding this node.

```csharp
public Node PreviousSibling { get; }
```

## Remarks

If there is no preceding node, a `null` is returned.

## Examples

Shows how to use of methods of Node and CompositeNode to remove a section before the last section in the document.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Writeln("Section 1 text.");
builder.InsertBreak(BreakType.SectionBreakContinuous);
builder.Writeln("Section 2 text.");

// Both sections are siblings of each other.
Section lastSection = (Section)doc.LastChild;
Section firstSection = (Section)lastSection.PreviousSibling;

// Remove a section based on its sibling relationship with another section.
if (lastSection.PreviousSibling != null)
    doc.RemoveChild(firstSection);

// The section we removed was the first one, leaving the document with only the second.
Assert.That(doc.GetText().Trim(), Is.EqualTo("Section 2 text."));
```

### See Also

* class [Node](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

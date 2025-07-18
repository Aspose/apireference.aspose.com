---
title: Document.EnsureMinimum
linktitle: EnsureMinimum
articleTitle: EnsureMinimum
second_title: Aspose.Words for .NET
description: Learn how to use the EnsureMinimum method to automatically create a section and paragraph in documents, ensuring complete and organized content.
type: docs
weight: 620
url: /net/aspose.words/document/ensureminimum/
---
## Document.EnsureMinimum method

If the document contains no sections, creates one section with one paragraph.

```csharp
public void EnsureMinimum()
```

## Examples

Shows how to ensure that a document contains the minimal set of nodes required for editing its contents.

```csharp
// A newly created document contains one child Section, which includes one child Body and one child Paragraph.
// We can edit the document body's contents by adding nodes such as Runs or inline Shapes to that paragraph.
Document doc = new Document();
NodeCollection nodes = doc.GetChildNodes(NodeType.Any, true);

Assert.That(nodes[0].NodeType, Is.EqualTo(NodeType.Section));
Assert.That(nodes[0].ParentNode, Is.EqualTo(doc));

Assert.That(nodes[1].NodeType, Is.EqualTo(NodeType.Body));
Assert.That(nodes[1].ParentNode, Is.EqualTo(nodes[0]));

Assert.That(nodes[2].NodeType, Is.EqualTo(NodeType.Paragraph));
Assert.That(nodes[2].ParentNode, Is.EqualTo(nodes[1]));

// This is the minimal set of nodes that we need to be able to edit the document.
// We will no longer be able to edit the document if we remove any of them.
doc.RemoveAllChildren();

Assert.That(doc.GetChildNodes(NodeType.Any, true).Count, Is.EqualTo(0));

// Call this method to make sure that the document has at least those three nodes so we can edit it again.
doc.EnsureMinimum();

Assert.That(nodes[0].NodeType, Is.EqualTo(NodeType.Section));
Assert.That(nodes[1].NodeType, Is.EqualTo(NodeType.Body));
Assert.That(nodes[2].NodeType, Is.EqualTo(NodeType.Paragraph));

((Paragraph)nodes[2]).Runs.Add(new Run(doc, "Hello world!"));
```

### See Also

* class [Document](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

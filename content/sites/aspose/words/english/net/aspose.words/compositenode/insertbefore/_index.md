---
title: CompositeNode.InsertBefore
linktitle: InsertBefore
articleTitle: InsertBefore
second_title: Aspose.Words for .NET
description: Discover how to use the CompositeNode InsertBefore method to seamlessly insert nodes before reference nodes, enhancing your data structure management.
type: docs
weight: 160
url: /net/aspose.words/compositenode/insertbefore/
---
## CompositeNode.InsertBefore&lt;T&gt; method

Inserts the specified node immediately before the specified reference node.

```csharp
public T InsertBefore<T>(T newChild, Node refChild)
    where T : Node
```

| Parameter | Type | Description |
| --- | --- | --- |
| newChild | T | The [`Node`](../../node/) to insert. |
| refChild | Node | The [`Node`](../../node/) that is the reference node. The *newChild* is placed before this node. |

### Return Value

The inserted node.

## Remarks

If *refChild* is `null`, inserts *newChild* at the end of the list of child nodes.

If the *newChild* is already in the tree, it is first removed.

If the node being inserted was created from another document, you should use [`ImportNode`](../../documentbase/importnode/) to import the node to the current document. The imported node can then be inserted into the current document.

## Examples

Shows how to add, update and delete child nodes in a CompositeNode's collection of children.

```csharp
Document doc = new Document();

// An empty document, by default, has one paragraph.
Assert.That(doc.FirstSection.Body.Paragraphs.Count, Is.EqualTo(1));

// Composite nodes such as our paragraph can contain other composite and inline nodes as children.
Paragraph paragraph = doc.FirstSection.Body.FirstParagraph;
Run paragraphText = new Run(doc, "Initial text. ");
paragraph.AppendChild(paragraphText);

// Create three more run nodes.
Run run1 = new Run(doc, "Run 1. ");
Run run2 = new Run(doc, "Run 2. ");
Run run3 = new Run(doc, "Run 3. ");

// The document body will not display these runs until we insert them into a composite node
// that itself is a part of the document's node tree, as we did with the first run.
// We can determine where the text contents of nodes that we insert
// appears in the document by specifying an insertion location relative to another node in the paragraph.
Assert.That(paragraph.GetText().Trim(), Is.EqualTo("Initial text."));

// Insert the second run into the paragraph in front of the initial run.
paragraph.InsertBefore(run2, paragraphText);

Assert.That(paragraph.GetText().Trim(), Is.EqualTo("Run 2. Initial text."));

// Insert the third run after the initial run.
paragraph.InsertAfter(run3, paragraphText);

Assert.That(paragraph.GetText().Trim(), Is.EqualTo("Run 2. Initial text. Run 3."));

// Insert the first run to the start of the paragraph's child nodes collection.
paragraph.PrependChild(run1);

Assert.That(paragraph.GetText().Trim(), Is.EqualTo("Run 1. Run 2. Initial text. Run 3."));
Assert.That(paragraph.GetChildNodes(NodeType.Any, true).Count, Is.EqualTo(4));

// We can modify the contents of the run by editing and deleting existing child nodes.
((Run)paragraph.GetChildNodes(NodeType.Run, true)[1]).Text = "Updated run 2. ";
paragraph.GetChildNodes(NodeType.Run, true).Remove(paragraphText);

Assert.That(paragraph.GetText().Trim(), Is.EqualTo("Run 1. Updated run 2. Run 3."));
Assert.That(paragraph.GetChildNodes(NodeType.Any, true).Count, Is.EqualTo(3));
```

### See Also

* class [Node](../../node/)
* class [CompositeNode](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

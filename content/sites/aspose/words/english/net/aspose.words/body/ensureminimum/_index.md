---
title: Body.EnsureMinimum
linktitle: EnsureMinimum
articleTitle: EnsureMinimum
second_title: Aspose.Words for .NET
description: Optimize your content with the Body EnsureMinimum method. Automatically add an empty paragraph if the last child isn't a paragraph for better formatting.
type: docs
weight: 70
url: /net/aspose.words/body/ensureminimum/
---
## Body.EnsureMinimum method

If the last child is not a paragraph, creates and appends one empty paragraph.

```csharp
public void EnsureMinimum()
```

## Examples

Clears main text from all sections from the document leaving the sections themselves.

```csharp
Document doc = new Document();

// A blank document contains one section, one body and one paragraph.
// Call the "RemoveAllChildren" method to remove all those nodes,
// and end up with a document node with no children.
doc.RemoveAllChildren();

// This document now has no composite child nodes that we can add content to.
// If we wish to edit it, we will need to repopulate its node collection.
// First, create a new section, and then append it as a child to the root document node.
Section section = new Section(doc);
doc.AppendChild(section);

// A section needs a body, which will contain and display all its contents
// on the page between the section's header and footer.
Body body = new Body(doc);
section.AppendChild(body);

// This body has no children, so we cannot add runs to it yet.
Assert.That(doc.FirstSection.Body.GetChildNodes(NodeType.Any, true).Count, Is.EqualTo(0));

// Call the "EnsureMinimum" to make sure that this body contains at least one empty paragraph. 
body.EnsureMinimum();

// Now, we can add runs to the body, and get the document to display them.
body.FirstParagraph.AppendChild(new Run(doc, "Hello world!"));

Assert.That(doc.GetText().Trim(), Is.EqualTo("Hello world!"));
```

### See Also

* class [Body](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

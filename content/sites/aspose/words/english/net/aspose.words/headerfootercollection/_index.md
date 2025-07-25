---
title: HeaderFooterCollection Class
linktitle: HeaderFooterCollection
articleTitle: HeaderFooterCollection
second_title: Aspose.Words for .NET
description: Discover Aspose.Words.HeaderFooterCollection for easy, typed access to Section HeaderFooter nodes, streamlining document management and enhancing your workflow.
type: docs
weight: 3530
url: /net/aspose.words/headerfootercollection/
---
## HeaderFooterCollection class

Provides typed access to [`HeaderFooter`](../headerfooter/) nodes of a [`Section`](../section/).

To learn more, visit the [Working with Headers and Footers](https://docs.aspose.com/words/net/working-with-headers-and-footers/) documentation article.

```csharp
public class HeaderFooterCollection : NodeCollection
```

## Properties

| Name | Description |
| --- | --- |
| [Count](../../aspose.words/nodecollection/count/) { get; } | Gets the number of nodes in the collection. |
| [Item](../../aspose.words/headerfootercollection/item/) { get; } | Retrieves a [`HeaderFooter`](../headerfooter/) at the given index. (3 indexers) |

## Methods

| Name | Description |
| --- | --- |
| [Add](../../aspose.words/nodecollection/add/)(*[Node](../node/)*) | Adds a node to the end of the collection. |
| [Clear](../../aspose.words/nodecollection/clear/)() | Removes all nodes from this collection and from the document. |
| [Contains](../../aspose.words/nodecollection/contains/)(*[Node](../node/)*) | Determines whether a node is in the collection. |
| [GetEnumerator](../../aspose.words/nodecollection/getenumerator/)() | Provides a simple "foreach" style iteration over the collection of nodes. |
| [IndexOf](../../aspose.words/nodecollection/indexof/)(*[Node](../node/)*) | Returns the zero-based index of the specified node. |
| [Insert](../../aspose.words/nodecollection/insert/)(*int, [Node](../node/)*) | Inserts a node into the collection at the specified index. |
| [LinkToPrevious](../../aspose.words/headerfootercollection/linktoprevious/#linktoprevious_1)(*bool*) | Links or unlinks all headers and footers to the corresponding headers and footers in the previous section. |
| [LinkToPrevious](../../aspose.words/headerfootercollection/linktoprevious/#linktoprevious)(*[HeaderFooterType](../headerfootertype/), bool*) | Links or unlinks the specified header or footer to the corresponding header or footer in the previous section. |
| [Remove](../../aspose.words/nodecollection/remove/)(*[Node](../node/)*) | Removes the node from the collection and from the document. |
| [RemoveAt](../../aspose.words/nodecollection/removeat/)(*int*) | Removes the node at the specified index from the collection and from the document. |
| [ToArray](../../aspose.words/headerfootercollection/toarray/#toarray)() | Copies all `HeaderFooter`s from the collection to a new array of `HeaderFooter`s. (2 methods) |

## Remarks

There can be maximum of one [`HeaderFooter`](../headerfooter/)

of each [`HeaderFooterType`](../headerfootertype/) per [`Section`](../section/).

[`HeaderFooter`](../headerfooter/) objects can occur in any order in the collection.

## Examples

Shows how to delete all footers from a document.

```csharp
Document doc = new Document(MyDir + "Header and footer types.docx");

// Iterate through each section and remove footers of every kind.
foreach (Section section in doc.OfType<Section>())
{
    // There are three kinds of footer and header types.
    // 1 -  The "First" header/footer, which only appears on the first page of a section.
    HeaderFooter footer = section.HeadersFooters[HeaderFooterType.FooterFirst];
    footer?.Remove();

    // 2 -  The "Primary" header/footer, which appears on odd pages.
    footer = section.HeadersFooters[HeaderFooterType.FooterPrimary];
    footer?.Remove();

    // 3 -  The "Even" header/footer, which appears on even pages. 
    footer = section.HeadersFooters[HeaderFooterType.FooterEven];
    footer?.Remove();

    Assert.That(section.HeadersFooters.Count(hf => !((HeaderFooter)hf).IsHeader), Is.EqualTo(0));
}

doc.Save(ArtifactsDir + "HeaderFooter.RemoveFooters.docx");
```

Shows how to create a header and a footer.

```csharp
Document doc = new Document();

// Create a header and append a paragraph to it. The text in that paragraph
// will appear at the top of every page of this section, above the main body text.
HeaderFooter header = new HeaderFooter(doc, HeaderFooterType.HeaderPrimary);
doc.FirstSection.HeadersFooters.Add(header);

Paragraph para = header.AppendParagraph("My header.");

Assert.That(header.IsHeader, Is.True);
Assert.That(para.IsEndOfHeaderFooter, Is.True);

// Create a footer and append a paragraph to it. The text in that paragraph
// will appear at the bottom of every page of this section, below the main body text.
HeaderFooter footer = new HeaderFooter(doc, HeaderFooterType.FooterPrimary);
doc.FirstSection.HeadersFooters.Add(footer);

para = footer.AppendParagraph("My footer.");

Assert.That(footer.IsHeader, Is.False);
Assert.That(para.IsEndOfHeaderFooter, Is.True);

Assert.That(para.ParentStory, Is.EqualTo(footer));
Assert.That(para.ParentSection, Is.EqualTo(footer.ParentSection));
Assert.That(header.ParentSection, Is.EqualTo(footer.ParentSection));

doc.Save(ArtifactsDir + "HeaderFooter.Create.docx");
```

### See Also

* class [NodeCollection](../nodecollection/)
* namespace [Aspose.Words](../../aspose.words/)
* assembly [Aspose.Words](../../)

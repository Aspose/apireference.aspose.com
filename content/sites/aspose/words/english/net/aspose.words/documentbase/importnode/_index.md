---
title: DocumentBase.ImportNode
linktitle: ImportNode
articleTitle: ImportNode
second_title: Aspose.Words for .NET
description: Effortlessly import nodes from other documents to enhance your workflow with DocumentBase's ImportNode method. Streamline your document management today!
type: docs
weight: 110
url: /net/aspose.words/documentbase/importnode/
---
## ImportNode(*[Node](../../node/), bool*) {#importnode}

Imports a node from another document to the current document.

```csharp
public Node ImportNode(Node srcNode, bool isImportChildren)
```

| Parameter | Type | Description |
| --- | --- | --- |
| srcNode | Node | The node being imported. |
| isImportChildren | Boolean | `true` to import all child nodes recursively; otherwise, `false`. |

### Return Value

The cloned node that belongs to the current document.

## Remarks

This method uses the UseDestinationStyles option to resolve formatting.

Importing a node creates a copy of the source node belonging to the importing document. The returned node has no parent. The source node is not altered or removed from the original document.

Before a node from another document can be inserted into this document, it must be imported. During import, document-specific properties such as references to styles and lists are translated from the original to the importing document. After the node was imported, it can be inserted into the appropriate place in the document using [`InsertBefore`](../../compositenode/insertbefore/) or [`InsertAfter`](../../compositenode/insertafter/).

If the source node already belongs to the destination document, then simply a deep clone of the source node is created.

## Examples

Shows how to import a node from one document to another.

```csharp
Document srcDoc = new Document();
Document dstDoc = new Document();

srcDoc.FirstSection.Body.FirstParagraph.AppendChild(
    new Run(srcDoc, "Source document first paragraph text."));
dstDoc.FirstSection.Body.FirstParagraph.AppendChild(
    new Run(dstDoc, "Destination document first paragraph text."));

// Every node has a parent document, which is the document that contains the node.
// Inserting a node into a document that the node does not belong to will throw an exception.
Assert.That(srcDoc.FirstSection.Document, Is.Not.EqualTo(dstDoc));
Assert.Throws<ArgumentException>(() => dstDoc.AppendChild(srcDoc.FirstSection));

// Use the ImportNode method to create a copy of a node, which will have the document
// that called the ImportNode method set as its new owner document.
Section importedSection = (Section)dstDoc.ImportNode(srcDoc.FirstSection, true);

Assert.That(importedSection.Document, Is.EqualTo(dstDoc));

// We can now insert the node into the document.
dstDoc.AppendChild(importedSection);

Assert.That(dstDoc.ToString(SaveFormat.Text), Is.EqualTo("Destination document first paragraph text.\r\nSource document first paragraph text.\r\n"));
```

### See Also

* class [Node](../../node/)
* class [DocumentBase](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

---

## ImportNode(*[Node](../../node/), bool, [ImportFormatMode](../../importformatmode/)*) {#importnode_1}

Imports a node from another document to the current document with an option to control formatting.

```csharp
public Node ImportNode(Node srcNode, bool isImportChildren, ImportFormatMode importFormatMode)
```

| Parameter | Type | Description |
| --- | --- | --- |
| srcNode | Node | The node to imported. |
| isImportChildren | Boolean | `true` to import all child nodes recursively; otherwise, `false`. |
| importFormatMode | ImportFormatMode | Specifies how to merge style formatting that clashes. |

### Return Value

The cloned, imported node. The node belongs to the destination document, but has no parent.

## Remarks

This overload is useful to control how styles and list formatting are imported.

Importing a node creates a copy of the source node belonging to the importing document. The returned node has no parent. The source node is not altered or removed from the original document.

Before a node from another document can be inserted into this document, it must be imported. During import, document-specific properties such as references to styles and lists are translated from the original to the importing document. After the node was imported, it can be inserted into the appropriate place in the document using [`InsertBefore`](../../compositenode/insertbefore/) or [`InsertAfter`](../../compositenode/insertafter/).

If the source node already belongs to the destination document, then simply a deep clone of the source node is created.

## Examples

Shows how to import node from source document to destination document with specific options.

```csharp
// Create two documents and add a character style to each document.
// Configure the styles to have the same name, but different text formatting.
Document srcDoc = new Document();
Style srcStyle = srcDoc.Styles.Add(StyleType.Character, "My style");
srcStyle.Font.Name = "Courier New";
DocumentBuilder srcBuilder = new DocumentBuilder(srcDoc);
srcBuilder.Font.Style = srcStyle;
srcBuilder.Writeln("Source document text.");

Document dstDoc = new Document();
Style dstStyle = dstDoc.Styles.Add(StyleType.Character, "My style");
dstStyle.Font.Name = "Calibri";
DocumentBuilder dstBuilder = new DocumentBuilder(dstDoc);
dstBuilder.Font.Style = dstStyle;
dstBuilder.Writeln("Destination document text.");

// Import the Section from the destination document into the source document, causing a style name collision.
// If we use destination styles, then the imported source text with the same style name
// as destination text will adopt the destination style.
Section importedSection = (Section)dstDoc.ImportNode(srcDoc.FirstSection, true, ImportFormatMode.UseDestinationStyles);
Assert.That(importedSection.Body.FirstParagraph.Runs[0].Font.Name, Is.EqualTo(dstStyle.Font.Name));
Assert.That(importedSection.Body.FirstParagraph.Runs[0].Font.StyleName, Is.EqualTo(dstStyle.Name));

// If we use ImportFormatMode.KeepDifferentStyles, the source style is preserved,
// and the naming clash resolves by adding a suffix.
dstDoc.ImportNode(srcDoc.FirstSection, true, ImportFormatMode.KeepDifferentStyles);
Assert.That(dstDoc.Styles["My style"].Font.Name, Is.EqualTo(dstStyle.Font.Name));
Assert.That(dstDoc.Styles["My style_0"].Font.Name, Is.EqualTo(srcStyle.Font.Name));
```

### See Also

* class [Node](../../node/)
* enum [ImportFormatMode](../../importformatmode/)
* class [DocumentBase](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

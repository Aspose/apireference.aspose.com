---
title: StyleCollection.DefaultParagraphFormat
linktitle: DefaultParagraphFormat
articleTitle: DefaultParagraphFormat
second_title: Aspose.Words for .NET
description: Discover the StyleCollection DefaultParagraphFormat property to easily access and customize your document's default paragraph formatting for enhanced readability.
type: docs
weight: 30
url: /net/aspose.words/stylecollection/defaultparagraphformat/
---
## StyleCollection.DefaultParagraphFormat property

Gets document default paragraph formatting.

```csharp
public ParagraphFormat DefaultParagraphFormat { get; }
```

## Remarks

Note that document-wide defaults were introduced in Microsoft Word 2007 and are fully supported in OOXML formats (Docx) only. Earlier document formats have no support for document default paragraph formatting.

## Examples

Shows how to add a Style to a document's styles collection.

```csharp
Document doc = new Document();

StyleCollection styles = doc.Styles;
// Set default parameters for new styles that we may later add to this collection.
styles.DefaultFont.Name = "Courier New";
// If we add a style of the "StyleType.Paragraph", the collection will apply the values of
// its "DefaultParagraphFormat" property to the style's "ParagraphFormat" property.
styles.DefaultParagraphFormat.FirstLineIndent = 15.0;
// Add a style, and then verify that it has the default settings.
styles.Add(StyleType.Paragraph, "MyStyle");

Assert.That(styles[4].Font.Name, Is.EqualTo("Courier New"));
Assert.That(styles["MyStyle"].ParagraphFormat.FirstLineIndent, Is.EqualTo(15.0));
```

### See Also

* class [ParagraphFormat](../../paragraphformat/)
* class [StyleCollection](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

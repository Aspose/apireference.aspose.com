---
title: CleanupOptions.DuplicateStyle
linktitle: DuplicateStyle
articleTitle: DuplicateStyle
second_title: Aspose.Words for .NET
description: Optimize your documents with CleanupOptions DuplicateStyle property—easily remove duplicate styles for cleaner, more efficient formatting. Default is false.
type: docs
weight: 20
url: /net/aspose.words/cleanupoptions/duplicatestyle/
---
## CleanupOptions.DuplicateStyle property

Gets/sets a flag indicating whether duplicate styles should be removed from document. Default value is `false`.

```csharp
public bool DuplicateStyle { get; set; }
```

## Examples

Shows how to remove duplicated styles from the document.

```csharp
Document doc = new Document();

// Add two styles to the document with identical properties,
// but different names. The second style is considered a duplicate of the first.
Style myStyle = doc.Styles.Add(StyleType.Paragraph, "MyStyle1");
myStyle.Font.Size = 14;
myStyle.Font.Name = "Courier New";
myStyle.Font.Color = Color.Blue;

Style duplicateStyle = doc.Styles.Add(StyleType.Paragraph, "MyStyle2");
duplicateStyle.Font.Size = 14;
duplicateStyle.Font.Name = "Courier New";
duplicateStyle.Font.Color = Color.Blue;

Assert.AreEqual(6, doc.Styles.Count);

// Apply both styles to different paragraphs within the document.
DocumentBuilder builder = new DocumentBuilder(doc);
builder.ParagraphFormat.StyleName = myStyle.Name;
builder.Writeln("Hello world!");

builder.ParagraphFormat.StyleName = duplicateStyle.Name;
builder.Writeln("Hello again!");

ParagraphCollection paragraphs = doc.FirstSection.Body.Paragraphs;

Assert.AreEqual(myStyle, paragraphs[0].ParagraphFormat.Style);
Assert.AreEqual(duplicateStyle, paragraphs[1].ParagraphFormat.Style);

// Configure a CleanOptions object, then call the Cleanup method to substitute all duplicate styles
// with the original and remove the duplicates from the document.
CleanupOptions cleanupOptions = new CleanupOptions { DuplicateStyle = true };

doc.Cleanup(cleanupOptions);

Assert.AreEqual(5, doc.Styles.Count);
Assert.AreEqual(myStyle, paragraphs[0].ParagraphFormat.Style);
Assert.AreEqual(myStyle, paragraphs[1].ParagraphFormat.Style);
```

### See Also

* class [CleanupOptions](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

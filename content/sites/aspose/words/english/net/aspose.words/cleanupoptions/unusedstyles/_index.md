---
title: CleanupOptions.UnusedStyles
linktitle: UnusedStyles
articleTitle: UnusedStyles
second_title: Aspose.Words for .NET
description: Optimize your documents with CleanupOptions' UnusedStyles property, ensuring unused styles are removed for cleaner, faster-loading content. Default - true.
type: docs
weight: 50
url: /net/aspose.words/cleanupoptions/unusedstyles/
---
## CleanupOptions.UnusedStyles property

Specifies whether unused styles should be removed from document. Default value is `true`.

```csharp
public bool UnusedStyles { get; set; }
```

## Examples

Shows how to remove all unused custom styles from a document.

```csharp
Document doc = new Document();

doc.Styles.Add(StyleType.List, "MyListStyle1");
doc.Styles.Add(StyleType.List, "MyListStyle2");
doc.Styles.Add(StyleType.Character, "MyParagraphStyle1");
doc.Styles.Add(StyleType.Character, "MyParagraphStyle2");

// Combined with the built-in styles, the document now has eight styles.
// A custom style is marked as "used" while there is any text within the document
// formatted in that style. This means that the 4 styles we added are currently unused.
Assert.That(doc.Styles.Count, Is.EqualTo(8));

// Apply a custom character style, and then a custom list style. Doing so will mark them as "used".
DocumentBuilder builder = new DocumentBuilder(doc);
builder.Font.Style = doc.Styles["MyParagraphStyle1"];
builder.Writeln("Hello world!");

Aspose.Words.Lists.List list = doc.Lists.Add(doc.Styles["MyListStyle1"]);
builder.ListFormat.List = list;
builder.Writeln("Item 1");
builder.Writeln("Item 2");

// Now, there is one unused character style and one unused list style.
// The Cleanup() method, when configured with a CleanupOptions object, can target unused styles and remove them.
CleanupOptions cleanupOptions = new CleanupOptions
{
    UnusedLists = true, UnusedStyles = true, UnusedBuiltinStyles = true
};

doc.Cleanup(cleanupOptions);

Assert.That(doc.Styles.Count, Is.EqualTo(4));

// Removing every node that a custom style is applied to marks it as "unused" again. 
// Rerun the Cleanup method to remove them.
doc.FirstSection.Body.RemoveAllChildren();
doc.Cleanup(cleanupOptions);

Assert.That(doc.Styles.Count, Is.EqualTo(2));
```

### See Also

* class [CleanupOptions](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

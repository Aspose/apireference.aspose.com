---
title: StyleCollection.AddCopy
linktitle: AddCopy
articleTitle: AddCopy
second_title: Aspose.Words for .NET
description: Effortlessly copy styles with the StyleCollection AddCopy method. Enhance your design workflow and streamline your style management today!
type: docs
weight: 70
url: /net/aspose.words/stylecollection/addcopy/
---
## StyleCollection.AddCopy method

Copies a style into this collection.

```csharp
public Style AddCopy(Style style)
```

| Parameter | Type | Description |
| --- | --- | --- |
| style | Style | Style to be copied. |

### Return Value

Copied style ready for usage.

## Remarks

Style to be copied can belong to the same document as well as to different document.

Linked style is copied.

This method does doesn't copy base styles.

If collection already contains a style with the same name, then new name is automatically generated by adding "_number" suffix starting from 0 e.g. "Normal_0", "Heading 1_1" etc. Use [`Name`](../../style/name/) setter for changing the name of the imported style.

## Examples

Shows how to import a style from one document into a different document.

```csharp
Document srcDoc = new Document();

// Create a custom style for the source document.
Style srcStyle = srcDoc.Styles.Add(StyleType.Paragraph, "MyStyle");
srcStyle.Font.Color = Color.Red;

// Import the source document's custom style into the destination document.
Document dstDoc = new Document();
Style newStyle = dstDoc.Styles.AddCopy(srcStyle);

// The imported style has an appearance identical to its source style.
Assert.That(newStyle.Name, Is.EqualTo("MyStyle"));
Assert.That(newStyle.Font.Color.ToArgb(), Is.EqualTo(Color.Red.ToArgb()));
```

Shows how to clone a document's style.

```csharp
Document doc = new Document();

// The AddCopy method creates a copy of the specified style and
// automatically generates a new name for the style, such as "Heading 1_0".
Style newStyle = doc.Styles.AddCopy(doc.Styles["Heading 1"]);

// Use the style's "Name" property to change the style's identifying name.
newStyle.Name = "My Heading 1";

// Our document now has two identical looking styles with different names.
// Changing settings of one of the styles do not affect the other.
newStyle.Font.Color = Color.Red;

Assert.That(newStyle.Name, Is.EqualTo("My Heading 1"));
Assert.That(doc.Styles["Heading 1"].Name, Is.EqualTo("Heading 1"));

Assert.That(newStyle.Type, Is.EqualTo(doc.Styles["Heading 1"].Type));
Assert.That(newStyle.Font.Name, Is.EqualTo(doc.Styles["Heading 1"].Font.Name));
Assert.That(newStyle.Font.Size, Is.EqualTo(doc.Styles["Heading 1"].Font.Size));
Assert.That(newStyle.Font.Color, Is.Not.EqualTo(doc.Styles["Heading 1"].Font.Color));
```

### See Also

* class [Style](../../style/)
* class [StyleCollection](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

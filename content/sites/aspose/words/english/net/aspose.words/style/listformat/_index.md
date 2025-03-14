---
title: Style.ListFormat
linktitle: ListFormat
articleTitle: ListFormat
second_title: Aspose.Words for .NET
description: Discover how to customize the ListFormat property for paragraph styles, enhancing your document's organization and visual appeal.
type: docs
weight: 110
url: /net/aspose.words/style/listformat/
---
## Style.ListFormat property

Provides access to the list formatting properties of a paragraph style.

```csharp
public ListFormat ListFormat { get; }
```

## Remarks

This property is only valid for paragraph styles. For other style types this property returns `null`.

## Examples

Shows how to create and use a paragraph style with list formatting.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Create a custom paragraph style.
Style style = doc.Styles.Add(StyleType.Paragraph, "MyStyle1");
style.Font.Size = 24;
style.Font.Name = "Verdana";
style.ParagraphFormat.SpaceAfter = 12;

// Create a list and make sure the paragraphs that use this style will use this list.
style.ListFormat.List = doc.Lists.Add(ListTemplate.BulletDefault);
style.ListFormat.ListLevelNumber = 0;

// Apply the paragraph style to the document builder's current paragraph, and then add some text.
builder.ParagraphFormat.Style = style;
builder.Writeln("Hello World: MyStyle1, bulleted list.");

// Change the document builder's style to one that has no list formatting and write another paragraph.
builder.ParagraphFormat.Style = doc.Styles["Normal"];
builder.Writeln("Hello World: Normal.");

builder.Document.Save(ArtifactsDir + "Styles.ParagraphStyleBulletedList.docx");
```

### See Also

* class [ListFormat](../../../aspose.words.lists/listformat/)
* class [Style](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

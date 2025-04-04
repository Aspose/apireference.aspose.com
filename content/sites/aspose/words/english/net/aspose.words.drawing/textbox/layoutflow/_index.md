---
title: TextBox.LayoutFlow
linktitle: LayoutFlow
articleTitle: LayoutFlow
second_title: Aspose.Words for .NET
description: Discover how the TextBox LayoutFlow property enhances text layout in shapes, improving design flexibility and readability for your projects.
type: docs
weight: 60
url: /net/aspose.words.drawing/textbox/layoutflow/
---
## TextBox.LayoutFlow property

Determines the flow of the text layout in a shape.

```csharp
public LayoutFlow LayoutFlow { get; set; }
```

## Remarks

The default value is Horizontal.

## Examples

Shows how to set the orientation of text inside a text box.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

Shape textBoxShape = builder.InsertShape(ShapeType.TextBox, 150, 100);
TextBox textBox = textBoxShape.TextBox;

// Move the document builder to inside the TextBox and add text.
builder.MoveTo(textBoxShape.LastParagraph);
builder.Writeln("Hello world!");
builder.Write("Hello again!");

// Set the "LayoutFlow" property to set an orientation for the text contents of this text box.
textBox.LayoutFlow = layoutFlow;

doc.Save(ArtifactsDir + "Shape.TextBoxLayoutFlow.docx");
```

### See Also

* enum [LayoutFlow](../../layoutflow/)
* class [TextBox](../)
* namespace [Aspose.Words.Drawing](../../../aspose.words.drawing/)
* assembly [Aspose.Words](../../../)

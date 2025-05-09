---
title: Font.Style
linktitle: Style
articleTitle: Style
second_title: Aspose.Words for .NET
description: Discover how to use the Font Style property to customize character styles in your formatting for enhanced text appeal and readability.
type: docs
weight: 410
url: /net/aspose.words/font/style/
---
## Font.Style property

Gets or sets the character style applied to this formatting.

```csharp
public Style Style { get; set; }
```

## Examples

Applies a double underline to all runs in a document that are formatted with custom character styles.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Insert a custom style and apply it to text created using a document builder.
Style style = doc.Styles.Add(StyleType.Character, "MyStyle");
style.Font.Color = Color.Red;
style.Font.Name = "Courier New";

builder.Font.StyleName = "MyStyle";
builder.Write("This text is in a custom style.");

// Iterate over every run and add a double underline to every custom style.
foreach (Run run in doc.GetChildNodes(NodeType.Run, true))
{
    Style charStyle = run.Font.Style;

    if (!charStyle.BuiltIn)
        run.Font.Underline = Underline.Double;
}

doc.Save(ArtifactsDir + "Font.Style.docx");
```

### See Also

* class [Style](../../style/)
* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)

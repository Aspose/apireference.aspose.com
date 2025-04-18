---
title: Font.Color
linktitle: Color
articleTitle: Color
second_title: Aspose.Words for .NET
description: Discover the Font Color property to easily customize text colors in your designs. Enhance readability and aesthetics with vibrant, eye-catching hues!
type: docs
weight: 70
url: /net/aspose.words/font/color/
---
## Font.Color property

Gets or sets the color of the font.

```csharp
public Color Color { get; set; }
```

## Examples

Shows how to insert formatted text using DocumentBuilder.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

// Specify font formatting, then add text.
Aspose.Words.Font font = builder.Font;
font.Size = 16;
font.Bold = true;
font.Color = Color.Blue;
font.Name = "Courier New";
font.Underline = Underline.Dash;

builder.Write("Hello world!");
```

Shows how to insert a hyperlink field.

```csharp
Document doc = new Document();
DocumentBuilder builder = new DocumentBuilder(doc);

builder.Write("For more information, please visit the ");

// Insert a hyperlink and emphasize it with custom formatting.
// The hyperlink will be a clickable piece of text which will take us to the location specified in the URL.
builder.Font.Color = Color.Blue;
builder.Font.Underline = Underline.Single;
builder.InsertHyperlink("Google website", "https://www.google.com", false);
builder.Font.ClearFormatting();
builder.Writeln(".");

// Ctrl + left clicking the link in the text in Microsoft Word will take us to the URL via a new web browser window.
doc.Save(ArtifactsDir + "DocumentBuilder.InsertHyperlink.docx");
```

### See Also

* class [Font](../)
* namespace [Aspose.Words](../../../aspose.words/)
* assembly [Aspose.Words](../../../)
